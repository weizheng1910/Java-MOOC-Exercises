
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object anotherSong) {
        if (this == anotherSong) {
            return true;
        }

        if (!(anotherSong instanceof Song)) {
            return false;
        }
        
        Song anotherSongObject = (Song) anotherSong;
        
        if(this.artist == anotherSongObject.artist &&
           this.name == anotherSongObject.name &&
           this.durationInSeconds == anotherSongObject.durationInSeconds){
            return true;
        } 
        
        return false;

    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}