import javax.print.attribute.standard.Media;

public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if(!tipoMedia.equals(TipoMedia.MP3)){
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    public MediaPlayerAdapter() {
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia,String nomeTipoMidia) {
        if(tipoMedia.equals(TipoMedia.VLC)){
            System.out.print("Reproduzindo VLC: "+nomeTipoMidia);
        }
    }
}