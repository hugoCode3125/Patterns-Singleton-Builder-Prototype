package ma.enset.patternssingletonbuilderprototype;

import ma.enset.patternssingletonbuilderprototype.model.BankAccount;
import ma.enset.patternssingletonbuilderprototype.repository.AccountRepositoryImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
        accountRepository.populateData();
        List<BankAccount> accounts= accountRepository.findAll();
        accounts.forEach(System.out::println);
    }

}
