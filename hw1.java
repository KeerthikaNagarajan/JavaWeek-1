//1. Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
import java.util.Scanner;
public class hw1
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        System.out.println("sum:"+(num1+num2));
        System.out.println("mul:"+(num1*num2));
        System.out.println("sub:"+(num1-num2));
        System.out.println("div:"+(num1/num2));
        System.out.println("rem:"+(num1%num2));
    }
}
