package hust.soict.ict.aims;
import hust.soict.ict.aims.media.*;
import java.util.ArrayList;
public class Store {
    ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public void addMedia(Media item)
    {
        itemsInStore.add(item);
        System.out.println("The items has been added"  );
    }
    public void removeMedia(Media item)
    {
        int exist=0;
        int j=0;
        for (Media i : itemsInStore) 
        {
            if(item.equals(i)==true) 
            {
                exist=1;
                break;
            }
            j++;
        }
        if(exist==1)
        {
            itemsInStore.remove(j);
        }
        else
        {
            System.out.println("this item is not exist");
        }
    }
    public String toString(Media itemsInStore,int i)
    {
        String text=String.format("%d. DVD - %s \t\t - %-20s - %.2f\n",i,itemsInStore.getTitle(),itemsInStore.getCategory(),itemsInStore.getCost());
        return text;
    }
    public void printList()
    {
        int count =0;
        System.out.println("*********************************************STORE********************************************* ");
        System.out.println("Ordered Items");
        for(Media i : itemsInStore)
        {
            count++;
            if(i==null) break;
            System.out.print(toString(i,count));
            
        }

        System.out.println("************************************************************************************************ ");
    }
}
