class SongV3 implements Comparable<SongV3> {
	private String title;
	private String artist;
	private int bpm;
	
	/*---------------------------
			Constructors
	---------------------------*/
	
	SongV3(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}
	
	/*---------------------------
			Methods
	---------------------------*/
	
	// Using the built in compareTo() method from Comparable<>
	public int compareTo(SongV3 s) {
		return title.compareTo(s.getTitle());
	}	
	
	public String getTitle(){
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getBpm(){
		return bpm;
	}
	
	/*--------------------------
		Method Overriding
	----------------------------
	overriding the toString method. We don't want the default output of it
	It will override the default and give the title instead
	---------------------------*/
	public String toString() {
		return title;
	}
	