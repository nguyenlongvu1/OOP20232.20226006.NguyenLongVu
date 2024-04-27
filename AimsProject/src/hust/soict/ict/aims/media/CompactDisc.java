package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    ArrayList<Track> tracks = new ArrayList<Track>(); 
    public String getArtist() {
        return artist;
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
    public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
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
        String text=String.format("Book - %s \t\t - %-20s - %s \t -%d \t %.2f\n",this.getTitle(),this.getCategory(),this.artist,this.getId(),this.getCost());
        return text;
    }
}
