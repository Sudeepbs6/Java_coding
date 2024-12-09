import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        if(isPrime(number)){
            System.out.println(number + " is a prime.");
        }
        else{
            System.out.println(number + " is a not prime.");
        }
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%1==0){
                return false;
            }
        }
    
    return true;
    }
}
