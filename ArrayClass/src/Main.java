import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(0);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.insert(4);
        numbers.insert(5);
        numbers.insert(5);
        System.out.println("Array:");
        numbers.print();
        numbers.insertAt(5, 2);
        //numbers.removeAt(5);
        System.out.println("Array after inserting:");
        numbers.print();
        //System.out.println("Index of 3: " + numbers.indexOf(7));
        //System.out.println("Largest value: " + numbers.max());
        //System.out.println("Common: " + Arrays.toString(numbers.intersect()));
        numbers.reverse();
        System.out.println("Array after reversing:");
        numbers.print();
    }
}