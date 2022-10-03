public class Test5 {
    public static void main(String[] args) {
        int Matrix[][] = {
                {1, -3, -5, -14},
                {3, -9, 44, 5}
        };
        int a = 0;
        int b = 0;
        for (int i = 0; i < Matrix.length; i++){
            for (int n = 0; n < Matrix[i].length; n++){
                if (Matrix[i][n] < 0){
                    a++;
                } else if (Matrix[i][n] > 0) {
                    b++;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        if (a > b){
            System.out.println("Отрицательных Больше");
        } else if (a < b){
            System.out.println("Положительных Больше");
        } else {
            System.out.println("Положительных и Отрицательных Поровну");
        }
    }
}