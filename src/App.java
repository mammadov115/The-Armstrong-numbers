import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number, armstrong=0;
        String num;

        System.out.println("Enter the number:");
        number = input.nextInt();
        num = Integer.toString(number);

        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            armstrong += Math.pow(digit, num.length());         
        }

        if(number==armstrong){
            System.out.println(number + " is Armstrong number");
        }else{
            System.out.println(number + " is not Armstrong number");
        }
    }
}
