import java.util.Scanner;

public class ex2_6{
    static void LinearEq()
    {
        double a, b;
        System.out.println("Enter coefficient: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a == 0){
            if (b == 0) System.out.println("Infinite solutions");
            else System.out.println("No solution");
        }
        else System.out.println("Solution: " + -b/a);
    }
    static void SystemLinearEq()
    {
        double a11, a21, a12, a22, b1, b2;
        System.out.println("Enter coefficient");
        System.out.println("Enter a11, a12, b1, a21, a22, b2 : ");
        Scanner sc = new Scanner(System.in);
        a11 = sc.nextDouble();
        a12 = sc.nextDouble();
        b1 = sc.nextDouble();
        a21 = sc.nextDouble();
        a22 = sc.nextDouble();
        b2 = sc.nextDouble();
        double detAB = a11 * a22 - a21 * a12;
        double detCB = b1 * a22 - b2 * a12;
        double detAC = a11 * b2 - a21 * b1;
        if (detAB == 0){
            if (detCB == 0) System.out.println("Infinite solution");
            else System.out.println("No solution");
        } 
        else System.out.printf("Solution X = %.3f, Y = %.3f", detCB/detAB, detAC/detAB);

    }
    static void QuadraticEq()
    {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a==0) {
            if (b == 0){
                if (c == 0) System.out.println("Infinite solutions");
                else System.out.println("No solution");
            }
            else System.out.println("Solution: " + -c/b);
        }
        else {
            double Delta = b*b - 4*a*c;
            if (Delta < 0) System.out.println("No solution");
            else if (Delta == 0) System.out.println("1 solution X = "+ -b/(2*a));
            else System.out.printf("2 solution X1 = %.3f, X2 = %.3f ", 
                (-b+Math.sqrt(Delta))/(2*a), (-b-Math.sqrt(Delta))/(2*a));
        }
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1.Solve linear equation");
            System.out.println("2.Solve system linear equation");
            System.out.println("3.Solve Quadratic equation");
            System.out.println("4.Exit");
            System.out.print("Your selection: ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: LinearEq(); break;
                case 2: SystemLinearEq(); break;
                case 3: QuadraticEq(); break;
                case 4: break;
                default: System.out.println("Try again");
        }
        }
        while(choice!=5);
    }
}