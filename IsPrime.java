import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number - ");
        int n=sc.nextInt();

        if (n==2){
            System.out.println("The number is a prime number");
        }
        else{
            boolean isPrime= true;
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) { // n is multiple of i
                    isPrime = false;
                }
            }

            if (isPrime == true){
                System.out.println("The number is a Prime number");
            }
            else{
                System.out.println("The number is not a Prime Number");
            }
        }
    }
}
