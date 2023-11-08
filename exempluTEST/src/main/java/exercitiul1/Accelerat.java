package exercitiul1;

import java.time.LocalDateTime;

public class Accelerat extends Tren
{
    private int numar_locuri;
    private String vagon_restaurat;

    public Accelerat(int numar_tren, int numar_vagoane, LocalDateTime ultima_revizie, String tip_tren, int numar_locuri, String vagon_restaurat) {
        super(numar_tren, numar_vagoane, ultima_revizie, tip_tren);
        this.numar_locuri = numar_locuri;
        this.vagon_restaurat = vagon_restaurat;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Accelerat{" +
                "numar_locuri=" + numar_locuri +
                ", vagon_restaurat='" + vagon_restaurat + '\'' +
                '}';
    }

    public int getNumar_locuri() {
        return numar_locuri;
    }

    public void setNumar_locuri(int numar_locuri) {
        this.numar_locuri = numar_locuri;
    }

    public String getVagon_restaurat() {
        return vagon_restaurat;
    }

    public void setVagon_restaurat(String vagon_restaurat) {
        this.vagon_restaurat = vagon_restaurat;
    }


}
