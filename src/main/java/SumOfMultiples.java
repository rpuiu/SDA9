
import java.util.Map;

public class SumOfMultiples {

    public static void main(String[] args) {
       double x = Math.PI;
        int sum = getSum(1000);
        System.out.println(sum);
        String xa = "aaa";
        System.out.println(xa.toCharArray()[0]);
    }

     static int getSum(int number) {
        int sum=0;
        for(int numar = 0; numar < number; numar++){
            if(isMultipleOfFive(numar) || isMultipleOfThree(numar)){
                sum = sum + numar;
            }
        }
        return sum;
    }

    static boolean isMultipleOfThree(int number) {
        return number % 3 ==0;
    }
    static boolean isMultipleOfFive(int number) {
        return number % 5 ==0;
    }


}
