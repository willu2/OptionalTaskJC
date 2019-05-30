import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class RandomGenerator {

    public RandomGenerator() {
    }

    public void generateRandTime(){
    Random generator = new Random(599999);
    /*LocalTime time = LocalTime.MIN.plusSeconds(generator.nextLong());
        System.out.println(time);*/

        for (int i = 0; i < 4; i++) {
            LocalDateTime time = LocalDateTime.of(LocalDate.now(),
                    LocalTime.of(generator.nextInt(24), generator.nextInt(60),
                            generator.nextInt(60), generator.nextInt(999999999 + 1)));
            System.out.println(time);
        }
    }

    public void generateRandAdrress(){
        String adressName;
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
    }


    public String randomStritName(int length) {
        Random random = new Random();
        int number = 0;
        final int alphabetLength = 'Z' - 'A' + 1;
        StringBuilder result = new StringBuilder(length);
        while (result.length() < length) {
            final char charCaseBit = (char) (random.nextInt(2) << 5);
            result.append((char) (charCaseBit | ('A' + random.nextInt(alphabetLength))));
        }
        number = random.nextInt(400);
        return result.toString() + " №:" + number;
    }
}
