import java.util.List;

public class Pietanze {
    private String nomePiatto;
    private List<Verdure> verdureContenute;
    private List<Spezie> spezieContenute;

    // Il costruttore riceve le liste degli ingredienti
    public Pietanze(String nomePiatto, List<Verdure> verdure, List<Spezie> spezie) {
        this.nomePiatto = nomePiatto;
        this.verdureContenute = verdure;
        this.spezieContenute = spezie;
    }

    public void descriviPiatto() {
        System.out.println("=== " + nomePiatto.toUpperCase() + " ===");
        
        System.out.println("Lista Verdure:");
        for (Verdure v : verdureContenute) {
            System.out.println(" - " + v.toString());
        }
        
        System.out.println("Lista Spezie:");
        for (Spezie s : spezieContenute) {
            System.out.println(" - " + s.toString());
        }
        System.out.println("==============================\n");
    }

    
}