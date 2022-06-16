import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int input = 0;
        boolean loopTrip = true;

        while(loopTrip){
            System.out.println("Enter an integer n greater than 1:");
            input = kbd.nextInt();

            if(input > 1){
                loopTrip = false;
            }
            else{
                continue;
            }

        }

        System.out.println("The sum of all factors of " + input + " is " + findFactorSum(input));
    }

    public static int findFactorSum(int a){

        int integer = a;
        int factorsSum = 0;
        int count = 1;
        while(count <= a){
            if(a % count == 0){
                factorsSum += count;
                count++;
            }
            else{
                count++;
            }
        }
        return factorsSum;
    }
}