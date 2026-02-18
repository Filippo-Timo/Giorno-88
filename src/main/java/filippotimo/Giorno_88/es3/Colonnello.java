package filippotimo.Giorno_88.es3;

public class Colonnello extends Maggiore {

    @Override
    public void verify(int importo) {
        if (importo >= 4000) {
            System.out.println("Potrei essere un Colonnello");
            this.next(importo);
        } else {
            System.out.println("Non potrei essere un Colonnello");
        }
    }

}
