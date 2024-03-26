import java.util.Scanner;
public class ex6_5
{
static void Print(double arr[], int n)
{
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.print("\n");
}
static void Sum(double arr[], int n)
{
    double sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    System.out.println(sum);
}
static void Sort(double arr[], int n)
{
    double temp;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[i])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
static void Average(double arr[], int n)
{
    double average=0;
    for(int i=0;i<n;i++)
    {
        average+=arr[i]/n;
    }
    System.out.println(average);
}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n=sc.nextInt();
    int choice; 
    double []arr=new double[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    do
    {
        System.out.println("1.Print array");
        System.out.println("2.Sort array");
        System.out.println("3.Sum of array elements");
        System.out.println("4.Average of array elements");
        System.out.println("5.Exit");
        System.out.print("Your selection: ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:Print(arr,n); break;
            case 2:Sort(arr,n); break;
            case 3:Sum(arr,n); break;
            case 4:Average(arr,n); break;
            case 5:break;
            default: System.out.println("Try again");
        }
    }
    while(choice!=5);
}
}