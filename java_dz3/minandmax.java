import java.util.*;

public class minandmax {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arr.add(rnd.nextInt(100));
        }
        System.out.println(arr);
        System.out.printf("������������ ������� ������ = %s\n", Collections.max(arr));
        System.out.printf("����������� ������� ������ = %s\n", Collections.min(arr));
        System.out.printf("������� �������������� ������ = %s\n", getAverage(arr) );
    }

    private static Object getAverage(ArrayList<Integer> arr) {
        return arr.stream().mapToInt(a -> a).average().orElse(0);
    }
}

