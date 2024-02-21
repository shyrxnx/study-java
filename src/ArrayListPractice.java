import java.util.ArrayList;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(0, 11);
        array1.add(1, 22);
        array1.add(2, 33);
        array1.add(3, 44);
        System.out.println("array1 contents: " + array1);

        array1.remove(2);
        System.out.println("array1 contents: " + array1);

        //Get the size of the ArrayList
        System.out.println(array1.size());
    }
}
