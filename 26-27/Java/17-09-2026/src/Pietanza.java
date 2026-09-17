import java.util.List;
import java.util.stream.Collectors;

public class Pietanza {
    private String nomePiatto;
    private BasePiatto base;
    private List<Verdura> verdure;
    private List<Spezia> spezie;
    private TipoCottura cottura;

    public Pietanza(String nomePiatto, BasePiatto base, List<Verdura> verdure, List<Spezia> spezie, TipoCottura cottura) {
        this.nomePiatto = nomePiatto;
        this.base = base;
        this.verdure = verdure;
        this.spezie = spezie;
        this.cottura = cottura;
    }

    public void stampaRicetta() {
        System.out.println("🍽️  PIATTO: " + nomePiatto.toUpperCase());
        System.out.println("   - Base: " + base.getNome());
        System.out.println("   - Cottura: " + cottura.getDescrizione());
        
        if (!verdure.isEmpty()) {
            String nomiVerdure = verdure.stream().map(Verdura::getNome).collect(Collectors.joining(", "));
            System.out.println("   - Verdure utilizzate: " + nomiVerdure);
        }
        
        if (!spezie.isEmpty()) {
            String nomiSpezie = spezie.stream().map(Spezia::getNome).collect(Collectors.joining(", "));
            System.out.println("   - Spezie utilizzate: " + nomiSpezie);
        }
        System.out.println("--------------------------------------------------");
    }
}