package esercizio;

public class ClienteTest {
    public static void main (String args[]) {
    Cliente mioCliente = new Cliente();
    // inizializzazione campi dell'istanza
    mioCliente.clienteID = 1542342123;
    mioCliente.statusCliente = true;
    mioCliente.aquisti = (float)(211.12);
    mioCliente.displayInfoCliente();
    }
    }
