package hust.soict.ict.aims.media;
import java.util.ArrayList;

public class Book extends Media
{
    private int id;
    private String title;
    private String category;
    private float cost;
    ArrayList<String> authors = new ArrayList<String>();
    public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
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
    public void addAuthor(String authorName)
    {
        int exist=0;
        for (String i : authors) 
        {
            if(authorName.equals(i)==true) 
            {
                exist=1;
                break;
            }
        }
        if(exist==0)
        {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName)
    {
        int exist=0;
        int j=0;
        for (String i : authors) 
        {
            if(authorName.equals(i)==true) 
            {
                exist=1;
                break;
            }
            j++;
        }
        if(exist==1)
        {
            authors.remove(j);
        }
        else
        {
            System.out.println("this author is not exist");
        }
    }
    public String toStrings()
    {
        String text=String.format("Book - %s \t\t - %-20s - %s \t -%d \t %.2f\n",this.getTitle(),this.getCategory(),this.authors,this.getId(),this.getCost());
        return text;
    }
}
