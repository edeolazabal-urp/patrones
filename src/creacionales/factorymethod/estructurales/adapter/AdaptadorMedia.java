package creacionales.factorymethod.estructurales.adapter;

public class AdaptadorMedia implements MediaPlayer {
    private MediaPlayerAvanzado mpAvanzado = new MediaPlayerAvanzado();

    @Override
    public void play(String tipoAudio, String archivo) {
        if (tipoAudio.equalsIgnoreCase("MP4")) {
            mpAvanzado.playMP4((archivo));
        }
    }
}
