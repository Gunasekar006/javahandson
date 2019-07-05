package linkedList;

public class Song {
	public static String title;
	public static double duration;

	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;

	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Song.title = title;
	}

	public static double getDuration() {
		return duration;
	}

	public static void setDuration(double duration) {
		Song.duration = duration;
	}

	
	
	
	
}
