package org.java.gestore.eventi;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class ProgrammaEventi {
    //attributi
    private String titolo;
    List<Evento> eventi;

    //metodi

    //costruttore
    public ProgrammaEventi(String titolo){
        this.titolo = titolo;
        this.eventi = new ArrayList<>();
    }

    // metodo che aggiunge alla lista un Evento, passato come parametro
    public void aggiungiEvento(Evento evento){
        this.eventi.add(evento);
    }





    //prove
    public static void main(String[] args) {
        ProgrammaEventi listaEventi = new ProgrammaEventi("Lista Eventi");
        Evento concerto = new Concerto("AC/DC", LocalDate.of(2025, 07, 20), 300, LocalTime.of(21, 0), 80.00);
        Evento compleanno = new Evento("compleanno", LocalDate.of(2025, 04, 13), 30);
        Evento meeting = new Evento("Meeting di lavoro", LocalDate.of(2025, 07, 20), 30);

        listaEventi.aggiungiEvento(concerto);
        listaEventi.aggiungiEvento(compleanno);
        listaEventi.aggiungiEvento(meeting);
        System.out.println(listaEventi.eventi);
    }
}
