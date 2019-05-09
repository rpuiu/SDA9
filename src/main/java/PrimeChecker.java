
public class PrimeChecker {
    public static void main(String[] args) {
        int numarDeVerificat = 26;
        int maxPrimeDiv = getMaxPrimeDiv(numarDeVerificat);
        System.out.println("Cel mai mare div este "
        + maxPrimeDiv);
    }
    static int getMaxPrimeDiv(int unNumar){
        int max=0;
        for (int div = 2; div<=unNumar; div++){
            boolean esteDivizor = unNumar%div==0;
            if(esteDivizor && isPrime(div)){
                    max=div;
            }
        }
        return max;
    }


    static boolean isPrime( int oriceNumar){
        for(int div = 2; div < oriceNumar; div++)
        {
            if(oriceNumar%div==0){
                return false;
            }
        }
        return true;
    }
}
