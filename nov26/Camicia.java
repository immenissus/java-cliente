package nov26;
public class Camicia {
    
    public int camiciaID; //variabile numerica intera
    public String descrizione = "-descrizione mancante-"; //variabile testutale tipo partinente string
    //codici colori R-red B W, U-unset
    public char codiceColore ='U'; //variablie car singolo, tipo char
    public double prezzo; //double variabile decimale
    public int disponibili; //variabile numerica intera

    public void mostra() {
        System.out.println("Id della camicia: " + camiciaID);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Codice colore: " + codiceColore);
        System.out.println("Prezzo unitario: " + prezzo + " euro");
        System.out.println("Prezzi disponibili: " + disponibili);
        
    }
}
