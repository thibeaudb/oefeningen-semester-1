import java.util.Random;
class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private String generateAccountNumber() {
        String accountNumber = "BE";
        Random random = new Random();
        int randomDigits = 1000000000 + random.nextInt(900000000);
        return "BE" + randomDigits;
    }

    public void openAccount() {
        this.accountNumber = generateAccountNumber();
        this.balance = 0;
        System.out.println("Je bankrekening is geoepend!.");
        System.out.println("Je rekeningnummer is: " + this.accountNumber);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Storting van €" + amount + " is succesvol verwerkt. Nieuw saldo: €" + this.balance);
        } else {
            System.out.println("Ongeldig stortingsbedrag. Bedrag moet boven 0 zijn.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
        }
    }
}