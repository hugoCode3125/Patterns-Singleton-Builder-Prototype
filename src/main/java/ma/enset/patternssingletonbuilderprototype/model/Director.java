package ma.enset.patternssingletonbuilderprototype.model;

public class Director {
    public static BankAccount.AccountBuilder AccountBuilder() {
        return new BankAccount.AccountBuilder(new BankAccount());
    }
}
