package hust.soict.ict.aims.media;
public class DigitalVideoDisc extends Disc implements Playable
{
    private String title;
    private String category;
    private float cost;
    private static int nbDigitalVideoDisc=0;
    private int id;
    
    public DigitalVideoDisc(int length, String director, String title, String category, float cost, int id) {
        super(length, director);
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    public DigitalVideoDisc(int length, String title, String category, float cost, int id) {
        super(length);
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    public DigitalVideoDisc(String director, String title, String category, float cost, int id) {
        super(director);
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    public DigitalVideoDisc(String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
        super(length,director);
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDisc+=1;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc+=1;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(director);
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc+=1;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(length,director);
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc+=1;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }
    public int getId() {
        return id;
    }
    
    public String toStrings()
    {
        String text=String.format("DVD - %s \t\t - %-20s - %s \t -%d \t %.2f\n",this.getTitle(),this.getCategory(),this.getDirector(),this.getLength(),this.getCost());
        return text;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public String playInScreen()
    {
        String text=String.format("Playing DVD: %s\nDVD length: %s",this.getTitle(),this.getLength());
        return text;
    }
    
}