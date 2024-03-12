import java.util.Scanner;
public class test
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	double a = sc.nextInt();
	double b = sc.nextInt();
    if(a==0)
    {
        if(b==0)
        {
            System.out.println("Infinite solution");
        }
        else
        {
            System.out.println("No Solution");
        }
    }
    else
    {  
        System.out.println("x="+(-b/a));
    }
}

}