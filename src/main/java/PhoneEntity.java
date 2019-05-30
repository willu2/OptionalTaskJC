import java.util.concurrent.TimeUnit;

public class PhoneEntity {
    int id;
    String name;
    String sourname;
    String patronymic;
    String adress;
    long creditCardNum;
    long debet;
    long credit;
    TimeUnit contryTime;
    TimeUnit distanceCallsTime;

    public PhoneEntity(String adress) {
        this.adress = adress;
    }

    public PhoneEntity(String name, String sourname, String patronymic) {
        this.name = name;
        this.sourname = sourname;
        this.patronymic = patronymic;
    }

    public PhoneEntity(long creditCardNum, long debet, long credit) {
        this.creditCardNum = creditCardNum;
        this.debet = debet;
        this.credit = credit;
    }

    public PhoneEntity(TimeUnit contryTime, TimeUnit distanceCallsTime) {
        this.contryTime = contryTime;
        this.distanceCallsTime = distanceCallsTime;
    }









    @Override
    public String toString() {
        return "PhoneEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourname='" + sourname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", creditCardNum=" + creditCardNum +
                ", debet=" + debet +
                ", credit=" + credit +
                ", contryTime=" + contryTime +
                ", distanceCallsTime=" + distanceCallsTime +
                '}';
    }
}
