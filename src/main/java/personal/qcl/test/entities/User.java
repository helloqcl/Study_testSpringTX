package personal.qcl.test.entities;

public class User {
    private int uId;
    private boolean uSex;
    private  String uName;
    private String uPhone;
    private String uAddress;
    private double uMoney;

    public User() {
    }

    public User(int uId, boolean uSex, String uName, String uPhone, String uAddress, double uMoney) {
        this.uId = uId;
        this.uSex = uSex;
        this.uName = uName;
        this.uPhone = uPhone;
        this.uAddress = uAddress;
        this.uMoney = uMoney;
    }

    public User(int uId, boolean uSex, String uName) {
        this.uId = uId;
        this.uSex = uSex;
        this.uName = uName;
    }

    public User(int uId, boolean uSex, String uName, double uMoney) {
        this.uId = uId;
        this.uSex = uSex;
        this.uName = uName;
        this.uMoney = uMoney;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public boolean getuSex() {
        return uSex;
    }

    public void setuSex(boolean uSex) {
        this.uSex = uSex;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public double getuMoney() {
        return uMoney;
    }
    public void setuMoney(double uMoney) {
        this.uMoney = uMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uSex=" + uSex +
                ", uName='" + uName + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uMoney=" + uMoney +
                '}';
    }
}
