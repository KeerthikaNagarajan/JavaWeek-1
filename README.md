## JAVA WEEK 1
### 1.	Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
```
import java.util.Scanner;
public class Main
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
```
<img width="80" alt="1" src="https://user-images.githubusercontent.com/93427089/224375379-94af6e68-29f2-445f-a685-2fffbab70a68.png">

### 2.	Write a Java program to compare two numbers
```
import java.util.Scanner;
public class Main
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
```
<img width="127" alt="2i" src="https://user-images.githubusercontent.com/93427089/224375423-6b8bac21-ee16-447c-a70d-7f75a7e8c77e.png">
<img width="109" alt="2ii" src="https://user-images.githubusercontent.com/93427089/224375443-7127e3eb-bb7d-4c6c-a834-4696e30a21ef.png">
<img width="106" alt="2iii" src="https://user-images.githubusercontent.com/93427089/224375473-13c14d60-7acc-423a-b6aa-f23d4ba54626.png">

### 3.	Write a Java program to convert a string to an integer
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a number(string):");
        String str = in.nextLine();
        int res = Integer.parseInt(str);
        System.out.printf("Integer value:%d",res);
        System.out.printf("\n");
    }
}
```
<img width="167" alt="3" src="https://user-images.githubusercontent.com/93427089/224375540-1872339e-f5be-4caf-a98e-4b7fb4c1bfa3.png">

### 4.	Java Program to find area of rhombus
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Area of rhombus:"+((num1*num2)/2));
    }
}
```
<img width="124" alt="4" src="https://user-images.githubusercontent.com/93427089/224375823-7d97fb41-e216-47ab-aa6d-941971e8cd76.png">

### 5.	Write a Java program to find the number of days in a month
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        switch(str)
        {
            case "January":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28");
                break;
            case "March":
                System.out.println("31");
                break;
            case "April":
                System.out.println("30");
                break;
            case "May":
                System.out.println("31");
                break;
            case "June":
                System.out.println("30");
                break;
            case "July":
                System.out.println("31");
                break;
            case "August":
                System.out.println("31");
                break;
            case "September":
                System.out.println("30");
                break;
            case "October":
                System.out.println("31");
                break;
            case "November":
                System.out.println("30");
                break;
            case "December":
                System.out.println("31");
                break;
        }
    }
}
```
<img width="74" alt="5" src="https://user-images.githubusercontent.com/93427089/224375889-37e188c5-fb66-4e7e-958a-45dbfc882596.png">

### 6.	Write a Java program to print the even numbers from 1 to 20
```
public class Main
{
    public static void main(String[] args)
    {
        int i;
        for(i=0;i<=20;i++)
        {
            System.out.print(+i+"\n");
            i+= 1;
        }
    }
}
```
<img width="85" alt="6" src="https://user-images.githubusercontent.com/93427089/224375925-b9549cc3-1cde-4248-aa95-cd532ee34310.png">

### 7.	Write a Java program to create a simple calculator
```
import java.util.Scanner;
public class Main
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
```
<img width="74" alt="7i" src="https://user-images.githubusercontent.com/93427089/224375963-ead2d551-4d27-4daa-8781-6929a044e6cb.png">
<img width="55" alt="7ii" src="https://user-images.githubusercontent.com/93427089/224375974-8b88cb29-d7ab-4119-bf1b-c5972be2be4c.png">
<img width="55" alt="7iii" src="https://user-images.githubusercontent.com/93427089/224375990-161e1978-8b95-4c10-9a06-eefd8dd48b2b.png">
<img width="50" alt="7iv" src="https://user-images.githubusercontent.com/93427089/224376008-9db7b017-4d16-4ffc-a4ce-8cb0ac98f3ac.png">
<img width="64" alt="7v" src="https://user-images.githubusercontent.com/93427089/224376021-0643fcfa-08a8-4d17-bb84-036fe2d8682c.png">

### 8.	Write a Java program to print multiplication table of given number
```
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int tab = num.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(tab+" * "+i+" = "+(tab*i));
        }
    }
}
```
<img width="103" alt="8" src="https://user-images.githubusercontent.com/93427089/224376059-26cf38d3-24f6-4480-897b-a67771e31a7d.png">
