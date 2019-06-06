package builders;

import entity.PhoneEntity;
import menu.DisplayDataFormat;
import randgenerators.CreditCardGen;
import randgenerators.NamesGenerator;
import randgenerators.RandomGenerator;

import java.util.ArrayList;

public class ServiceData {

    private ArrayList<PhoneEntity> clients;  //list with clients
    private RandomGenerator gen;
    private NamesGenerator namesGen;
    private PhoneEntity client;

    public static int id = 1;

    public ServiceData() {
        clients = new ArrayList<PhoneEntity>();
        gen = new RandomGenerator();
        namesGen = new NamesGenerator();
        fullDb();
    }

    private void fullDb(){
        for (int i = 0; i < 40; i++) {
            createClient();
        }
    }

    private void createClient(){  //create client automaticaly with random data
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
        client.setAbroadCallsTime(gen.generateTime());
    }

    private void addAbroad(){
        client.setAbroad(gen.randBool());
    }

    public void clientVisor(){
        DisplayDataFormat.clientVisor(clients);
    }

    public void sortByName(){
        DisplayDataFormat.sortByName(clients);
    }

    public void abroadCall(){
        DisplayDataFormat.abroadCall(clients);
    }
}
