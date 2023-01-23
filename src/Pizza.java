public class Pizza {


    // Parametri solo dichiarati
    String impasto;
    String salsa;
    String formaggio;
    String extra;
    String extra2;

    // Creiamo costruttore per pizza con tutti gli ingredienti:
    public Pizza(String impasto, String salsa, String formaggio, String extra, String extra2) {
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        this.extra2 = extra2;
    }

    // CREARE MULTIPLI COSTRUTTORI:

    // Creiamo costruttore per solo focaccia:
    public Pizza(String impasto) {
        this.impasto = impasto;
        System.out.println("Focaccia bianca: l'impasto è fatto con farina di tipo " + impasto);
    }

    // NON SI POSSONO CREARE I METODI IDENTICI, GENERA ERRORE!
    /* Creiamo costruttore per solo focaccia:
    public Pizza(String impasto) {
        this.impasto = impasto;
    } */

    // Creiamo costruttore per focaccia farcita:
    public Pizza(String impasto, String extra) { // overload
        this.impasto = impasto;
        this.extra = extra;
        System.out.println("Focaccia farcita: l'impasto è fatto con farina di tipo " + impasto +
                " con l'aggiunta del " + extra);
    }

    // Creiamo costruttore per pizza margherita:
    public Pizza(String impasto, String salsa, String formaggio) { // overload
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
    }

    // Creiamo costruttore pizza senza salsa impasto integrale:
    public Pizza(String impasto, String formaggio, String extra, String extra2) { // overload
        this.impasto = impasto;
        this.formaggio = formaggio;
        this.extra = extra;
        this.extra2 = extra2;
        System.out.println("Pizza senza pomodoro: l'impasto è fatto con farina di tipo " + impasto +
                " con " + formaggio + " con il " + extra + " e con " + extra2);
    }

    /*-------------------------------------------------------------------------------------------------------*/

    //METODO TOSTRING:

    /*  QUESTO É UN METODO IN AGGIUNTA PER POTER STAMPARE DAL MAIN SE CI DOVESSE SERVIRE LE STRINGHE CHE
        DEFINISCONO I VALORI DELL'OGGETTO, ESEMPIO PIZZA1 : la stampa risulterebbe un pò strana ma così è. */

    @Override
    public String toString() {
        return "Pizza{" +
                "impasto='" + impasto + '\'' +
                ", salsa='" + salsa + '\'' +
                ", formaggio='" + formaggio + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
