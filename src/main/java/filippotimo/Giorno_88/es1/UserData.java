package filippotimo.Giorno_88.es1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserData {

    private String nomeCompleto;
    private int eta;


    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

}

