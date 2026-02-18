package filippotimo.Giorno_88.es1;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class Info {

    private String nome;
    private String cognome;
    private Date dataDiNascita;


    // *************************** NOME ***************************

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // *************************** COGNOME ***************************

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    // *************************** DATA DI NASCITA ***************************

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

}
