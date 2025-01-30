public class Estudiant {
    private String nom;
    private int edat;
    private double notaMitjana;
    
    public Estudiant(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public double getNotaMitjana() {
        return notaMitjana;
    }

    public void setNotaMitjana(double notaMitjana) {
        this.notaMitjana = notaMitjana;
    }

    private calculaNotaMitjana(double novaNota){
        this.notaMitjana = novaNota;
    }

    public actualitzaNotaMitjana(double novaNota){
        calculaNotaMitjana(novaNota);
    }

    @Override
    public String toString(){
        return this.nom + " - Nota Mitjana: " + notaMitjana;
    }
}
