import java.util.ArrayList;
import java.util.Random;

public class removevenum {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arr.add(rnd.nextInt(100));
        }
        System.out.println(arr);
        arr = removeEvenNumbers(arr);
        System.out.println(arr);
    }

    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> array){
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int num: array) {
            if (num%2 != 0) {
                resultArray.add(num);
            }
        }
        return resultArray;
    }
}