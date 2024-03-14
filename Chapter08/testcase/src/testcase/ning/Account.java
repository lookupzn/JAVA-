package testcase.ning;

public class Account {
    private String name;
    private double amount;
    private String pwd;

    public Account(String name, double amount, String pwd) {
        this.amount = amount;
        this.name = name;
        this.pwd = pwd;
    }

    public Account() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name.length() <= 4) && (name.length() >= 2)) {
            this.name = name;
        } else {
            System.out.println("the format of name is wrong");
            this.name = "User";
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 20) {
            this.amount = amount;
        } else {
            System.out.println("the format of amount is wrong");
            this.amount = 20;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("the format of password is wrong");
            this.name = "***";
        }
    }
}
