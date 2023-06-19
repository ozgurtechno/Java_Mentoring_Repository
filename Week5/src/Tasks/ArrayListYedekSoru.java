package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListYedekSoru {
    public static void main(String[] args) {

        // Elemanları Türkiye ,  Almanya, Fransa, Italya ve Kanada olan ArrayList oluşturun.
        // parametresi   String ArrayList olan bir method oluşturun arrayListteki değerleri tersten sıralasın ve yazdırsın.

        //    ilk hali     :   [Türkiye, Almanya, Fransa, Italya, Kanada]
        //    Tersten hali :   [Kanada, Italya, Fransa, Almanya, Türkiye]

        terstenSirala(ulkeEkle());
        terstenSirala2(ulkeEkle());

    }
    public static ArrayList<String> ulkeEkle(){
        ArrayList<String> ulkeler= new ArrayList<>(Arrays.asList("Türkiye", "Almanya", "Fransa", "Italya", "Kanada"));
        System.out.println(ulkeler);

        return ulkeler;
    }

    public static void terstenSirala(ArrayList<String> ulke){

        ArrayList<String> tersi= new ArrayList<>();

        for (int i =ulke.size()-1 ; i >=0 ; i--) {
            tersi.add(ulke.get(i));
        }
        System.out.println(tersi);
    }

    public static void terstenSirala2(ArrayList<String> ulke){
        Collections.reverse(ulke);
        System.out.println(ulke);
    }
}
