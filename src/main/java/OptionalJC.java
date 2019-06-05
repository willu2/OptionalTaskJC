import randgenerators.RandomCreditCardNumberGenerator;
import randgenerators.RandomGenerator;

public class OptionalJC {
    public static void main(String[] args) {

        RandomGenerator generator = new RandomGenerator();
       // generator.generateRandTime();

       // System.out.println(generator.randomStritName(12));


        RandomCreditCardNumberGenerator randomCred = new RandomCreditCardNumberGenerator();

        String creditcardnumber = RandomCreditCardNumberGenerator.generateMasterCardNumber();
            System.out.println(creditcardnumber
                    + ":"
                    + (RandomCreditCardNumberGenerator.isValidCreditCardNumber(creditcardnumber) ? "valid"
                    : "invalid"));
        }

    }

