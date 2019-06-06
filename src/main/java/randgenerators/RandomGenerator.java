package randgenerators;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class RandomGenerator {

    private final String timePattern = "HH:mm";
    private final int hoursLimit = 24;

    public RandomGenerator() {
    }

    public String generateTime(){  //generate random calls time
    Random generator = new Random(/*599999*/);
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter formatterMin = DateTimeFormatter.ofPattern(timePattern);


            LocalDateTime time = LocalDateTime.of(LocalDate.now(),
                    LocalTime.of(generator.nextInt(hoursLimit), generator.nextInt(60),
                            generator.nextInt(60), generator.nextInt(999999999 + 1)));

        return time.format(formatterMin);
    }

    public String generStrit(int length) {  //generate random strit name
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

    public int generDebit(boolean debit) { //and credit (false)
        int money;
        Random generator = new Random();
        if(debit){
            money = generator.nextInt(5000);
        }else {
            money = generator.nextInt(3500);
        }
        return money;
    }

    public boolean randBool(){  //return random bool value
        Random r = new Random();
        return r.nextBoolean();
    }
}
