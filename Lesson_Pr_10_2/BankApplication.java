package Lesson_Pr_10_2;

import java.util.ArrayList;

public class BankApplication implements Comparable <BankApplication>{
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account a) { // Добавляет новый объект Account
        accounts.add(a);
    }

    void removeAccount(int i) { // Удаляет объект со списка под индексом i
        accounts.remove(i);
    }

    Account getMaxAccount() { // Возвращает объект Account у кого самый высокий баланс
        if (accounts.size() > 0) {
            int max_i = 0;
            double max_balance = accounts.get(max_i).getBalance();
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getBalance() > max_balance)
                    max_balance = accounts.get(i).getBalance();
                max_i = i;
            }
            return accounts.get(max_i);
        }
        return null;
    }

    double getAverageBalance() { // Возвращает среднее значение баланса пользователей
        return getTotalBalance() / accounts.size();
    }

    double getTotalBalance() { // Возвращает сумму баланса пользователей
        double sum = 0;
        for (int i=0; i<accounts.size(); i++){
            sum = sum + accounts.get(i).getBalance();
        }
        return sum;
    }

    int totalAccounts() { // Возвращает количество пользователей
        return accounts.size();
    }

    String getBankData() { // Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
        return "Имя банка: " + name + ", Количество счетов: " + totalAccounts() + ", Сумма баланса: " + getTotalBalance() + ", Среднее значение баланса: " + getAverageBalance();
    }

    @Override
    public int compareTo(BankApplication o) {
        return (int) (o.getAverageBalance() * 1000000) - (int) (this.getAverageBalance() * 1000000);
    }
}