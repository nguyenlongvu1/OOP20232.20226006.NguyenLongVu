package hust.soict.ict.aims.Store;
import hust.soict.ict.aims.media.*;
import java.util.ArrayList;
import hust.soict.ict.aims.media.Book;
public class Store {
    public ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public boolean equals(Media newItem)
    {
        for(Media m : itemsInStore )
        {
            if(m.getTitle().equals(newItem.getTitle()))
            {
                return true;
            }
        }
        return false;
    }
    public void addMedia(Media item)
    {
        if(equals(item)==false)
        {
            itemsInStore.add(item);
            System.out.println("The items has been added"  );
        }
        else
        {
            System.out.println("The items has been existed"  );
        }
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
            String text=i.toStrings();
            System.out.print(text);
        }

        System.out.println("************************************************************************************************ ");
    }
    public ArrayList<Media> getItemInStore()
    {
        return itemsInStore;
    }
}
