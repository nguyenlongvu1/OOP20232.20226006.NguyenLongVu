package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;

public class Cart
{
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc itemsOrdered []= new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered=0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if(qtyOrdered>=MAX_NUMBERS_ORDER) 
        {
            System.out.println("The cart is almost full" );
        }
        else
        {
            itemsOrdered[qtyOrdered]=disc;
            qtyOrdered+=1;
            System.out.println("The disc has been added"  );
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc []disc)
    {
        for(int i=0;i<disc.length;i++) 
        {
            if(qtyOrdered>=MAX_NUMBERS_ORDER) 
            {
                System.out.println("The cart is almost full" );
            }
            if(disc[i]==null) break;
            itemsOrdered[qtyOrdered]=disc[i];
            qtyOrdered+=1;
        }  
        System.out.println("The discs have been added") ;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        if(qtyOrdered>=MAX_NUMBERS_ORDER) 
        {
            System.out.println("The cart is almost full" );
        }
        else
        {
            itemsOrdered[qtyOrdered]=dvd1;
            qtyOrdered+=1;
            System.out.println("The disc has been added"  );
        }
        if(qtyOrdered>=MAX_NUMBERS_ORDER) 
        {
            System.out.println("The cart is almost full" );
        }
        else
        {
            itemsOrdered[qtyOrdered]=dvd2;
            qtyOrdered+=1;
            System.out.println("The disc has been added"  );
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        for(int i=0;i<itemsOrdered.length;i++)
        {
            if(itemsOrdered[i]==null) 
            {
                System.out.println("items does not exist");
                break;
            }
            if(itemsOrdered[i]==disc) 
            {
                for(int j=i;j<itemsOrdered.length;j++)
                {
                    if(itemsOrdered[j]==null) break;
                    itemsOrdered[j]=itemsOrdered[j+1];
                }
            }
        }
    }
    public float totalCost()
    {
        float totalCost=0f;
        for(int i=0;i<itemsOrdered.length;i++)
        {
            if(itemsOrdered[i]==null) break;
            totalCost=(totalCost+itemsOrdered[i].getCost()*10000/10000)*10000/10000;
        }
        return totalCost;
    }
    public void printList()
    {
        System.out.println("*********************************************CART********************************************* ");
        System.out.println("Ordered Items");
        for(int i=1;i<=itemsOrdered.length;i++)
        {
            if(itemsOrdered[i-1]==null) break;
            System.out.print(toString(itemsOrdered,i));
            
        }
        System.out.printf("Total cost: %.2f\n",totalCost());
        System.out.println("********************************************************************************************** ");
    }
    public String toString(DigitalVideoDisc itemsOrdered[],int i)
    {
        String text=String.format("%d. DVD - %s \t\t - %-20s- %s \t - %d \t - %.2f\n",i,itemsOrdered[i-1].getTitle(),itemsOrdered[i-1].getCategory(),itemsOrdered[i-1].getDirector(),itemsOrdered[i-1].getLenght(),itemsOrdered[i-1].getCost());
        return text;
    }
    public boolean isMatch(String userInput, String DVDif)
    {
        return DVDif.toLowerCase().contains(userInput.toLowerCase());
    }
    public void searchDVDbyTitle(String userInput)
    {
        int count =0;
        for(int i=1;i<=itemsOrdered.length;i++)
        {
            if(itemsOrdered[i-1]==null) break;
            if(isMatch(userInput,itemsOrdered[i-1].getTitle()))
            {
                count++;
                System.out.print(toString(itemsOrdered,count));
            }
            
        }
    }
    public void searchDVDbyId(String userInput)
    {
        int count =0;
        for(int i=1;i<=itemsOrdered.length;i++)
        {
            if(itemsOrdered[i-1]==null) break;
            String s=String.valueOf(itemsOrdered[i-1].getId());
            if(isMatch(userInput,s))
            {
                count++;
                System.out.print(toString(itemsOrdered,count));
            }         
        }
    }
}