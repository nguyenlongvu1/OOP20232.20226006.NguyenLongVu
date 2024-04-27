package hust.soict.ict.aims.media;

public class Disc extends Media{
    private int length;
    private String director;
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    public Disc(int length, String director) {
        this.length = length;
        this.director = director;
    }
    public Disc(int length) {
        this.length = length;
    }
    public Disc(String director) {
        this.director = director;
    }
    public String toStrings()
    {
        return "a";
    }
    public Disc() {
    }
    
}
