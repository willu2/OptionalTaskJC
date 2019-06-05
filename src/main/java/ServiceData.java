import randgenerators.CreditCardGen;
import randgenerators.RandomGenerator;

import java.util.ArrayList;
import java.util.Collections;

public class ServiceData {

    private ArrayList<PhoneEntity> clients;
    private RandomGenerator gen;
    private NamesGenerator namesGen;

    PhoneEntity client;
    public static int id = 1;

    public ServiceData() {
        clients = new ArrayList<PhoneEntity>();
        gen = new RandomGenerator();
        namesGen = new NamesGenerator();
        fullDb();
    }

    private void createClient(){
        client = new PhoneEntity(namesGen.getName(), namesGen.getLastName(), namesGen.getPatronymic());
        client.setId(id++);
        addAdress();
        addCard();
        addDebitCredit();
        addCountryTime();
        addDistanceTime();
        addAbroad();
        clients.add(client);
    }

    private void addAdress(){
        client.setAdress(gen.generStrit(12));
    }

    private void addCard(){
        client.setCreditCardNum(CreditCardGen.genMasterCardNumber());
    }

    private void addDebitCredit(){
        client.setDebet(gen.generDebit(true));
        client.setCredit(gen.generDebit(false));
    }

    private void addCountryTime(){
        client.setContryCallsTime(gen.generateTime());
    }

    private void addDistanceTime(){
        client.setDistanceCallsTime(gen.generateTime());
    }

    private void addAbroad(){
        client.setAbroad(gen.randBool());
    }

    private void fullDb(){
        for (int i = 0; i < 40; i++) {
            createClient();
        }
    }

    public void clientVisor(){
        for(PhoneEntity client : clients){
            System.out.println(" ");
            System.out.println("Id " + client.getId());
            System.out.println("Name " + client.getName());
            System.out.println("Sourname " + client.getSourname());
            System.out.println("Patronymic " + client.getPatronymic());
            System.out.println("Debet " + client.getDebet() + " USD");
            System.out.println("Credit " + client.getCredit() + " USD");
            System.out.println("CardNum " + client.getCreditCardNum());
            System.out.println("ContryTime " + client.getContryCallsTime() + " min");
            System.out.println("DistanceTime " + client.getDistanceCallsTime() + " min");
            System.out.println("--------------");
            System.out.println("**************");
        }
    }

    public void sortByName(){
        Collections.sort(clients);
        for(PhoneEntity client : clients){
            System.out.println(" ");
            System.out.println("Id " + client.getId());
            System.out.println("Name " + client.getName());
            System.out.println("Sourname " + client.getSourname());
            System.out.println("Patronymic " + client.getPatronymic());
            System.out.println("Debet " + client.getDebet() + " USD");
            System.out.println("Credit " + client.getCredit() + " USD");
            System.out.println("CardNum " + client.getCreditCardNum());
            System.out.println("ContryTime " + client.getContryCallsTime() + " min");
            System.out.println("DistanceTime " + client.getDistanceCallsTime() + " min");
            System.out.println("--------------");
            System.out.println("**************");
        }
    }

    public void abroadCall(){
        for(PhoneEntity client : clients){
            if(client.isAbroad()){
            System.out.println(" ");
            System.out.println("Id " + client.getId());
            System.out.println("Name " + client.getName());
            System.out.println("Sourname " + client.getSourname());
            System.out.println("Patronymic " + client.getPatronymic());
            System.out.println("Debet " + client.getDebet() + " USD");
            System.out.println("Credit " + client.getCredit() + " USD");
            System.out.println("CardNum " + client.getCreditCardNum());
            System.out.println("ContryTime " + client.getContryCallsTime() + " min");
            System.out.println("DistanceTime " + client.getDistanceCallsTime() + " min");
            System.out.println("--------------");
            System.out.println("**************");
            }
        }
    }
}
