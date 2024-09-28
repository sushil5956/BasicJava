import java.util.Arrays;

public class CountWordsInStringusingJava8 {

    public static void main(String[] args) {
        String str = "Count the total words";
        long count = Arrays.stream(str.split(" ")).count();
    }
}
