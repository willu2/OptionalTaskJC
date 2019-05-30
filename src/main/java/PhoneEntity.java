import java.time.LocalTime;

public class PhoneEntity {
    int id;
    String name;
    String sourname;
    String patronymic;
    String adress;
    long creditCardNum;
    long debet;
    long credit;
    LocalTime contryTime;
    LocalTime distanceCallsTime;

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

    public PhoneEntity(LocalTime contryTime, LocalTime distanceCallsTime) {
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
