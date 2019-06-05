public class PhoneEntity implements Comparable<PhoneEntity>{
    private int id;
    private String name;        //done
    private String sourname;    //done
    private String patronymic;  //done
    private String adress;      //done
    private String creditCardNum; //done
    private int debet;      // <----money
    private int credit;     // money---->

    private String contryCallsTime;  //done
    private String distanceCallsTime;  //done

    private boolean abroad = false;

    public PhoneEntity(String adress) {
        this.adress = adress;
    }

    public PhoneEntity(String name, String sourname, String patronymic) {
        this.setId(++id);
        this.name = name;
        this.sourname = sourname;
        this.patronymic = patronymic;
    }

    public PhoneEntity(String creditCardNum, int debet, int credit) {
        this.creditCardNum = creditCardNum;
        this.debet = debet;
        this.credit = credit;
    }

    public PhoneEntity(String contryTime, String distanceCallsTime) {
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

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public double getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getContryCallsTime() {
        return contryCallsTime;
    }

    public void setContryCallsTime(String contryCallsTime) {
        this.contryCallsTime = contryCallsTime;
    }

    public String getDistanceCallsTime() {
        return distanceCallsTime;
    }

    public void setDistanceCallsTime(String distanceCallsTime) {
        this.distanceCallsTime = distanceCallsTime;
    }

    public boolean isAbroad() {
        return abroad;
    }

    public void setAbroad(boolean abroad) {
        this.abroad = abroad;
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

    @Override
    public int compareTo(PhoneEntity o) {
        return getName().compareTo(o.getName());
    }
}
