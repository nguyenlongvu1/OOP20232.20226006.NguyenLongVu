package hust.soict.ict.aims.media;

public class Track implements Playable
{
    private String trackTitle;
    private int length;
    public String getTrackTitle() {
        return trackTitle;
    }
    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.trackTitle = title;
        this.length = length;
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTrackTitle());
        System.out.println("DVD length: " + this.getLength());
       }
}
