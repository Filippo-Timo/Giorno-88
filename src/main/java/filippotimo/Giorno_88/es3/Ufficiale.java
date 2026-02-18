package filippotimo.Giorno_88.es3;

import lombok.Setter;

@Setter
public abstract class Ufficiale {

    private Ufficiale next;

    public abstract void verify(int importo);

    public void next(int importo) {
        if (this.next != null) this.next.verify(importo);
        else System.out.println("Verifica terminata");
    }

}
