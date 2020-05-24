import java.util.HashMap;

public class KartenSort {

    private int zwei = 2;   //Den KartenWerten einen Namen geben
    private int drei = 3;
    private int vier = 4;
    private int fuenf = 5;
    private int sechs = 6;
    private int sieben = 7;
    private int acht = 8;
    private int neun = 9;
    private int zehn = 10;
    private int koenig = 10;
    private int dame = 10;
    private int bube = 10;
    private int ass = 11;

    public int[] liste ={drei,zwei,fuenf,vier,koenig,sieben,ass};
    public int[] sortieren(){

        int unsortiert;
        for(int sortiert = 0; sortiert < liste.length -1; sortiert++){

            if(liste[sortiert] <= liste[sortiert+1]){
                continue;
            }

        unsortiert = liste[sortiert];
            liste[sortiert] = liste[sortiert+1];
            liste[sortiert+1] = unsortiert;
            sortieren();
        }
    return  liste;
    }

    public static void  main (String[] args){

        HashMap<Integer,String> numbers = new HashMap<>();
        numbers.put(2, "zwei");
        numbers.put(3, "drei");
        numbers.put(4, "vier");
        numbers.put(5, "fuenf");
        numbers.put(6, "sechs");
        numbers.put(7, "sieben");
        numbers.put(8, "acht");
        numbers.put(9, "neun");
        numbers.put(10, "zehn");
        numbers.put(10, "koenig");
        numbers.put(10, "dame");
        numbers.put(10, "bube");
        numbers.put(11, "ass");

        KartenSort bs = new KartenSort();
        int[] array = bs.sortieren();
        for (int sortiert=0;sortiert < array.length; sortiert++){
            System.out.println(numbers.get(array[sortiert]));
        }

    }

}
