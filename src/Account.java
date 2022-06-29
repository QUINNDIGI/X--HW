public class Account {

    public String id;
    public String name;
    public double balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    //Getters
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getBalance() {
        return this.balance;
    }
    //Methods
    public void credit(double amount) {
        this.balance += amount;
    }
    public boolean debit(double amount) {
        if ((this.balance - amount) > 0) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Amount exceeded");
            return false;
        }
    }
    public void transferTo(Account another, double amount) {
        if(this.debit(amount) == true) {
            another.credit(amount);
            System.out.println("Transfer completed");
        }
    }
    public String accountDetails(){
        return (this.name + ", the current balance in your account " + this.id + " is $" + this.balance);
    }

}
