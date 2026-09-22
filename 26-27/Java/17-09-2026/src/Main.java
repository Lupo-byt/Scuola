import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // 1. Creiamo un po' di ingredienti base
        Verdure patata = new Verdure("Patata", 200);
        Verdure zucchina = new Verdure("Zucchina", 150);
        Verdure melanzana = new Verdure("Melanzana", 250);
        
        Spezie pepe = new Spezie("Pepe Nero", "Forte");
        Spezie paprika = new Spezie("Paprika", "Dolce");
        
        // 2. Creiamo le liste degli ingredienti per il primo piatto
        List<Verdure> verdurePerForno = new ArrayList<>();
        verdurePerForno.add(patata);
        verdurePerForno.add(melanzana);
        
        List<Spezie> speziePerForno = new ArrayList<>();
        speziePerForno.add(paprika);
        speziePerForno.add(pepe);
        
        // 3. Istanziamo il nostro "assemblatore"
        CreazionePiatto chef = new CreazionePiatto();
        
        // 4. Facciamo creare il piatto passando le liste
        Pietanze tegliaAlForno = chef.cucinaPiatto("Teglia di Verdure al Forno", verdurePerForno, speziePerForno);
        
        // 5. Mostriamo il risultato finale
        tegliaAlForno.descriviPiatto();
        
        // -- Esempio rapido per un secondo piatto --
        List<Verdure> verdureBollite = new ArrayList<>();
        verdureBollite.add(zucchina);
        
        List<Spezie> spezieZero = new ArrayList<>(); // Piatto scondito, lista vuota
        
        Pietanze zucchineLight = chef.cucinaPiatto("Zucchine lesse", verdureBollite, spezieZero);
        zucchineLight.descriviPiatto();
    }
}