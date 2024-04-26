package hust.soict.ict.aims;
import hust.soict.ict.aims.media.DigitalVideoDisc;
public class Store {
    private DigitalVideoDisc itemsInStore []= new DigitalVideoDisc[1000];
    int qtyOrdered=0;
    public void addDVD(DigitalVideoDisc disc)
    {
        itemsInStore[qtyOrdered]=disc;
        qtyOrdered+=1;
        System.out.println("The disc has been added"  );
    }
    public void removeDVD(DigitalVideoDisc disc)
    {
        for(int i=0;i<itemsInStore.length;i++)
        {
            if(itemsInStore[i]==null) 
            {
                System.out.println("items does not exist");
                break;
            }
            if(itemsInStore[i]==disc) 
            {
                for(int j=i;j<itemsInStore.length;j++)
                {
                    if(itemsInStore[j]==null) break;
                    itemsInStore[j]=itemsInStore[j+1];
                }
            }
        }
    }
    public String toString(DigitalVideoDisc itemsOrdered[],int i)
    {
        String text=String.format("%d. DVD - %s \t\t - %-20s- %s \t - %d \t - %.2f\n",i,itemsOrdered[i-1].getTitle(),itemsOrdered[i-1].getCategory(),itemsOrdered[i-1].getDirector(),itemsOrdered[i-1].getLenght(),itemsOrdered[i-1].getCost());
        return text;
    }
    public void printList()
    {
        System.out.println("*********************************************CART********************************************* ");
        System.out.println("Ordered Items");
        for(int i=1;i<=itemsInStore.length;i++)
        {
            if(itemsInStore[i-1]==null) break;
            System.out.print(toString(itemsInStore,i));
            
        }
        System.out.println("********************************************************************************************** ");
    }
}
