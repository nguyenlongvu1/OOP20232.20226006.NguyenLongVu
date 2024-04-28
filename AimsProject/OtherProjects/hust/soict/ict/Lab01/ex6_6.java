import java.util.Scanner;
public class ex6_6
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of row: ");
	int r = sc.nextInt();
    System.out.print("Enter number of column ");
    int c = sc.nextInt();
    double [][] m1 =new double[r][c];
    double [][] m2 =new double[r][c];
    double [][] m =new double[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            m1[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            m2[i][j]=sc.nextInt();
            m[i][j]=m1[i][j]+m2[i][j];
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.print(m[i][j]+" ");

        }
        System.out.print("\n");
    }

}
}