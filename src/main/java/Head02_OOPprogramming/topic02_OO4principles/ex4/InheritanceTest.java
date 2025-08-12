package Head02_OOPprogramming.topic02_OO4principles.ex4;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("T56", "gkdud", "gjkdlkgj98@naver.com");
        u.printUserInfo();

        User b = new BusinessUse("U002", "Big show", "bigshow@gmail.com", "WWE");
        b.printUserInfo();
    }
}
