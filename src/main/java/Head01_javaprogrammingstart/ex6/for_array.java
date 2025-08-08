package Head01_javaprogrammingstart.ex6;

public class for_array {
    //인덱스를 for문으로 지정
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        //일반 for문 -> 인덱스로 접근
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println();

        //향상된 for문
        for (int num: nums){
            System.out.println(num);
        }

        System.out.println();

        //String
        String[] animals = {"Cat", "Dog", "Bird", "Cat", "Dog", "Bird"};
        for(String animal: animals){
            System.out.println(animal);
        }
        System.out.println();
        for (int i =0 ; i < animals.length; i++){
            System.out.println(animals[i]);
        }
    }
}
