package hust.soict.ict.aims.screen;

import hust.soict.ict.aims.Store;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.media.Track;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddCompactDiscToStoreScreen extends JFrame implements ActionListener{
    private static Store store;
    private JTextField titleField;
    private JTextField directorField;
    private JTextField lengthField;
    private JTextField categoryField;
    private JTextField costField;
    private JTextField trackTitleField;
    private JTextField artistField;
    private JButton addButton;

    public AddCompactDiscToStoreScreen(Store store) {
        super("Add CD");
        this.store = store;

        JPanel mainPanel = new JPanel(new GridLayout(9, 2)); 

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel directorLabel = new JLabel("Director:");
        directorField = new JTextField();
        JLabel lengthLabel = new JLabel("Length (Use ',' to separate tracks):");  
        lengthField = new JTextField();
        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField();
        JLabel artistLabel = new JLabel("artist:");
        artistField = new JTextField();
        JLabel trackTitleLabel = new JLabel("Track title (Use ',' to separate tracks):");
        trackTitleField = new JTextField();
        JLabel costLabel = new JLabel("Cost:");
        costField = new JTextField();
        addButton = new JButton("Add CD");
        addButton.addActionListener(this);

        // Add components to panel
        mainPanel.add(titleLabel);
        mainPanel.add(titleField);
        mainPanel.add(directorLabel);
        mainPanel.add(directorField);
        mainPanel.add(lengthLabel);
        mainPanel.add(lengthField);
        mainPanel.add(categoryLabel);
        mainPanel.add(categoryField);
        mainPanel.add(artistLabel);
        mainPanel.add(artistField);
        mainPanel.add(trackTitleLabel);
        mainPanel.add(trackTitleField);
        mainPanel.add(costLabel);
        mainPanel.add(costField);
        mainPanel.add(new JLabel()); 
        mainPanel.add(addButton);

        this.add(mainPanel);

        this.setSize(400, 400); 
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {

            String title = titleField.getText();
            String director = directorField.getText();
            String category = categoryField.getText();
            String artist = artistField.getText();
            String trackTitle = trackTitleField.getText();
            String length = lengthField.getText();   
            float cost;
            try {
                cost = Float.parseFloat(costField.getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid cost format. Please enter a number.");
                return;
            }
            ArrayList<Track> tracks = new ArrayList<>();
            String[] trtArray = trackTitle.split(",");
            String[] lenArray = length.split(",");
            for (int i=0;i<trtArray.length;i++) {
                int lenElenment=Integer.parseInt(lenArray[i]);
                Track newtrack=new Track(trtArray[i],lenElenment);
                tracks.add(newtrack);
            }
            Media cd = new CompactDisc(title, category, director, artist, tracks, cost);
            store.addMedia(cd);

            titleField.setText("");
            directorField.setText("");
            lengthField.setText("");
            categoryField.setText("");
            artistField.setText("");
            trackTitleField.setText("");
            costField.setText("");

            JOptionPane.showMessageDialog(this, "DVD added successfully!");
        }
    }
}
