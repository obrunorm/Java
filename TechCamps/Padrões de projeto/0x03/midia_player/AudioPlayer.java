public class AudioPlayer implements MediaPlayer{

    @Override
    public void reproduzir(TipoMedia tipoMedia ,String nomeTipoMidia) {
        if(tipoMedia.equals(TipoMedia.MP3)){
            System.out.print("Reproduzindo MP3: "+nomeTipoMidia);
        }
        else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter();
            mediaPlayerAdapter.reproduzir(tipoMedia, nomeTipoMidia);
        }
    }
}