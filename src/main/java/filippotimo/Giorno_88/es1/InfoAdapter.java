package filippotimo.Giorno_88.es1;

import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource {

    private Info info;

    public InfoAdapter(Info info) {
        super();
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        // Qui semplicemente concateno le due stringhe nome e cognome per ottenerne una sola
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {

        // 1) Recupero la data di nascita da info
        Date dataDiNascita = info.getDataDiNascita();

        // 2) Creo un oggetto di tipo Calendar inizializzandolo alla data di oggi che mi servirà per la data di nascita
        Calendar nascita = Calendar.getInstance();

        // 3) Assegno all'oggetto di tipo Calendar nascita il valore della data di nascita
        nascita.setTime(dataDiNascita);

        // 4) Creo un oggetto di tipo Calendar con valore oggi al quale andrò a sottrarre il valore della data di nascita
        Calendar oggi = Calendar.getInstance();

        // 5) Effettuo l'operazione di sottrazione che mi restituisce l'età
        int eta = oggi.get(Calendar.YEAR) - nascita.get(Calendar.YEAR);
        return eta;

    }

}
