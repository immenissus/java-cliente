package nov26;

public class CamiciaTest {
    public static void main(String[] args) {
        Camicia miaCamicia;
        miaCamicia = new Camicia(); 

        miaCamicia.camiciaID =1234;
        miaCamicia.descrizione = "Modello elegante in seta";
        miaCamicia.codiceColore = 'G';
        miaCamicia.prezzo = 45.75; // si usa punto per decimali
        miaCamicia.disponibili = 8;

        miaCamicia.mostra(); //stampo il riepilogo con tutte carateristice
    }
}
