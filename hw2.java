//2. Write a Java program to compare two numbers
import java.util.Scanner;
public class hw2
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if(num1 > num2)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 < num2)
        {
            System.out.println(num1 + " is less than " + num2);
        }
        else
        {
            System.out.println(num1 + " is equal to " + num2);
        }

    }
}
