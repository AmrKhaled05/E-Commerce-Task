public class Customer {
    private String name;
    private String email;
    private int age;
    private String phone;
    private double balance;
    public Customer(String name,String email,int age,String phone,double balance){
        this.name=name;
        this.email=email;
        this.age=age;
        this.phone=phone;
        this.balance=balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public  void payMoney(double amount){
        if (amount>this.balance){
            throw new IllegalArgumentException("Balance value is not sufficient");
        }else{
            balance-=amount;
        }
    }

}