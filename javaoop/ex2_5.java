import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex2_5
{

public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number 1: ");
    String strNum1=sc.nextLine();
     System.out.print("Enter number 2: ");
    String strNum2=sc.nextLine();
    double num1 = Double.parseDouble(strNum1);
    double num2 = Double.parseDouble(strNum2);
    double sum=num1+num2;
    double difference=num1-num2;
    double product= num1*num2;
    double quotion= num1/num2;
    System.out.println("Sum of two number: "+sum);
    System.out.println("Difference of two number: "+difference);
    System.out.println("Product of two number: "+product);
    System.out.println("quotion of two number: "+quotion);
}
}