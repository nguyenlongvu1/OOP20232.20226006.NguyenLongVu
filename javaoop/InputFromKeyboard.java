import java.util.Scanner;

public class SystemLinearEq{
    double a1, a2, b1, b2, c1, c2;
    void readInput(){
        System.out.println("Enter coefficient");
        System.out.println("a1, b1, c1, a2, b2, c2 respectively:");
        Scanner x = new Scanner(System.in);
        a1 = x.nextDouble();
        b1 = x.nextDouble();
        c1 = x.nextDouble();
        a2 = x.nextDouble();
        b2 = x.nextDouble();
        c2 = x.nextDouble();
        x.close();
    }
    void solveEq(){
        double detAB = a1 * b2 - a2 * b1;
        double detCB = c1 * b2 - c2 * b1;
        double detAC = a1 * c2 - a2 * c1;

        if (detAB == 0){
            if (detCB == 0) System.out.printf("Infinite solution\n");
            else System.out.printf("No solution\n");
        } 
        else System.out.printf("Solution X = %.3f, Y = %.3f", detCB/detAB, detAC/detAB);
    }
}