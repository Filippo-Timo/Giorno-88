package filippotimo.Giorno_88.es3;

public class Capitano extends Tenente {

    @Override
    public void verify(int importo) {
        if (importo >= 2000) {
            System.out.println("Potrei essere un Capitano");
            this.next(importo);
        } else {
            System.out.println("Non potrei essere un Capitano");
        }
    }

}
