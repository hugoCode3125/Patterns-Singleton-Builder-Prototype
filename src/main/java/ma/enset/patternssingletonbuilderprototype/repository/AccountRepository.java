package ma.enset.patternssingletonbuilderprototype.repository;

import ma.enset.patternssingletonbuilderprototype.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
    BankAccount save(BankAccount account);
    Optional<BankAccount> getAccountById(Long accountId);
    List<BankAccount> findAll();
    List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);
    BankAccount update(BankAccount account);
    void deleteById(Long accountId);
}
