package filippotimo.Giorno_88.es3;

import lombok.Setter;

@Setter
public class Tenente extends Ufficiale {

    @Override
    public void verify(int importo) {
        if (importo >= 1000) {
            System.out.println("Potrei essere un Tenente");
            this.next(importo);
        } else {
            System.out.println("Non potrei essere un Tenente");
        }
    }

}
