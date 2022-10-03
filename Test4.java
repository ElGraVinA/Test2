import java.sql.Array;

public class Test4 {
    public static void main(String[] args){
        int Number[] = {0, 12, 3, 43, 10};
        for (int a = 0, b = Number.length - 1; a < b; a++, b--){
            int c = Number[a];
            Number[a] = Number[b];
            Number[b] = c;
        }
        for (int i = 0; i < Number.length; i++){
            System.out.println(Number[i]);
        }
    }
}
