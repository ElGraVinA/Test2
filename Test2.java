import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main (String[] args){
        int n = 3;
        int Number[] = {1, 4, n, 10};
        int sum = 0;
        for (int element : Number){
            if (element == n) {
                continue;
            }
            sum += element;
        }
        System.out.println(sum);
    }

}
