public abstract class Volume extends Document {
    protected String auteur;

    public Volume(int numero, String titre, String auteur) {
        super(numero, titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }
}