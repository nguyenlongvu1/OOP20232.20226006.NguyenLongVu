package hust.soict.ict.aims;
import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.*;
import hust.soict.ict.aims.StoreTest;
import hust.soict.ict.aims.cart.CartTest;
import java.util.ArrayList;
import java.util.Scanner;
public class Aims
{
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    } 
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    } 
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
       }
    public static void addMediatoCart(Cart cart, Store anItem)
    {
        int count=0;
        for(Media m: anItem.itemsInStore)
        {
            System.out.print(m.toStrings());
        }
        String itemAdded;
        Scanner sc = new Scanner(System.in);
        itemAdded=sc.nextLine();
        for(Media m: anItem.itemsInStore)
        {
            if(m.getTitle().toLowerCase().equals(itemAdded.toLowerCase())==true)
            {
                cart.addMedia(m);
                if(m.getClass() == DigitalVideoDisc.class && anItem.equals(m)==false ) 
                break;
            }
        }
        for(Media m: cart.itemsOrdered)
        {
            if(m.getClass() == DigitalVideoDisc.class) count++;
        }
        System.out.println("Number of DVD: "+count);
        
    }
    public static void addtoCart(Cart cart, Store anItem, String newItem)
    {
        for(Media m: anItem.itemsInStore)
        {
            if(m.getTitle().toLowerCase().equals(newItem.toLowerCase())==true)
            {
                if(cart.equals(m)==false)
                {
                    cart.addMedia(m);
                    break;
                }
                else
                {
                    System.out.println("The item has been existed ");
                }
            }
        }

    }
    public static void removeMediaFromCart(Cart cart)
    {
        String item;
        Scanner sc = new Scanner(System.in);
        item=sc.nextLine();
        for(Media m: cart.itemsOrdered)
        {
            if(m.getTitle().toLowerCase().equals(item.toLowerCase())==true)
            {
                cart.removeMedia(m);
                return;        
            }
        }
        System.out.println("No items were deleted");
    }
    public static int mediaDetail(Store anItem, String itemSelection)
    {
        for(Media m: anItem.itemsInStore)
        {
            if(m.getTitle().toLowerCase().equals(itemSelection.toLowerCase())==true)
            {
                System.out.println(m.toStrings());
                return 1;
            }
        }
        System.out.println("the item is not exist");
        return 0;

    }
    public static void playMedia(Store anItem, String itemSelection)
    {
        int c=1;
        if(c==1)
        {
            for(Media m: anItem.itemsInStore )
            {
                if(m.getTitle().toLowerCase().equals(itemSelection.toLowerCase())==true)
                {
                    if(m.getClass() == DigitalVideoDisc.class || m.getClass() == CompactDisc.class)
                    {
                        m.play();
                        break;
                    }
                    break;
                }
            }
        }

    }
    public static void playMediaInCart(Cart cart, String itemSelection)
    {
        for(Media m: cart.itemsOrdered )
        {
            if(m.getTitle().toLowerCase().equals(itemSelection.toLowerCase())==true)
            {
                if(m.getClass() == DigitalVideoDisc.class || m.getClass() == CompactDisc.class)
                {
                    m.play();
                    break;
                }
                break;
            }
        }
    }
    public static void updateStore(Store anItem)
    {
        String trackTitle;
        int id;
        String title;
        String category;
        float cost;
        int length;
        String director;
        ArrayList<String> authors = new ArrayList<String>();
        String artist;
        ArrayList<Track> tracks = new ArrayList<Track>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        int choice1;
        int choice;
        do
        {
            System.out.println("1,Add item");
            System.out.println("2,Remove item");
            System.out.println("0,Back");
            choice=sc.nextInt();
            switch (choice) {
                case 0: break;
                case 1:
                    do
                    {
                        System.out.println("Choose your type");
                        System.out.println("1,DVD");
                        System.out.println("2,CD");
                        System.out.println("3,Book");
                        System.out.println("0,Back");
                        choice1=sc.nextInt();
                        switch (choice1) 
                        {
                            case 0:break;
                            case 1:
                                System.out.println("title:");
                                title = sc1.nextLine();
                                System.out.println("category:");
                                category = sc2.nextLine();
                                System.out.println("director:");
                                director = sc3.nextLine();
                                System.out.println("id:");
                                id = sc.nextInt();
                                System.out.println("length:");
                                length= sc.nextInt();
                                System.out.println("cost:");
                                cost = sc.nextFloat();
                                Media dvd = new DigitalVideoDisc(length,director,title,category,cost,id);
                                anItem.addMedia(dvd);
                                break;
                            case 2:
                                System.out.println("title:");
                                title = sc1.nextLine();
                                System.out.println("category:");
                                category = sc2.nextLine();
                                System.out.println("artist:");
                                artist = sc3.nextLine();
                                System.out.println("director:");
                                director = sc.nextLine();
                                System.out.println("track's title:");
                                trackTitle = sc4.nextLine();
                                System.out.println("length:");
                                length= sc.nextInt();
                                System.out.println("cost:");
                                cost = sc.nextFloat();
                                Track newtrack=new Track(trackTitle,length);
                                tracks.add(newtrack);
                                Media CD=new CompactDisc(title,category, director, artist, tracks,cost);
                                anItem.addMedia(CD);
                                break;
                                case 3:
                                System.out.println("title:");
                                title = sc3.nextLine();
                                System.out.println("category:");
                                category = sc1.nextLine();
                                System.out.println("authors:");
                                String newAuthor=sc2.nextLine();
                                authors.add(newAuthor);
                                System.out.println("id:");
                                id= sc.nextInt();
                                System.out.println("cost:");
                                cost = sc.nextFloat();
                                Media Book=new Book(id,title,category,cost,authors);
                                anItem.addMedia(Book);
                                break;    
                            default: break;
                        }
                }while(choice1!=0);
                break;
                case 2: removeMediaFromTheStore(anItem); break;
                default:
                    break;
            }
        }while(choice!=0);
    }
    public static void removeMediaFromTheStore(Store anItem)
    {   
        Scanner sc = new Scanner(System.in);
        String itemTitle = sc.nextLine();
        for(Media m: anItem.itemsInStore)
        {
            if(m.getTitle().toLowerCase().equals(itemTitle.toLowerCase())==true)
            {
                anItem.removeMedia(m);
                return;        
            }
        }
        System.out.println("No items were deleted");
    }
    public static void seeTheCurrentCart(Cart cart)
    {
        cart.printList();
    }
    public static void main(String[]args)
    {
        int choice1;
        int choice2;
        int choice3;
        int choice4;
        int choice5;
        String inputInformation;
        String itemSelection;
        String idInformation;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Cart cart= new Cart();
        Store anItem = new Store();
        Media dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        Media dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        Media dvd3 = new DigitalVideoDisc("Aladin","Animation","Roger Allers",18.99f);
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        Media dvd =new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        ArrayList<String> author = new ArrayList<>();
        author.add("David Morrin");
        Media book =new Book(123456,"Intro to Mechanics","Science",15.2f,author);
        anItem.addMedia(dvd);
        anItem.addMedia(book);
        do
        {
            showMenu();
            choice1=sc.nextInt();
            switch(choice1)
            {
                case 0: break;
                case 1:
                do
                {
                    storeMenu();
                    choice2=sc.nextInt();
                    switch(choice2)
                    {
                        case 0: break;
                        case 1:
                        Scanner a = new Scanner(System.in);
                        itemSelection=a.nextLine();
                        int c= mediaDetail(anItem,itemSelection);
                        if(c==1)
                        {
                            mediaDetailsMenu();
                        }
                        do
                        {
                            Scanner s = new Scanner(System.in);
                            choice3=sc.nextInt();
                            switch(choice3)
                            {
                                case 0: break;
                                case 1:
                                addtoCart(cart,anItem,itemSelection);
                                break;
                                case 2:
                                playMedia(anItem,itemSelection);
                                break;
                                default: 
                                System.out.println("Try again");
                                break;

                            }
                        } while(choice3!=0);
                        break;

                        case 2:
                        addMediatoCart(cart,anItem);
                        break;
                        case 3:
                        System.out.println("DVD/CD: ");
                        Scanner s = new Scanner(System.in);
                        itemSelection=s.nextLine();
                        playMedia(anItem,itemSelection);
                        break;
                        case 4:
                        seeTheCurrentCart(cart);
                        do
                        {
                            cartMenu();
                            choice4=sc.nextInt();
                            switch (choice4) {
                                case 0: break;
                                case 1:
                                System.out.println("1,Search by ID");
                                System.out.println("2,Search by Title");
                                choice5=sc.nextInt();
                                switch (choice5) {
                                    case 1:
                                        idInformation=sc.next();
                                        cart.searchItembyId(idInformation);
                                        break;
                                    case 2:
                                        inputInformation=sc1.nextLine();
                                        cart.searchItembyTitle(inputInformation);
                                        break;
                                    default:
                                        break;
                                }
                                case 2: break;
                                case 3:
                                    removeMediaFromCart(cart);
                                    break;
                                case 4:
                                    itemSelection=sc.nextLine();
                                    playMediaInCart(cart, itemSelection);
                                case 5:
                                    System.out.println("an order is created");
                                    cart.itemsOrdered.clear();
                                    break;
                                default:
                                    break;
                            }
                        }
                        while(choice4!=0);
                        break;
                        default: System.out.println("Try again");
                    }
                }while(choice2!=0);
                break;
                case 2:
                updateStore(anItem);
                break;
                case 3:
                seeTheCurrentCart(cart);
                do
                {
                    cartMenu();
                    choice4=sc.nextInt();
                    switch (choice4) {
                        case 0: break;
                        case 1:
                        System.out.println("1,Search by ID");
                        System.out.println("2,Search by Title");
                        choice5=sc.nextInt();
                        switch (choice5) {
                            case 1:
                                idInformation=sc.next();
                                cart.searchItembyId(idInformation);
                                break;
                            case 2:
                                inputInformation=sc1.nextLine();
                                cart.searchItembyTitle(inputInformation);
                                break;
                            default:
                                break;
                        }
                        case 2:
                            System.out.println("Sort medias in cart by (1) title or (2) cost:");
                            int sortOption = sc.nextInt();
                            sc.nextLine();
                            if (sortOption == 1) 
                            {
                                cart.sortMediaByTitle();
                            } 
                            else if (sortOption == 2) 
                            {
                                cart.sortMediaByCost();
                            } 
                            else 
                            {
                                System.out.println("Invalid option.");
                            }
                            break;
                        case 3:
                            removeMediaFromCart(cart);
                            break;
                        case 4:
                            itemSelection=sc.nextLine();
                            playMediaInCart(cart, itemSelection);
                            break;
                        case 5:
                            System.out.println("an order is created");
                            cart.itemsOrdered.clear();
                            break;
                        default:
                            break;
                    }
                }
                while(choice4!=0);
                break;
                default: 
                System.out.println("Try again");          
            }
        } while(choice1!=0);

    } 
}



                    