import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{2,13,90,52,4,36,8,40};
        System.out.println(Arrays.stream(integers).filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compareTo));
    }
}