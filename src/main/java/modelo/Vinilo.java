package modelo;

public class Vinilo {
    private String artista;
    private String disco;
    private int fecha;

    public Vinilo(String artista, String disco, int fecha) {
        this.artista = artista;
        this.disco = disco;
        this.fecha = fecha;
    }

    public String getArtista() {
        return artista;
    }

    public String getDisco() {
        return disco;
    }

    public int getFecha() {
        return fecha;
    }

    public String getIdentificador() {
        return artista.toLowerCase() + "-" + disco.toLowerCase();
    }

    @Override
    public String toString() {
        return artista + " - \"" + disco + "\" (" + fecha + ")";
    }
}

