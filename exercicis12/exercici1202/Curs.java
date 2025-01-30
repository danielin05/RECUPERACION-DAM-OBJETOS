import java.util.ArrayList;

public class Curs {
    private String nomCurs, professor;
    private ArrayList<Estudiant> llistaEstudiants;

    
    public Curs(String nomCurs, String professor) {
        this.nomCurs = nomCurs;
        this.professor = professor;
        this.llistaEstudiants = new ArrayList<>();
    }


    public String getNomCurs() {
        return nomCurs;
    }


    public void setNomCurs(String nomCurs) {
        this.nomCurs = nomCurs;
    }


    public String getProfessor() {
        return professor;
    }


    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void afegeixEstudiant(Estudiant estudiant){
        llistaEstudiants.add(estudiant);
    }

    public void eliminaEstudiant(String nom){
        for (int i = 0; i < llistaEstudiants.size(); i++) {
            if (llistaEstudiants.get(i).getNom().equals(nom)) {
                llistaEstudiants.remove(i);
                break;
            }
        }
    }

    public void mostraEstudiants(){
        for (Estudiant e : llistaEstudiants){
            System.out.println(e);
        }
    }
}
