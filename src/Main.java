public class Main {
    public static void main(String[] args) {
        System.out.println("Overload costruttori");

        /*
        * OVERLOADED CONSTRUCTORS:
        *
        * - Cosa sono?
        *
        * - Creare class pizza
        *
        * - Creare multipli costruttori
        *
        * - Stampa in vari modi
         */

/*---------------------------------------------------------------------------------------------------------*/

        // OVERLOADED CONSTRUCTORS COSA SONO:

        /*
        Attraverso l'Overload si possono creare costruttori ai quali poi passare parametri limitati o differenti.
        Naturalmente non possono creare due costruttori identici, genererebbe un errore!
        In sostanza gli overloaded constructors= un costruttore con lo stesso nome ripetuto più volte nel quale
        poter mettere solo quello di cui abbiamo bisogno.
        Ad esempio nel nostro caso potremmo voler creare una molteplicità di pizze differenti, alcune potrebbero
        essere delle semplici focacce, altre focacce condite, altre margherite ecc.
        Creando delle nuove pizze ci appoggeremo richiamando al costruttore più consono quando le andremo a
        richiamare nel Main.
         */

/*---------------------------------------------------------------------------------------------------------*/

        // STAMPE:
        /*

        Possiamo decidere di mandare a stampa quello che ci interessa e in diversi modi:

        1-) La pizza intera (da inserire ognuno nella stampa)
        2-) Solo alcuni ingredienti (basta ometterli in stampa)
        3-) Metodo override toString da richiamare nella classe Pizza
        4-) Mettere stampa nella classe pizza (Il programma risulterebbe più pulito e ordinato, lo consiglio!)
        5-) Mettere stampa nel Main
         */

/*-----------------------------------------------------------------------------------------------------------*/

        Pizza pizza1 =new Pizza("Farina 00 ", "Salsa di Pomodoro ", " Mozzarella di bufala ",
                "Salamino piccante", "Fontina");// Pizza completa
        System.out.println(pizza1); // Stampa con il metodo Override to.String

        Pizza pizza2 = new Pizza("Farina 00");// Focaccia / Stampa dalla classe Pizza


        Pizza pizza3 = new Pizza("Farina 00", "Lardo");// Focaccia condita / Stampa dalla classe Pizza

        Pizza pizza4 = new Pizza("Farina 00", "Salsa di pomodoro",
                "Mozzarella Fiordilatte");// Pizza Margherita / Stampa dal Main
        System.out.println("Pizza Margherita: l'impasto è fatto con farina di tipo " + pizza4.impasto +
                " con " + pizza4.salsa + " con " + pizza4.formaggio); // Stampa dal Main

        Pizza pizza5 = new Pizza("Integrale", "Mozzarella Fiordilatte", "Brie",
                "Pomodorini pachino"); // Pizza senza pomodoro / Stampa dalla classe Pizza
    }
}