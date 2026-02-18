package filippotimo.Giorno_88.es3;

import lombok.Setter;

@Setter
public class Tenente {

    private Tenente next;

    public void verify(int importo) {
        if (importo >= 1000) {
            System.out.println("Potrei essere un Tenente");
            this.next(importo);
        } else {
            System.out.println("Non potrei essere un Tenente");
        }
    }

    public void next(int importo) {
        if (this.next != null) this.next.verify(importo);
        else System.out.println("Verifica terminata");
    }

}
