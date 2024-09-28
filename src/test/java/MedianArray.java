import java.util.Arrays;

public class MedianArray {

    //Median is average of middlenumbers
    public static void main(String[] args) {
        int intArray[] = {10, 15, 11, 22, 45, 66, 21, 05};
        double val =findMedian(intArray);
        System.out.println(val);
    }

    private static double findMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if(n %2 ==1){
            return  array[n/2];
        }
        else {
            return (array[n-1]/2+ array[n/2])/2.0;
        }

    }

}
