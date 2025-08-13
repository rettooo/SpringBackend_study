package Head07_JCF.ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("Array: " + Arrays.toString(arr));

        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);
        System.out.println("ArrayList: " + list);
        list.remove(Integer.valueOf(20));
        System.out.println("removed 20 -> " + list);

    }
}
