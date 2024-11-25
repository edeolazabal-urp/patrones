package creacionales.factorymethod.estructurales.adapter;

public class MP3Player implements MediaPlayer {
    @Override
    public void play(String tipoAudio, String archivo) {
        System.out.println("Reproduciendo MP3: " + archivo);
    }
}
