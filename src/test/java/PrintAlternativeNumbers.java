import org.Study.Main;

import java.util.stream.IntStream;

public class PrintAlternativeNumbers {

    public static void main(String[] args) {
        int intArry[]={1,2,3,4,5,6,7,8,9,10};
        IntStream.range(0,intArry.length)
                .filter(i -> intArry[i] % 2 ==0)//this line is main if we add only i it will filter based on index
                //.filter(i -> i % 2 ==0)
                .map(i -> intArry[i])
                .forEach(System.out::println);
    }
}
