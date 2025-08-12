package Head02_OOPprogramming.topic02_OO4principles.ex4;

public class BusinessUse extends  User{
    private String email;
    private String companyName;

    public BusinessUse(String id, String name, String email, String companyName){
        super(id, name);
        this.email =  email;
        this.companyName = companyName;
    }
    //부모 메서드 변경 과 super 확인
    @Override
    public void printUserInfo(){
        super.printUserInfo();
        System.out.println("회사 이메일: " + email);
        System.out.println("회사 이름: " + companyName);
    }
}
