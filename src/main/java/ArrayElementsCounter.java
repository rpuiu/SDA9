public class ArrayElementsCounter {

    public static void main(String[] args) {
        int[] array = {3,6,5,4,3,2,2,2,2};
             //pozitie:0,1,2,3,4,5,6,7,8
            //lungime = 9;
        int nrPare=0;
        int nrImpare=0;
//        int position = array.length-1;
//        while(position>=0){
        for(int numar:array){
            if(numar%2==0){
                nrPare++;
            }else{
                nrImpare++;
            }
        }
        System.out.println("nrPare:" + nrPare);
        System.out.println("asdsada" + nrImpare);
    }
}
