package hust.soict.ict.aims.cart;
import java.util.ArrayList;

import hust.soict.ict.aims.media.*;
public class Cart
{
    public static final int MAX_NUMBERS_ORDER = 20;
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media item)
    {
        int c=0;
        for (Media i : itemsOrdered) 
        {
            if(item.equals(i)==true) 
            {
                System.out.println("The item has been existed");
                c=1;
                break;
            }
        }
        if(c==0)
        {
            itemsOrdered.add(item);
            System.out.println("The items has been added"  );
        }
    }
    public void removeMedia(Media item)
    {
        int exist=0;
        int j=0;
        for (Media i : itemsOrdered) 
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
            itemsOrdered.remove(j);
        }
        else
        {
            System.out.println("this media is not exist");
        }
    }
    public float totalCost()
    {
        float totalCost=0f;
        for(Media i : itemsOrdered)
        {
            if(i==null) break;
            totalCost=(totalCost+i.getCost()*10000/10000)*10000/10000;
        }
        return totalCost;
    }
    public void printList()
    {
        int count =0;
        System.out.println("*********************************************CART********************************************* ");
        System.out.println("Ordered Items");
        for(Media i : itemsOrdered)
        {
            count++;
            if(i==null) break;
            String text=i.toStrings();
            System.out.print(text);
            
        }
        System.out.printf("Total cost: %.2f\n",totalCost());
        System.out.println("*********************************************************************************************** ");
    }
    public String toString(Media itemsOrdered,int i)
    {
        String text=String.format("%d. DVD - %s \t\t - %-20s - %.2f\n",i,itemsOrdered.getTitle(),itemsOrdered.getCategory(),itemsOrdered.getCost());
        return text;
    }
    public boolean isMatch(String userInput, String DVDif)
    {
        return DVDif.toLowerCase().contains(userInput.toLowerCase());
    }
    public void searchItembyTitle(String userInput)
    {
        int count =0;
        for(Media i : itemsOrdered)
        {
            if(i==null) break;
            if(isMatch(userInput,i.getTitle()))
            {
                count++;
                System.out.print(toString(i,count));
            }
            
        }
    }
    public void searchItembyId(String userInput)
    {
        int count =0;
        for(Media i : itemsOrdered)
        {
            if(i==null) break;
            String s=String.valueOf(i.getId());
            if(isMatch(userInput,s))
            {
                count++;
                System.out.print(toString(i,count));
            }         
        }
    }
}