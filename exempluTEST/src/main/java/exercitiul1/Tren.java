package exercitiul1;

import java.time.LocalDateTime;

public class Tren {
    private int numar_tren;
    private int numar_vagoane;
    private LocalDateTime ultima_revizie;
    private String tip_tren;

    @Override
    public String toString() {
        return "Tren{" +
                "numar_tren=" + numar_tren +
                ", numar_vagoane=" + numar_vagoane +
                ", ultima_revizie=" + ultima_revizie +
                ", tip_tren='" + tip_tren + '\'' +
                '}';
    }

    public Tren() {
    }


    public Tren(int numar_tren, int numar_vagoane, LocalDateTime ultima_revizie, String tip_tren) {
        this.numar_tren = numar_tren;
        this.numar_vagoane = numar_vagoane;
        this.ultima_revizie = ultima_revizie;
        this.tip_tren = tip_tren;
    }

    public int getNumar_tren() {
        return numar_tren;
    }

    public void setNumar_tren(int numar_tren) {
        this.numar_tren = numar_tren;
    }

    public int getNumar_vagoane() {
        return numar_vagoane;
    }

    public void setNumar_vagoane(int numar_vagoane) {
        this.numar_vagoane = numar_vagoane;
    }

    public LocalDateTime getUltima_revizie() {
        return ultima_revizie;
    }

    public void setUltima_revizie(LocalDateTime ultima_revizie) {
        this.ultima_revizie = ultima_revizie;
    }

    public String getTip_tren() {
        return tip_tren;
    }

    public void setTip_tren(String tip_tren) {
        this.tip_tren = tip_tren;
    }
}
