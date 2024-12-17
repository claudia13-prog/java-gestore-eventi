package org.java.gestore.eventi;
import java.time.LocalDate; // importo la classe LocalDate

public class Evento {
    
    // variabili d'istanza
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiPrenotati;

    // metodi

    // costruttore

    public Evento(String titolo, LocalDate data, int postiTotali){
        this.titolo = titolo;
        this.data =data;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;
    }





}
