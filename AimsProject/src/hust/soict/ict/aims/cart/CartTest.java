package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;

import java.util.Scanner;
public class CartTest {
    public static void main(String []args)
    {
        Cart anOrder=new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","Roger Allers",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.printList();
        System.out.println("Enter DVD id or title");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        anOrder.searchDVDbyTitle(userInput);
        scanner.close();
    }
        
}
