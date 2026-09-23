public class Livre extends Volume {
    private String genre;

    public Livre(int numero, String titre, String auteur, String genre) {
        super(numero, titre, auteur);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}