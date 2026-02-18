package filippotimo.Giorno_88;

import filippotimo.Giorno_88.es1.Info;
import filippotimo.Giorno_88.es1.InfoAdapter;
import filippotimo.Giorno_88.es3.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class Giorno88Application {

    public static void main(String[] args) {
        SpringApplication.run(Giorno88Application.class, args);

        // TODO: ************************* PRIMO ESERCIZIO *************************

        // 1) Creo un oggetto di tipo Calendar con data oggi (equivalente di LocalDate.now())
        Calendar compleanno = Calendar.getInstance();

        // 2) Imposto la data dell'oggetto precedentemente creato alla data del mio compleanno
        compleanno.set(2002, 12, 06);

        // 3) Converto l'oggetto Calendar con il mio compleanno in un oggetto di tipo Date
        Date dataDiNascita = compleanno.getTime();

        // 4) Creo un oggetto di tipo Info con due stringhe e l'oggetto di tipo Date del terzo step
        Info info = new Info("Filippo", "Timo", dataDiNascita);

        // 4) Creo un oggetto di tipo InfoAdapter con l'oggetto di tipo Info
        InfoAdapter infoAdapter = new InfoAdapter(info);

        // 5) Stampo in console i due metodi
        System.out.println(infoAdapter.getNomeCompleto() + " " + infoAdapter.getEta());

        // TODO: ************************* SECONDO ESERCIZIO *************************


        // TODO: ************************* TERZO ESERCIZIO *************************

        // 1) Creo un oggetto di tipo int con l'importo da verificare
        int importo = 3600;

        // 2) Creo gli oggetti che fungeranno da "filtri" nella mia verifica
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        // 3) Organizzo la chain
        tenente.setNext(capitano);
        capitano.setNext(maggiore);
        maggiore.setNext(colonnello);
        colonnello.setNext(generale);

        // 4) Passo l'importo da verificare nella chain
        tenente.verify(importo);

    }
}
