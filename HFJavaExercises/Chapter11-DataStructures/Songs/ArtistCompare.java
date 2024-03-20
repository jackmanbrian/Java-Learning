class ArtistCompare implements Comparator<Songv3> {
	public int compare(SongV3 one, SongV3 two) {
		return one.getArtist().compareTo(two.getArtist());
	}
}

