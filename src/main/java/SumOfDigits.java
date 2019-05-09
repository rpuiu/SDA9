
public class SumOfDigits {
    public static void main(String[] args) {
        int number = 543;
        int sum = getSum(number);
        System.out.println(sum);
    }

    private static int getSum(int number) {
        int sum = 0;
        while(number!=0){
            int lastDigit = number % 10;
            sum+= lastDigit;
            number/=10;
        }
        return sum;
    }


}
