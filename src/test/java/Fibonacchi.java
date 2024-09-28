public class Fibonacchi {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        int firstNumber =0;
        int secondNumber =1;
        int count = 10;
        System.out.println("Fibonacchie");
        for(int i=0; i<=count;i++){

            System.out.println("First No "+firstNumber);
            int netNo = firstNumber + secondNumber;
            firstNumber=secondNumber;
            secondNumber=netNo;
        }
    }
}
