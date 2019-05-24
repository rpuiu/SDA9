public class RecursiveSum {

    public static void main(String[] args) {
        System.out.println(fibo(0)); //0
            System.out.println(fibo(1)); //1
        System.out.println(fibo(2)); //1
        System.out.println(fibo(-17)); //13
    }

    static int fibo(int n) {
        int first = 0;
        int second = 1;
        int third = -1;
        if (n == first || n == second) {
            return n;
        }
        while (n >= 2) {
            third = first + second;
            first = second;
            second = third;
            n--;
        }
        return third;
    }


}
