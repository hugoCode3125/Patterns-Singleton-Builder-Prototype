package ma.enset.patternssingletonbuilderprototype.repository;

import ma.enset.patternssingletonbuilderprototype.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {

    private Map<Long, BankAccount> accountsMap = new HashMap<>();
    private long accountId = 0;
    @Override
    public BankAccount save(BankAccount account) {
        Long id = ++accountId;
        account.setAccountId(id);
        accountsMap.put(id, account);
        return account;
    }

    @Override
    public Optional<BankAccount> getAccountById(Long accountId) {
        BankAccount account = accountsMap.get(accountId);
        if (account == null) {
            return Optional.empty();
        }
        return Optional.of(account);
    }

    @Override
    public List<BankAccount> findAll() {
        return accountsMap.values().stream().toList();
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return accountsMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount account) {
        accountsMap.put(account.getAccountId(), account);
        return account;
    }

    @Override
    public void deleteById(Long accountId) {
        accountsMap.remove(accountId);
    }

    public  void populateData(){
        for (int i = 0; i < 10; i++) {


        }
    }
}
