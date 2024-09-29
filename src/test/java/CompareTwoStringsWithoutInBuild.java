public class CompareTwoStringsWithoutInBuild {
    public static void main(String[] args) {
        String str1 = "Sushil";
        String str2 = "Suthil";
        boolean flag=false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                flag = false;
                break;
            }
            flag=true;
        }

        System.out.println("Both the strings are equal ??? "+ flag);
    }
}
