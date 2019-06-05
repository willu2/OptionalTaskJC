import randgenerators.CreditCardGen;
import randgenerators.RandomGenerator;

import java.util.ArrayList;

public class ServiceData {

    private ArrayList clients;
    private RandomGenerator gen;
    private NamesGenerator namesGen;
    private CreditCardGen creditCardGen;

    PhoneEntity client;

    public ServiceData() {
        clients = new ArrayList<PhoneEntity>();
        gen = new RandomGenerator();
        namesGen = new NamesGenerator();
    }

    private void createClient(){
        client = new PhoneEntity(namesGen.getName(), namesGen.getLastName(), namesGen.getPatronymic());
        addAdress();
        addCard();
        addDebitCredit();
    }

    private void addAdress(){
        client.setAdress(gen.generStrit(10));
    }

    private void addCard(){
        client.setCreditCardNum(CreditCardGen.genMasterCardNumber());
    }

    private void addDebitCredit(){
        client.setDebet(gen.generDebit(true));
        client.setCredit(gen.generDebit(false));
    }


}
