//18020569
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Enter number 1, number 2 and the operator :");
                String one = str.next();
                int num1 = Integer.parseInt(one);

                String two = str.next();
                int num2 = Integer.parseInt(two);

                String op = str.next();

                if (num1 < num2 && op.equals("-")) {
                    throw new MyException("Negative Result Exception Occured! : negative_result : Negative Results!");
                }

                switch (op) {
                    case "+":
                        int add = num1 + num2;
                        System.out.println(add);
                        break;

                    case "-":
                        int sub = num1 - num2;
                        System.out.println(sub);
                        break;

                    case "*":
                        int mul = num1 * num2;
                        System.out.println(mul);
                        break;

                    case "/":
                        int div = num1 / num2;
                        System.out.println(div);
                        break;

                    case "e":
                        System.exit(0);

                }

                if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {

                } else {
                    throw new MyException("Invalid Operator Exception Occured! :invalid_operator: Invalid Operator!");

                }

            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Occured! " + e);

        } catch (MyException e) {
            System.out.println(e);
        }
    }

}

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

}