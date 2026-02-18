package filippotimo.Giorno_88.es3;

public class Maggiore extends Capitano {

    @Override
    public void verify(int importo) {
        if (importo >= 3000) {
            System.out.println("Potrei essere un Maggiore");
            this.next(importo);
        } else {
            System.out.println("Non potrei essere un Maggiore");
        }
    }

}
