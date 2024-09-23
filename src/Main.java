import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main{
    public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        String Marca="";
        String Modello="";
        double Prezzo=0;
        int opzione=0;
        int indice=0;
        String [] ListaMarca=new String [10];
        String [] ListaModello=new String [10];
        String ListaTOT="";
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
                Marca=in.next();
                System.out.println("Inserisci il modello dell'auto");
                Modello=in.next();
                System.out.println("Inserisci il prezzo dell'auto");
                Prezzo=in.nextDouble();
                AggiuntaAuto(Modello, Marca, Prezzo, ListaMarca, ListaModello, ListaPrezzo,indice);
                indice++;
                break;

            case 2:

                    String ListaCompleta= LetturaAuto(ListaMarca, ListaModello, ListaPrezzo, indice);
                    System.out.println(ListaCompleta);

            break;

            case 3:
                System.out.println("Inserici la marca");
                Marca=in.next();
                System.out.println("Inserisci il modello");
                Modello=in.next();
                String AutoTrovata=RicercaAuto(Marca, Modello, indice, ListaMarca, ListaModello);
                System.out.println(AutoTrovata);
                break;

            case 4:
                System.out.println("Inserisci l'indice di dove si trova l'auto");
                indice=in.nextInt();
                CancellaAuto(ListaTOT, indice);
                break;

            case 5:
                break;

            case 6:
                OrdineCrescente(ListaPrezzo, ListaMarca, ListaModello);

                break;

        }
        } while (opzione!=8);
    }
    public static void AggiuntaAuto (String Modello, String Marca, double Prezzo, String[] ListaMarca, String[] ListaModello, double[] ListaPrezzo, int indice)
    {


            ListaMarca[indice] = Marca;
            ListaModello[indice] = Modello;
            ListaPrezzo[indice] = Prezzo;

    }
    public static String LetturaAuto (String [] ListaMarca, String [] ListaModello, double [] ListaPrezzo, int indice)
    {
        String ListaTOT="";
        for (int i=0;i<indice;i++)
        {
            ListaTOT+=ListaMarca[i] + "," + ListaModello [i] + "," + ListaPrezzo[i]+"\n";
        }
        return ListaTOT;
    }
    public static String RicercaAuto (String Marca, String Modello, int indice, String [] arrayMarca, String [] arrayModelli)
    {
        String TrovaAuto="";
        for (int i=0;i<indice;i++)
        {
            if(Marca.equalsIgnoreCase(arrayMarca[i]) && Modello.equalsIgnoreCase(arrayModelli[i]))
            {
                TrovaAuto+=Marca + ", " + Modello+"\n";
            }
        }
        return TrovaAuto;
    }
    public static void CancellaAuto (String ListaTOT, int indice)
    {
        for (int i=0;i<indice;i++)
        {
            if (i==indice)
            {
                ListaTOT="";
            }
        }
    }
    public static void Modifica ()
    {

    }
    public static void OrdineCrescente (double [] ListaPrezzo, String [] ListaMarca, String [] ListaModello)
    {
        int dim=ListaPrezzo.length;
        int posMin;
        double temp;
        String tempA="";
        String tempB="";
        for(int i=0; i<dim-1; i++)
        {
            posMin=i;
            for (int j=i+1; j<dim; j++)
            {
                if (ListaPrezzo[j]<ListaPrezzo[posMin])
                    posMin=j;

                temp=ListaPrezzo[i];
                ListaPrezzo[i]=ListaPrezzo[posMin];
                ListaPrezzo[posMin]=temp;

                tempA=ListaMarca[i];
                ListaMarca[i]=ListaMarca[posMin];
                ListaMarca[posMin]=tempA;

                tempB=ListaModello[i];
                ListaModello[i]=ListaModello[posMin];
                ListaModello[posMin]=tempB;
            }

        }
    }
}