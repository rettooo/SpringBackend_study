package Head02_OOPprogramming.topic04_Encapsulation.practice;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId){
        this.accountId = accountId;
        this.balance = 0; // 현재 잔액
    }
    //getter
    //읽기 전용 메서드 getter
    public String getAccountId(){
        return accountId;
    }
    public double getBalance(){
        return balance;
    }
    //쓰기 메서드 : 내부 검증 포함
    public void deposit(double amount){
        if (amount <=0) throw new IllegalArgumentException("0보다 커야함");
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <=0 || balance < amount )  throw new IllegalStateException("출금 오륲");
        balance -= amount;
    }


}
