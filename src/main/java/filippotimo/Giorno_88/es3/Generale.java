package filippotimo.Giorno_88.es3;

public class Generale extends Colonnello {

    @Override
    public void verify(int importo) {
        if (importo >= 5000) {
            System.out.println("Potrei essere un Generale");
            this.next(importo);
        } else {
            System.out.println("Non potrei essere un Generale");
        }
    }

}
