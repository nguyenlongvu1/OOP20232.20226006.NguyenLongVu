package hust.soict.ict.aims.screen;
import hust.soict.ict.aims.Store;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.media.Book;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddBookToStoreScreen extends JFrame implements ActionListener {

    private static Store store;
    private JTextField titleField;
    private JTextField authorField; // Added author field based on feedback
    private JTextField categoryField;
    private JTextField costField;
    private JButton addButton;

    public AddBookToStoreScreen(Store store) 
    {
        super("Add Book");
        this.store = store;
        
        JPanel mainPanel = new JPanel(new GridLayout(6, 2)); 
        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel authorLabel = new JLabel("Author (Use ',' to separate authors):"); 
        authorField = new JTextField(); 
        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField();
        JLabel costLabel = new JLabel("Cost:");
        costField = new JTextField();
        addButton = new JButton("Add Book");
        addButton.addActionListener(this);

        // Add components to panel
        mainPanel.add(titleLabel);
        mainPanel.add(titleField);
        mainPanel.add(authorLabel);
        mainPanel.add(authorField);
        mainPanel.add(categoryLabel);
        mainPanel.add(categoryField);
        mainPanel.add(costLabel);
        mainPanel.add(costField);
        mainPanel.add(new JLabel()); 
        mainPanel.add(addButton);

        
        this.add(mainPanel);

        
        this.setSize(400, 350); 
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            
            String title = titleField.getText();
            String author = authorField.getText(); 
            String category = categoryField.getText();
            float cost;
            try {
                cost = Float.parseFloat(costField.getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid cost format. Please enter a number.");
                return;
            }
            ArrayList<String> authors = new ArrayList<>();
            String[] auArray = author.split(",");
            for (String s : auArray) {
                authors.add(s);
            }
            Media book = new Book(title, category, cost,authors);
            store.addMedia(book);  

            
            titleField.setText("");
            authorField.setText(""); 
            categoryField.setText("");
            costField.setText("");

            
            JOptionPane.showMessageDialog(this, "Book added successfully!");
        }
    }

}

