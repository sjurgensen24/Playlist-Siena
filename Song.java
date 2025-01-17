/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private int min;
    private int sec;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myName, String myArtist, int myMin, int mySec){
        name = myName;
        artist = myArtist;
        min = myMin;
        sec = mySec;
        liked = false;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName(){
        return name;
    }

    public String getArtist(){
        return artist;
    }

    public int getMinutes(){
        return min;
    }

    public int getSeconds(){
        return sec;
    }

    public boolean getIfLiked(){
        return liked;
    }

    public String toString(){
        return name + "by" + artist + "(" + min + ":" + sec + ")";
    }

    public void like(){
        name += "-- liked";
        liked = true;
    }

    public void unlike(){
        String unliked = "";
        unliked += name.substring(0, name.length() - 8);
        name = unliked;
        liked = false;
    }
}
