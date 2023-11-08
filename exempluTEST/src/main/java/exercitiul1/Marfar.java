package exercitiul1;

import java.time.LocalDateTime;

public class Marfar extends Tren
{
    private String marfa;

    public String getMarfa() {
        return marfa;
    }

    public void setMarfa(String marfa) {
        this.marfa = marfa;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Marfar{" +
                "marfa='" + marfa + '\'' +
                '}';
    }

    public Marfar(int numar_tren, int numar_vagoane, LocalDateTime ultima_revizie, String tip_tren, String marfa) {
        super(numar_tren, numar_vagoane, ultima_revizie, tip_tren);
        this.marfa = marfa;
    }

    public Marfar() {
    }
}
