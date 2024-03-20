class EpisodeTestDrive {
	public static void main (String[] args) {
		
		Episode episode = new Episode();
		episode.episodeNumber = 3;
		episode.seriesNumber = 4;
		episode.play();
		episode.skipIntro();
	}
}