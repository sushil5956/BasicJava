public class ReverseWordsinString {
    public static void main(String[] args) {
        String sentence = "Welcome to Java world";
        int size=sentence.split(" ").length;
        int i = 0;
        while (i < size) {
            for (String arr : sentence.split(" ")) {
                System.out.print(arr+ " ");
                size--;
            }
        }
    }
}
