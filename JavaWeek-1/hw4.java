//4. Java Program to find area of rhombus
import java.util.Scanner;
public class hw4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Area of rhombus:"+((num1*num2)/2));
    }
}