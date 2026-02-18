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
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {

        // 1) Recupero la data di nascita da info
        Date dataDiNascita = info.getDataDiNascita();

        // 2) Creo un oggetto di tipo Calendar
        Calendar nascita = Calendar.getInstance();

        // 3) Assegno a nascita la data di nacita
        nascita.setTime(dataDiNascita);

        // 4) Creo un calendar con valore oggi
        Calendar oggi = Calendar.getInstance();

        int eta = oggi.get(Calendar.YEAR) - nascita.get(Calendar.YEAR);
        return eta;

    }

}
