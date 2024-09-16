import java.util.Scanner;
public class Main{
    public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        String Marca="";
        String Modello="";
        double Prezzo=0;
        int opzione=0;
        String [] ListaMarca=new String [10];
        String [] ListaModello=new String [10];
        double [] ListaPrezzo=new double[10];
        do
        {
            System.out.println("SELEZIONA UNA DELLE SEGUENTI OPZIONI");
            System.out.println("1- Aggiunta di una nuova auto");
            System.out.println("2- Visualizzazione di tutte le auto");
            System.out.println("3- Ricerca di un auto tramite marca e modello");
            System.out.println("4- Cancellazione di un'auto");
            System.out.println("5- Modifica dei dati di un'auto");
            System.out.println("6- Visualizzazione delle auto in ordine crescente");
            System.out.println("7- Visualizzare tutti i modelli che sono diesel");
            System.out.println("8- Fine");
            opzione =in.nextInt();
            switch (opzione)
        {
            case 1:
                System.out.println("Inserisci la marca dell'auto");
                Marca=in.nextLine();
                System.out.println("Inserisci il modello dell'auto");
                Modello=in.nextLine();
                System.out.println("Inserisci il prezzo dell'auto");
                Prezzo=in.nextDouble();
                AggiuntaAuto(Modello, Marca, Prezzo, ListaModello);
                break;

            case 2:
                LetturaAuto(ListaMarca, ListaModello, ListaPrezzo);
                for (int i=0;i<10;i++)
                {
                    System.out.println(ListaCompleta);
                }
            {

            }
        }
        } while (opzione!=8);
    }
    public static void AggiuntaAuto (String Modello, String Marca, double Prezzo, String[] ListaMarca, String[] ListaModello, String[] ListaPrezzo)
    {

        for (int i=0;i<ListaMarca.length;i++)
        {
            ListaMarca[i] = Marca;
            ListaModello[i] = Modello;
            ListaPrezzo[i] = Prezzo;
        }
    }
    public static String [] LetturaAuto (String [] ListaMarca, String [] ListaModello, double [] ListaPrezzo)
    {
        String [] ListaCompleta=new String [10];
        for (int i=0;i<ListaCompleta.length;i++)
        {
            ListaCompleta[i]=ListaMarca[i] + "," + ListaModello [i] + "," + ListaPrezzo[i];
        }
        return ListaCompleta;
    }
}