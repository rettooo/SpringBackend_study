package Head02_OOPprogramming.topic02_OO4principles.ex4;

public class PersonalUser  extends User{
    private String email;

    public PersonalUser(String id, String name, String email){
        super(id, name);
        this.email = email;
    }
    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " +email);
    }
}
