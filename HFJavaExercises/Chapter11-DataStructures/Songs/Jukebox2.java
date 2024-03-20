import java.util.Collections;
import java.util.List;

public class Jukebox4 {
	
	// Main method //
	
	public static void main(String[] args) {
		new Jukebox4().go();
	}
	
	//----------------------
	// 		go() method    
	//----------------------
	// calls the mock class to laod song data into the list of songs
	// calls the sort method to sort the songs alphabetically
	
	public void go() {
		List<SongV3> songList = MockSongs.getSongsV3();
		System.out.println(songList);
		
		Collections.sort(songList);
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		songList.sort(artistCompare);
		System.out.println(songList);
	}
}