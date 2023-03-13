package Lambda;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mathematical operation:" +
                "\n + addition;" +
                "\n - subtraction; "+
                "\n * multiplication; "+
                "\n / division; ");
        String sign = input.nextLine();
        System.out.println("Input some two number");
        double a = input.nextDouble();
        double b = input.nextDouble();

        switch ( sign ){
            case("+"):
                Addition addition = (a1, b1) -> a+b;
                System.out.println(a + " + "+ b +" = " + addition.addition(a,b));
                break;
            case("-"):
                Subtraction subtraction = (a1, b1) -> a-b;
                System.out.println(a + " - "+ b +" = " + subtraction.subtraction(a,b));
                break;
            case("*"):
                Multiplication multiplication = (a1, b1) -> a*b;
                System.out.println(a + " * "+ b +" = " + multiplication.multiplication(a,b));
                break;
            case("/"):
                Division division = (a1, b1) -> a / b;
                System.out.println(a + " / "+ b +" = " + division.division(a,b));
                break;
            default:
                System.out.println("Wrong mathematical sign ");
                break;
        }

    }

}
