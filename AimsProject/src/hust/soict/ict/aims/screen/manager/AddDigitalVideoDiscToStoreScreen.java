package hust.soict.ict.aims.screen.manager;

import hust.soict.ict.aims.Store.Store;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends JFrame implements ActionListener {

    private static Store store;
    private JTextField titleField;
    private JTextField directorField;
    private JTextField lengthField;
    private JTextField categoryField;
    private JTextField costField;
    private JTextField idField;
    private JButton addButton;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super("Add DVD");
        this.store = store;

        JPanel mainPanel = new JPanel(new GridLayout(8, 2)); 

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        JLabel directorLabel = new JLabel("Director:");
        directorField = new JTextField();
        JLabel lengthLabel = new JLabel("Length:");  
        lengthField = new JTextField();
        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField();
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        JLabel costLabel = new JLabel("Cost:");
        costField = new JTextField();
        addButton = new JButton("Add DVD");
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
        mainPanel.add(idLabel);
        mainPanel.add(idField);
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

            int length;   
            int id;
            float cost;

            try {
                length = Integer.parseInt(lengthField.getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid length format. Please enter a number.");
                return;
            }

            try {
                id = Integer.parseInt(idField.getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid ID format. Please enter a number.");
                return;
            }

            try {
                cost = Float.parseFloat(costField.getText());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Invalid cost format. Please enter a number.");
                return;
            }

            Media dvd = new DigitalVideoDisc(length, director, title, category, cost, id);
            store.addMedia(dvd);

            titleField.setText("");
            directorField.setText("");
            lengthField.setText("");
            categoryField.setText("");
            idField.setText("");
            costField.setText("");

            JOptionPane.showMessageDialog(this, "DVD added successfully!");
        }
    }
}
