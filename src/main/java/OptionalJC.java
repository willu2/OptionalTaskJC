import randgenerators.RandomGenerator;

public class OptionalJC {
    public static void main(String[] args) {

        RandomGenerator generator = new RandomGenerator();
       // generator.generateRandTime();

        //System.out.println(generator.generateRandStritName(12));


       /* CreditCardGen randomCred = new CreditCardGen();

        String creditcardnumber = CreditCardGen.generateMasterCardNumber();
            System.out.println(creditcardnumber
                    + ":"
                    + (CreditCardGen.isValidCreditCardNumber(creditcardnumber) ? "valid"
                    : "invalid"));*/

       ServiceData data  = new ServiceData();
       //data.clientVisor();
       //data.sortByName();
       data.abroadCall();
        }
    }

