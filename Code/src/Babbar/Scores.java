package Babbar;

import java.util.*;

public class Scores {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Song song[] = new Song[5];
		for (int i = 0; i < 5; i++) {
			int songId = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String artist = sc.nextLine();
			double duration = sc.nextDouble();
			sc.nextLine();
			song[i] = new Song(songId, title, artist, duration);
		}
		String artist1 = sc.nextLine();
		String artist2 = sc.nextLine();
		double sum = findSongDurationForArtist(song, artist1);
		Song s1[] = getSongsInAscendingOrder(song, artist2);
		if (sum > 0)
			System.out.printf("%.4f\n", sum);
		else
			System.out.println("There are no songs with given artist");
		if (s1 == null)
			System.out.println("There are no songs with given artist");
		else {
			for (Song ss : s1) {
				System.out.println(ss.getSongId());
				System.out.println(ss.getTitle());
			}
		}
	}

	public static double findSongDurationForArtist(Song songs[], String artist) {
		double sum = 0;
		for (Song s : songs) {
			if (s.getArtist().equalsIgnoreCase(artist))
				sum += s.getDuration();
		}
		return sum;
	}

	public static Song[] getSongsInAscendingOrder(Song songs[], String artist) {
		Song s1[] = new Song[songs.length];
		int i = 0;
		for (Song s : songs) {
			if (s.getArtist().equalsIgnoreCase(artist))
				s1[i++] = s;
		}
		if (i > 0) {
			Song s2[] = new Song[i];
			for (int j = 0; j < i; j++)
				s2[j] = s1[j];
			Arrays.sort(s2, new Comparator<Song>() {
				@Override
				public int compare(Song first, Song second) {
					if (first.getDuration() < second.getDuration())
						return -1;
					if (first.getDuration() > second.getDuration())
						return 1;
					return 0;
				}
			});
			return s2;
		}
		return null;
	}
}

class Song {
	private int songId;
	private String title;
	private String artist;
	private double duration;

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Song(int songId, String title, String artist, double duration) {
		super();
		this.songId = songId;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

}
/*
2150
In time
Justin Timberlake
4
250
Cry Me
Justin Timberlake
3
1200
Mirrors
Justin Timberlake
5
1300
That's the way it is
Celion Dion
5
500
Ashes
celion Dion 
3
celion dion
Justin Timberlake
  */
 
