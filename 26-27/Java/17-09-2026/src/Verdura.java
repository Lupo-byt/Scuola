public enum Verdura {
    POMODORO("Pomodoro", "Frutto/Ortaggio", true),
    ZUCCHINA("Zucchina", "Cucurbitacea", true),
    INSALATA("Insalata", "A foglia", false),
    CAROTA("Carota", "Radice", true),
    BROCCOLO("Broccolo", "Crocifera", true),
    SPINACIO("Spinacio", "A foglia", true),
    CETRIOLO("Cetriolo", "Cucurbitacea", false),
    MELANZANA("Melanzana", "Solanacea", true),
    PEPERONE("Peperone", "Solanacea", true),
    CIPULLA("Cipolla", "Bulbo", true),
    AGLIO("Aglio", "Bulbo", true),
    PATATA("Patata", "Tubero", true),
    CAVOLFIORE("Cavolfiore", "Crocifera", true),
    PISELLO("Pisello", "Legume", true),
    FAGIOLINO("Fagiolino", "Legume", true),
    ZUCCA("Zucca", "Cucurbitacea", true),
    FINOCCHIO("Finocchio", "Umbellifera", true),
    RADICCHIO("Radicchio", "A foglia", true),
    SELVATICA("Rucola", "A foglia", false),
    CARCIOFO("Carciofo", "Composta", true);

    private final String nome;
    private final String categoria;
    private final boolean preferibilmenteCotta;

    Verdura(String nome, String categoria, boolean preferibilmenteCotta) {
        this.nome = nome;
        this.categoria = categoria;
        this.preferibilmenteCotta = preferibilmenteCotta;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isPreferibilmenteCotta() {
        return preferibilmenteCotta;
    }
}