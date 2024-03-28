public class DigitalVideoDisc
{
    private String title;
    private String category;
    private String director;
    private int lenght;
    private float cost;
    private String id;
    private static int nbDigitalVideoDisc=0;
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
    
    public DigitalVideoDisc(String title, String category, String director, int lenght, float cost, String id) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.lenght = lenght;
        this.cost = cost;
        this.id = id;
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
    public String getId() {
        return id;
    }
    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
}