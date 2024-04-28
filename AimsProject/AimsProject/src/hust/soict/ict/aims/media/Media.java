package hust.soict.ict.aims.media;
public  class Media {
    //public static final Comparator COMPARE_BY_TITLE_COST=new MediaCompartorByCostTitle();
    //public static final Comparator COMPARE_BY_COST_TITLE=new MediaCompartorByTitleCost();
    protected int id; 
    protected String title;
    protected String category;
    protected float cost;
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
    public String toStrings()
    {
        return "a";
    }
    public void play()
    {
        return;
    }
    public static void main (String[] args)
    {

    }
    
}
