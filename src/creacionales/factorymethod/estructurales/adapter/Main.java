package creacionales.factorymethod.estructurales.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AdaptadorMedia();
        player.play("MP4", "video.mp4");

        MediaPlayer player2 = new MP3Player();
        player2.play("MP3", "audio.mp3");
    }
}
