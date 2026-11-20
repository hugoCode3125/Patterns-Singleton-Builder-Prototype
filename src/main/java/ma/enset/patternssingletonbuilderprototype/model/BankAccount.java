package ma.enset.patternssingletonbuilderprototype.model;

public class BankAccount {
    private Long accountId;
    private  double balance;
    private String currency;
    private AccounType accounType;
    private  AccountStatus accountStatus;

    public BankAccount(Long accountId, double balance, String currency, AccounType accounType, AccountStatus accountStatus) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.accounType = accounType;
        this.accountStatus = accountStatus;
    }

    public BankAccount() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccounType getAccounType() {
        return accounType;
    }

    public void setAccounType(AccounType accounType) {
        this.accounType = accounType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", accounType=" + accounType +
                ", accountStatus=" + accountStatus +
                '}';
    }

    public static class AccountBuilder {
        private  BankAccount bankAccount;

        public  AccountBuilder accountId(Long id){
            bankAccount.setAccountId(id);
            return  this;
        }
        public  AccountBuilder cuurency(String cuurency){
            bankAccount.currency = cuurency;
            return  this;
        }
        public  AccountBuilder accounType(AccounType accounType){
            bankAccount.accounType = accounType;
            return  this;
        }
        public  AccountBuilder accountStatus(AccountStatus accountStatus){
            bankAccount.accountStatus = accountStatus;
            return  this;
        }
        public BankAccount build(){
            return bankAccount;
        }
    }
}
