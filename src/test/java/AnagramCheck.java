import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String first = "JAVA";
        String second = "VAJA";
        boolean isEqual=false;
        char[] array1=first.toCharArray();
        char[] array2=second.toCharArray();

        Arrays.sort(array2);
        Arrays.sort(array1);
        if(Arrays.equals(array1,array2)){
            isEqual=true;
        }
        System.out.println("String are anagram = "+isEqual);
    }
}
