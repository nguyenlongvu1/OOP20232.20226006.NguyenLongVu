package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

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
            System.out.println("The disc has been added");
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
            totalCost+=itemsOrdered[i].getCost()*100000/100000;
        }
        return totalCost;
    }
}