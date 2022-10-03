public class Test3 {
    public static void main (String[] args){
        int Number[] = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int sum = 0;
        for (int i = 0;i < Number.length; i++){
            if (i == 7){
                break;
            } else if (Number[i]%2 == 0){
                sum += Number[i];
            }
        }
        System.out.println(sum);
        }

    }

