package lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner     scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            if (num != 0){
                throw new Exception("Not zero");
            }
            System.out.println("I'm happy with the input.");
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    //The output of this code:
    //a. if input is -1, the output is:
        // Error: Not zero
    //b. if input is 0, the output is:
        // I'm happy with the input.
    //c. if input is 12XY, the output is:
        // Invalid Entry
}
