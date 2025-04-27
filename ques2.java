import java.util.Scanner;

public class ques2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();


        int originalNumber = num;  
        int product = 1;
        if (num == 0) {
            product = 0;
        } else {
            while (num != 0) {
                int digit = num % 10;  
                product *= digit;         
                num /= 10;            
            }
        }

        System.out.println("The product of the digits of " + originalNumber + " is: " + product);
    }
  
}
  
