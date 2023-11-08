package exercitiul1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;


public class MainApp {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Set<Tren> setOfTrains = new HashSet<>();
        Set<Tren> setOfAccelerat = new HashSet<>();

        List<Tren> trenuriSortate;

        BufferedReader flux_in;
        String linie;

        int set_nr_locuri = 1;

        flux_in=new BufferedReader(new FileReader("Trenuri.txt"));

        do{
            try{
                System.out.println("Introduceti numarul de locuri:");
                set_nr_locuri=Integer.parseInt(scanner.nextLine());

                if(set_nr_locuri<0 || set_nr_locuri>50)
                    throw new NumberFormatException();
            }
            catch (NumberFormatException e)
            {
                System.err.println("Valoarea introdusa nu este valida. Introduceti un numar valid (>=0 si <50)");
            }
        }while (set_nr_locuri<0 || set_nr_locuri>50);

        while((linie=flux_in.readLine())!=null)
        {
            String [] data;
            data = linie.split(";");

            String tip_tren = data[0];
            int numar_tren = Integer.parseInt(data[1]);
            int numar_vagoane = Integer.parseInt(data[2]);
            LocalDateTime ultima_revizie = LocalDateTime.parse(data[3]);

            int numar_locuri;
            String vagon_restaurat;

            String marfa;

            if(tip_tren.equals("tren"))
            {
                Tren tren =new Tren(numar_tren,numar_vagoane,ultima_revizie,tip_tren);
                setOfTrains.add(tren);
            } 
            else if (tip_tren.equals("accelerat"))
            {

                numar_locuri = Integer.parseInt(data[4]);
                vagon_restaurat = data[5];

                Accelerat accelerat =new Accelerat(numar_tren,numar_vagoane,ultima_revizie,tip_tren,numar_locuri,vagon_restaurat);

                if(numar_locuri >= set_nr_locuri)
                {
                    setOfAccelerat.add(accelerat);
                }

                setOfTrains.add(accelerat);
            }
            else if (tip_tren.equals("marfar"))
            {
                marfa = data[4];

                Marfar marfar = new Marfar(numar_tren,numar_vagoane,ultima_revizie,tip_tren,marfa);
                setOfTrains.add(marfar);
            }

        }


        for (Tren tren:setOfTrains)
        {
            System.out.println(tren.toString());

        }

        System.out.println("Cerinta numarul 2: ");

        if(setOfAccelerat.isEmpty())
            System.out.println("Nu exista trenuri cu numarul de locuri mai mare decat cel introdus de dumneavoastra!");

        for (Tren tren:setOfAccelerat)
        {
            System.out.println(tren.toString());
        }


        System.out.println("Cerinta numarul 3(sortare): ");
        trenuriSortate = new ArrayList<>(setOfTrains);
        Collections.sort(trenuriSortate, new Comparator<Tren>() {
            @Override
            public int compare(Tren o1, Tren o2) {
                return o1.getNumar_tren() - o2.getNumar_tren();
            }
        });
        for (Tren tren: trenuriSortate)
        {
            System.out.println(tren.toString());
        }

    }

}
