public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String nomeVLC) {
        System.out.println("Reproduzindo VLC: "+nomeVLC);
    }

    @Override
    public void reproduzirMp4(String nomeMP4) {
        System.out.print("Reproduzindo MP4: "+nomeMP4);
    }
}