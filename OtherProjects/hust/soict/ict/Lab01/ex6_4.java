import java.util.Scanner;
public class ex6_4
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int month=0;
    int day=0;
    while(true)
    {
        System.out.print("Enter month: ");
	    String str_month = sc.nextLine();
        switch(str_month)
        {
            case "1": month=1; break;
            case "2": month=2; break;
            case "3": month=3; break;
            case "4": month=4; break;
            case "5": month=5; break;
            case "6": month=6; break;
            case "7": month=7; break;
            case "8": month=8; break;
            case "9": month=9; break;
            case "10": month=10; break;
            case "11": month=11; break;
            case "12": month=12; break;
            case "Jan": month=1; break;
            case "Feb": month=2; break;
            case "Mar": month=3; break;
            case "Arp": month=4; break;
            case "May": month=5; break;
            case "Jun": month=6; break;
            case "Jul": month=7; break;
            case "Aug": month=8; break;
            case "Sep": month=9; break;
            case "Oct": month=10; break;
            case "Nov": month=11; break;
            case "Dec": month=12; break;
            case "Jan.": month=1; break;
            case "Feb.": month=2; break;
            case "Mar.": month=3; break;
            case "Apr.": month=4; break;
            case "May.": month=5; break;
            case "Jun.": month=6; break;
            case "Jul.": month=7; break;
            case "Aug.": month=8; break;
            case "Sep.": month=9; break;
            case "Oct.": month=10; break;
            case "Nov.": month=11; break;
            case "Dec.": month=12; break;
            case "January": month=1; break;
            case "February": month=2; break;
            case "March": month=3; break;
            case "April": month=4; break;
            case "June": month=6; break;
            case "July": month=7; break;
            case "August": month=8; break;
            case "September": month=9; break;
            case "October": month=10; break;
            case "November": month=11; break;
            case "December": month=12; break;
            default: month=0;
        }
        if(month!=0) break;
    }
    while(true)
    {
        System.out.print("Enter year: ");
	    int year = sc.nextInt();
        if(month==2 && year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0) day=29;
                else day=28;
            }
            else day=29;
        }
        else
        {
            day=28;
        }
        if(year>=0) break;
    }
    switch(month)
    {
        case 1: System.out.println(31); break;
        case 3: System.out.println(31); break;
        case 5: System.out.println(31); break;
        case 7: System.out.println(31); break;
        case 8: System.out.println(31); break;
        case 10: System.out.println(31); break;
        case 12: System.out.println(31); break;
        case 4: System.out.println(30); break;
        case 6: System.out.println(30); break;
        case 9: System.out.println(30); break;
        case 11: System.out.println(30); break;
        default: System.out.println(day);
    }
}
}