public class TestAccount {
    public static void main(String[] args) {
        // Account creation
        Account acc1 = new Account("0001", "Simba", 5000);
        Account acc2 = new Account("0002", "Nala", 4000);

        // Display Balances of both accounts
        System.out.println("Balances: ");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());

        // Transfering 1000 from Account 1 to Account 2
        acc1.transferTo(acc2, 1000);

        // Display Balances of both accounts after transfer
        System.out.println("Transferring $1000 from Account 1 to Account 2");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());
    }
}
