package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable
{
    private String artist;
    ArrayList<Track> tracks = new ArrayList<Track>(); 
    private String title;
    private String category;
    private float cost;
    public CompactDisc(String title,String categorty,String director, String artist, ArrayList<Track> tracks, float cost) {
        super(director);
        this.title=title;
        this.category=categorty;
        this.cost=cost;
        this.artist = artist;
        this.tracks = tracks;
    }
    public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
    }
    public CompactDisc( String director, String artist,String category, float cost) {
        super(director);
        this.artist = artist;
        this.category = category;
        this.cost = cost;
    }

    public String getArtist() {
        return artist;
    }
    
    public ArrayList<Track> getTracks() {
        return tracks;
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
    public int getLength()
    {
        int sum=0;
        for(Track i: tracks)
        {
            if(i==null) break;
            sum=sum+i.getLength();
        }
        return sum;
    }
    public boolean equals(Track newTrack)
    {
        for(Track t : tracks )
        {
            if(t.getTrackTitle().equals(newTrack.getTrackTitle())&&t.getLength()==newTrack.getLength())
            {
                return false;
            }
        }
        return true;
    }

    public void addTrack(Track track)
    {
        int exist=0;
        for (Track i : tracks) 
        {
            if(track.equals(i)==true) 
            {
                exist=1;
                break;
            }
        }
        if(exist==0)
        {
            tracks.add(track);
        }
    }
    public void removeTrack(Track track)
    {
        int exist=0;
        int j=0;
        for (Track i: tracks) 
        {
            if(track.equals(i)==true) 
            {
                exist=1;
                break;
            }
            j++;
        }
        if(exist==1)
        {
            tracks.remove(j);
        }
        else
        {
            System.out.println("this track is not exist");
        }
    }
    public String toStrings()
    {
        String text=String.format("CD - %s \t\t - %-20s - %s \t -%d \t %.2f\n",this.getTitle(),this.getCategory(),this.artist,this.getId(),this.getCost());
        return text;
    }
    public void play() {
        for(Track i : tracks)
        {
            i.play();
        }
    }
    public String playInScreen()
    {
        String text="";
        for(Track i : tracks)
        {
            text+=i.playTrackInScreen();
        }
        return text;
    }
    
}
