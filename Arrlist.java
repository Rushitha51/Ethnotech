import java.util.ArrayList;
public class Arrlist 
{
    public static void main(String[] args) 
    {
        ArrayList<String> songs = new ArrayList<>();
        // Add songs
        songs.add("Samajavaragamana");
        songs.add("Srivalli");
        songs.add("Naatu Naatu");
        songs.add("Nee Kannu Neeli Samudram");
        // Display playlist
        System.out.println("Playlist:");
        for(String song : songs) 
        {
            System.out.println(song);
        }
        // Get a song using index
        System.out.println("\nSong at index 1: " + songs.get(1));
        // Remove a song
        songs.remove("Srivalli");
        // Display playlist after removing
        System.out.println("\nPlaylist after removing a song:");
        for(String song : songs) 
        {
            System.out.println(song);
        }
        // Display total songs
        System.out.println("\nTotal Songs: " + songs.size());
    }
}