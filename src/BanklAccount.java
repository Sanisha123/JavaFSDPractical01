abstract class BankAccount {
    double bal;
    BankAccount(double b){bal=b;}
    abstract double interest();
}
class Savings extends BankAccount {
    Savings(double b){super(b);}
    double interest(){return bal*0.05;}
    public static void main(String[] args){
        BankAccount a=new Savings(20000);
        System.out.println("Interest = "+a.interest());
    }
}
