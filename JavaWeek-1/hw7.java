//7. Write a Java program to create a simple calculator
import java.util.Scanner;
public class hw7
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int option = num.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("sum:" + (num1 + num2));
                break;
            case 2:
                System.out.println("mul:" + (num1 * num2));
                break;
            case 3:
                System.out.println("sub:" + (num1 - num2));
                break;
            case 4:
                System.out.println("div:" + (num1 / num2));
                break;
            case 5:
                System.out.println("rem:" + (num1 % num2));
                break;
        }
    }
}
