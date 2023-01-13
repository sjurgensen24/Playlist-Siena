import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        playlist = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    public void addSong(Song s){
        playlist.add(s);
    }

    public void removeSong(int pos){
        playlist.remove(pos);
    }

    public void like(int pos){
        Song s = playlist.get(pos);
        s.like();
    }

    public String printAllSongs(){
        String allSongs = "";
        for (int i = 0; i < playlist.size() - 1; i++){
            allSongs += playlist.get(i).toString();
        }
        return allSongs;
    }

    public String printLikedSongs(){
        String likedSongs = "";
        for (int i = 0; i < playlist.size() - 1; i++){
            if (playlist.get(i).getIfLiked() == true){
                likedSongs += playlist.get(i).toString();
            }
        }
        return likedSongs;
    }

    public int totalMin(){
        int totalMin = 0;
        for (int i = 0; i < playlist.size() - 1; i++){
            totalMin += playlist.get(i).getMinutes();
        }
        return totalMin;
    }

    public int totalSec(){
        int totalSec = 0;
        for (int i = 0; i < playlist.size() - 1; i++){
            totalSec += playlist.get(i).getSeconds();
        }
        return totalSec;
    }

    public void removeUnliked(){
        for (int i = 0; i < playlist.size() - 1; i++){
            if(playlist.get(i).getIfLiked() == false){
                playlist.remove(i);
                i--;
            }
        }
    }
}
