package Head02_OOPprogramming.topic02_OO4principles.ex4;

public class User {
    protected String userId;
    protected String name;

    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
    }
    public void printUserInfo(){
        System.out.println("ID: " + userId + ", 이름: " + name);
    }

}
