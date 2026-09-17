import java.util.List;

public class GeneratorePietanze {

    // Metodo per creare un piatto passando gli ingredienti specifici
    public Pietanza creaPiatto(BasePiatto base, List<Verdura> verdure, List<Spezia> spezie, TipoCottura cottura) {
        String nomePiatto = generaNome(base, verdure, spezie, cottura);
        return new Pietanza(nomePiatto, base, verdure, spezie, cottura);
    }

    // Generatore automatico del nome del piatto (stile menù di ristorante)
    private String generaNome(BasePiatto base, List<Verdura> verdure, List<Spezia> spezie, TipoCottura cottura) {
        StringBuilder nome = new StringBuilder();
        
        // 1. Aggiungo la base
        nome.append(base.getNome());

        // 2. Aggiungo la prima verdura di spicco (se presente)
        if (verdure != null && !verdure.isEmpty()) {
            nome.append(" con ").append(verdure.get(0).getNome());
            if (verdure.size() > 1) {
                nome.append(" e ").append(verdure.get(1).getNome()); // Ne cito al massimo due nel nome
            }
        }

        // 3. Aggiungo il tipo di cottura
        nome.append(" ").append(cottura.getDescrizione());

        // 4. Aggiungo il tocco della spezia
        if (spezie != null && !spezie.isEmpty()) {
            nome.append(" profumato/a al ").append(spezie.get(0).getNome());
        }

        return nome.toString();
    }
}