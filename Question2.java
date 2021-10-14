package lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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
        }finally {
            System.out.println("Finally Clause Executed");
        }
    }
    //The output of this code:
    //a. if input is -1, the output is:
        //Error: Not zero
        //Finally Clause Executed
    //b. if input is 0, the output is:
        //I'm happy with the input.
        //Finally Clause Executed
    //c. if input is 12XY, the output is:
        //Invalid Entry
        //Finally Clause Executed
}
