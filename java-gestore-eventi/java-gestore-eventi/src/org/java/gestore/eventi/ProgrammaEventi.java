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

    //  metodo che restituisce una lista con tutti gli eventi presenti in una certa data
    public List<Evento> stessaData(LocalDate data){
        List<Evento> eventiStessaData = new ArrayList<>();
        
        for(Evento evento : this.eventi){
            if(evento.getData().equals(data)){
                eventiStessaData.add(evento);
            }
        }

        return eventiStessaData;
    }


    // metodo che restituisce quanti eventi sono presenti nel programma
    public int numeroEventi(){
        return this.eventi.size();
    }

    // metodo che svuota la lista di eventi
    public void svuotaLista(){
        this.eventi.clear();
    }


    //prove
    public static void main(String[] args) {
        ProgrammaEventi listaEventi = new ProgrammaEventi("Lista Eventi");
        Evento concerto = new Concerto("Concerto AC/DC", LocalDate.of(2025, 07, 20), 300, LocalTime.of(21, 0), 80.00);
        Evento compleanno = new Evento("compleanno", LocalDate.of(2025, 04, 13), 30);
        Evento meeting = new Evento("Meeting di lavoro", LocalDate.of(2025, 07, 20), 30);

        listaEventi.aggiungiEvento(concerto);
        listaEventi.aggiungiEvento(compleanno);
        listaEventi.aggiungiEvento(meeting);
        System.out.println(listaEventi.numeroEventi());
        listaEventi.svuotaLista();
        System.out.println(listaEventi.numeroEventi());
    }
}
