
public class SumOfNrInArray {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,4,5,6,7};
        int sum=0;

        for(int element : numArray){
            sum+=element;
        }
        System.out.println(sum);
//        System.out.println(getSum(numArray));
    }
}
