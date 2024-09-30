import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatCharacter {

    public static void main(String[] args) {
        String str = "aababeccdacdw";
        boolean flag = true;
        for(char i :str.toCharArray())
        {
            if (str.indexOf(i) == str.lastIndexOf(i))
            {
                System.out.println("The first character which is not repeating is: "+ i);
                System.out.println("Output str.indexOf(i) is >> "+str.indexOf(i) + "    "+str.lastIndexOf(i));
                flag = false;
                break;
            }
        }
        if(flag== true){
            System.out.println("There is no non-repeating character in the input string");
        }
    }
}
