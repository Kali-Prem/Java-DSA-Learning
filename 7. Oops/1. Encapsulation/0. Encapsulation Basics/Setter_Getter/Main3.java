public class Main3 {
    public static void main(String[] args) {
        BankAccount s1 = new BankAccount();
        s1.deposit(1000);
        s1.getBalance();
        System.out.print(s1.getBalance());
    }
}
class BankAccount {
    private int balance = 1000;   //Private data,bahar se direct access nahi

    //setter
    public void deposit(int amount){
        balance += amount;   //Sirf method ke through access milega
    }

    //getter
    public int getBalance(){
        return balance;
    }
}