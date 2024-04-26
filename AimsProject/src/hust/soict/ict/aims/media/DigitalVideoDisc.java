package hust.soict.ict.aims.media;
public class DigitalVideoDisc extends Media
{
    private String title;
    private String category;
    private String director;
    private int lenght;
    private float cost;
    private static int nbDigitalVideoDisc=0;
    private int id;

    public DigitalVideoDisc(String title, String category, String director, int lenght, float cost, int id) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
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
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDisc+=1;
    }
    public DigitalVideoDisc(String title, String category, String director, int lenght, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
        this.cost = cost;
        nbDigitalVideoDisc+=1;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLenght() {
        return lenght;
    }
    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
<<<<<<< HEAD:AimsProject/src/hust/soict/ict/aims/disc/DigitalVideoDisc.java
    public String getId() {
=======
    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }
    public int getId() {
<<<<<<< HEAD
>>>>>>> topic/aims-project/addmedia-class:AimsProject/src/hust/soict/ict/aims/media/DigitalVideoDisc.java
=======
>>>>>>> topic/aims-project/addmedia-class
        return id;
    }
    
}