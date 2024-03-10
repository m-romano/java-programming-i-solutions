
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account jesseAccount = new Account("jesse", 100.0);
        jesseAccount.deposit(20.0);
        System.out.println(jesseAccount.toString());
    }
}
