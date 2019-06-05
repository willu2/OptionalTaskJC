import java.time.LocalTime;

public class PhoneEntity {
    int id;
    private String name;
    private String sourname;
    private String patronymic;
    private String adress;
    private long creditCardNum;
    private long debet;
    private long credit;

    private LocalTime contryCallsTime;
    private LocalTime distanceCallsTime;

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
        this.contryCallsTime = contryTime;
        this.distanceCallsTime = distanceCallsTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourname() {
        return sourname;
    }

    public void setSourname(String sourname) {
        this.sourname = sourname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public long getDebet() {
        return debet;
    }

    public void setDebet(long debet) {
        this.debet = debet;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public LocalTime getContryCallsTime() {
        return contryCallsTime;
    }

    public void setContryCallsTime(LocalTime contryCallsTime) {
        this.contryCallsTime = contryCallsTime;
    }

    public LocalTime getDistanceCallsTime() {
        return distanceCallsTime;
    }

    public void setDistanceCallsTime(LocalTime distanceCallsTime) {
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
                ", contryTime=" + contryCallsTime +
                ", distanceCallsTime=" + distanceCallsTime +
                '}';
    }
}
