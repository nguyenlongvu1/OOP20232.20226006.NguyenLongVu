package hust.soict.ict.aims;
import hust.soict.ict.aims.media.DigitalVideoDisc;
public class StoreTest {
    public static void main(String []args)
    {
        Store anOrder=new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        anOrder.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        anOrder.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","Roger Allers",18.99f);
        anOrder.addDVD(dvd3);
        anOrder.printList();
    }
    
}
