public class MusicPlayer implements Device {
    private String playlist;

    public void turnOn() {
        playPlaylist("Default Playlist");
    }

    public void turnOff() {
        System.out.println("Music player turned off");
    }

    public void execute(String command) {
        if (command.equals("Play Playlist")) {
            playPlaylist("My Favorite Playlist");
        }
    }

    private void playPlaylist(String playlist) {
        this.playlist = playlist;
        System.out.println("Playing: " + this.playlist);
    }
}
