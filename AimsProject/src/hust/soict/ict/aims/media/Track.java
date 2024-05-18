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
        System.out.println("Playing Track: " + this.getTrackTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public String playTrackInScreen()
    {
        String text=String.format("Playing Track: %s\nTrack length: %s\n",this.getTrackTitle(),this.getLength());
        return text;
    }
}
