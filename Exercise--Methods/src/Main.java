import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1-Write a Java method to find the smallest number among three numbers.*/

//        System.out.println("Enter three numbers to find the smallest among them:");

//        int[] arr = new int[3];
//
//        System.out.println("Input the first number");
//         arr[0] = input.nextInt();
//
//        System.out.println("Input the Second number");
//        arr[1] = input.nextInt();
//
//        System.out.println("Input the third number");
//        arr[2] = input.nextInt();
//
//
//        System.out.println("The smallest number is: " + smallest(arr));
//---------------------------------------------------------------------------
        /*2- Write a Java method that check if the entered number is negative or
        positive or zero.*/

//        System.out.println("Enter a number to check if it's Negative , Positive or zero");
//        int number = input.nextInt();
//
//        int result = checkNumberType(number);

//----------------------------------------------------------------------------
        /*3- Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters. A
password consists of only letters and digits. A
password must contain at least two digits.*/

//        System.out.println("Password rules:\n" +
//                "1. A password must have at least ten characters.\n" +
//                "2. A password consists of only letters and digits.\n" +
//                "3. A password must contain at least two digits.");
//        String password;
//        while (true) {
//            System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
//            password = input.nextLine();
//
//            if (validPassword(password)) {
//                System.out.println("Password is valid: " + password);
//                break;
//            } else {
//                System.out.println("Invalid password. Please try again.");
//            }
//        }
//
    }

    //***************************************
    //Q-1 - Smallest method (find the smallest number)
//    public static int smallest(int[] arr){
//        int small = arr[0];
//        for (int i:arr) {
//            if (i < small) {
//              small = i;
//            }
//        }
//        return small;
//    }
//****************************************
    // Q2 - Check method (Check if the entered number is negative or positive or zero )
//    public static int checkNumberType(int number){
//        if(number == 0 ){
//            System.out.println("The number is Zeroo!");
//        }else if (number > 0){
//            System.out.println("The number is Positive");
//        } else System.out.println("The number is Negative");
//        return number;
//    }
//**********************************************************************
    // Q3 - validPassword method (to check whether a string is a valid password.)
//    public static boolean validPassword(String password) {
//        if (password.length() < 10) {
//            return false; //  rule 1
//        }
//        int digitCount = 0;
//
//        for (char ch : password.toCharArray()) {
//            if (isDigit(ch)) { // calling isDigit method
//                digitCount++;
//            } else if (!isLetter(ch)) {
//                return false; // rule 2: Valid characters check by calling isDigit , isLetter methods.
//            }
//        }
//        return digitCount >= 2; // rule 3: At least two digits
//    }
//
//    public static boolean isDigit(char ch) {
//        return ch >= '0' && ch <= '9';
//    }
//
//    public static boolean isLetter(char ch) {
//        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
//    }


}