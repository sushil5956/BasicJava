public class PalindromeCheck {

    public static void main(String[] args) {
        String palindr = "NITIN";
        int size= palindr.length();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i < size){
            sb.append(palindr.charAt(size-1));
            size--;
        }
        System.out.println("Reversed is >> "+sb.toString().equals(palindr));
    }
}
