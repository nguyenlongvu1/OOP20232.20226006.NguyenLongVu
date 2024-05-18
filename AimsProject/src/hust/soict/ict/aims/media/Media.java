package hust.soict.ict.aims.media;
import java.util.Comparator;
import hust.soict.ict.aims.exception.PlayerException;
public  class Media implements Comparable<Media>{
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    protected int id; 
    protected String title;
    protected String category;
    protected float cost;
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String toStrings()
    {
        return "a";
    }
    public void play()
    {
        return;
    }
    public String playInScreen()
    {
        return "a";
    }
    public int compareTo(Media other) {
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Double.compare(this.getCost(), other.getCost());
        }
    }
    public String playGUI() throws PlayerException 
    {
        if(this.getClass() == DigitalVideoDisc.class || this.getClass() == CompactDisc.class)
        {
            return this.playInScreen();  
        }
        return "Playing media";
    }
    
    public static void main (String[] args)
    {

    }
    
}
