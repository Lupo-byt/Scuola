import java.util.List;

public class CreazionePiatto {
    
    // Metodo che assembla e restituisce il piatto
    public Pietanze cucinaPiatto(String nome, List<Verdure> listaV, List<Spezie> listaS) {
        System.out.println("[CREAZIONE IN CORSO] Lo chef sta assemblando: " + nome + "...");
        
        // Crea l'istanza finale di Pietanze e la restituisce
        return new Pietanze(nome, listaV, listaS);
    }
}