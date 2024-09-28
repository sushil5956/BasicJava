import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String withDuplicates = "sushilrachana";
        char[] charArray = withDuplicates.toCharArray();
        Set<Character> hashSet = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (char c : charArray) {
            if (!hashSet.contains(c)) {
                hashSet.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString() + "             "+ hashSet.toString());
    }
    }
