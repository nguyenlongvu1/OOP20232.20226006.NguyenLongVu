package hust.soict.ict.aims;
import hust.soict.ict.aims.media.*;
import java.util.ArrayList;
public class StoreTest {
    public static void main(String []args)
    {
        ArrayList<Media> anItem = new ArrayList<Media>();
        Media dvd =new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        ArrayList<String> author = new ArrayList<>();
        author.add("David Morrin");
        Media book =new Book(123456,"Intro to Machanics","Science",15.2f,author);
        anItem.add(dvd);
        anItem.add(book);
        for(Media m: anItem)
        {
            System.out.print(m.toStrings());
        }
    }
    
}
