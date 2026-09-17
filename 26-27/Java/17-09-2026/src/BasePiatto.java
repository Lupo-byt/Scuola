public enum BasePiatto {
    PASTA("Pasta"),
    RISO("Risotto"),
    CARNE("Tagliata di carne"),
    PESCE("Filetto di pesce"),
    TOFU("Tofu"),
    SOLO_VERDURE("Insalatona");

    private final String nome;

    BasePiatto(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
}

public enum TipoCottura {
    FORNO("al forno"),
    PADELLA("saltato in padella"),
    VAPORE("al vapore"),
    GRIGLIA("alla griglia"),
    CRUDO("servito a crudo");

    private final String descrizione;

    TipoCottura(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() { return descrizione; }
}