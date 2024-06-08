package hust.soict.ict.aims.screen.manager;
import hust.soict.ict.aims.Store.Store;
import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.*;
import hust.soict.ict.aims.screen.MediaStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class StoreManagerScreen extends JFrame{
    private static Store store = new Store();
    JPanel createNorth()
    {
        JPanel north= new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }
    JMenuBar createMenuBar() {

        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem smAddBook = new JMenuItem("Add Book");
        JMenuItem smAddCD = new JMenuItem("Add CD");
        JMenuItem smAddDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(smAddBook);
        smUpdateStore.add(smAddCD);
        smUpdateStore.add(smAddDVD);        

        smAddBook.addActionListener(new btnMenuListener());
        smAddCD.addActionListener(new btnMenuListener());
        smAddDVD.addActionListener(new btnMenuListener());

        menu.add(smUpdateStore);

        JMenuItem viewStoreMenu = new JMenuItem("View store");
        JMenuItem viewCartMenu = new JMenuItem("View cart");
        menu.add(viewStoreMenu);
        menu.add(viewCartMenu);
        viewStoreMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreManagerScreen(store);
            }
        });
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }
    JPanel createCenter()
    {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(0,4,2,2));
        ArrayList<Media> mediaInStore = store.getItemInStore();
        for(int i=0;i<mediaInStore.size();i++)
        {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }
        return center;
    } 
    JPanel createHeader() {

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);
    
        JButton cartBtn = new JButton("View cart");
        cartBtn.setPreferredSize(new Dimension(100, 50));
        cartBtn.setMaximumSize(new Dimension(100, 50));
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;
    }
    public StoreManagerScreen(Store store)
    {
        StoreManagerScreen.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        setTitle("Store");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private class btnMenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("Add Book")) {
			    new AddBookToStoreScreen(store);
			} else if (command.equals("Add CD")) {
				new AddCompactDiscToStoreScreen(store);
			} else if (command.equals("Add DVD")) {
				new AddDigitalVideoDiscToStoreScreen(store);
			} 
		}
	}
    public static void initSetup() 
    {
        ArrayList<String> author = new ArrayList<>();
        ArrayList<Track> tracks1 = new ArrayList<>();
        ArrayList<Track> tracks2 = new ArrayList<>();
        ArrayList<Track> tracks3 = new ArrayList<>();
        Media dvd =new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        Media dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);     
        Media dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        Media dvd3 = new DigitalVideoDisc("Aladin", "Animation", null, 0, 18.99f);
        store.addMedia(dvd);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        Media book0 = new Book("On the runway", "Self-help", 20.00f);
        author.add("Paulo Coelho");
        Media book1 = new Book("The Alchemist", "Theory", 70.00f);
        Media book2 = new Book("On the Origin of Time: Stephen Hawking's Final Theory", "Science", 120.00f);
        author.add("David Morrin");
        Media book3 =new Book(123456,"Introduction to Mechanics","Science",95.2f,author);
        store.addMedia(book0);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        Track newtrack1=new Track("Another Man Done Gone",30);
        Track newtrack2=new Track("Busted",30);
        tracks1.add(newtrack1);
        tracks1.add(newtrack2);
        Media cd1=new CompactDisc("Chain Gang","Rock", "Johnny Cash", "Johnny Cash", tracks1,50);
        Track newtrack3=new Track("Liar Liar",30);
        Track newtrack4=new Track("Wake me up",30);
        tracks2.add(newtrack3);
        tracks2.add(newtrack4);
        Media cd2=new CompactDisc("True","EDM", "Avicii", "Avicii", tracks2,50);
        Track newtrack5=new Track("Waiting for love",30);
        Track newtrack6=new Track("Touch me",30);
        tracks3.add(newtrack5);
        tracks3.add(newtrack6);
        Media cd3=new CompactDisc("Stories","EDM", "Avicii", "Avicii", tracks3,50);
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);

    }
    
    public static void main(String[] args) {
        initSetup();
		new StoreManagerScreen(store);
	}
    
}