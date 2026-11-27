package esercizio;

public class Cliente {
    public int clienteID;
    public boolean statusCliente;
    public float aquisti;

    public void displayInfoCliente(){
        if (statusCliente == true){
        aquisti = 0;
        }
        System.out.println("Id di cliente " + clienteID);
        System.out.println("Cliente è nuovo: " + statusCliente);
        System.out.println("Numero di aquisti totale: " + aquisti + " euro");
}
}
