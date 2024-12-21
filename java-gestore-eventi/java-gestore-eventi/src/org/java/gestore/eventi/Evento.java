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
        
        //controllo che la data non sia già passata
        if(data.isBefore(LocalDate.now())){
            System.out.println("Questa data è già passata");
            return;  // se la data è passata esce dal costruttore
        }

        //controllo che il numero di posti totali sia positivo
        if(postiTotali <= 0){
            System.out.println("Il numero di posti deve essere positivo");
            return; // se il numero di posti è negativo esce dal costruttore
        }

        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        this.postiPrenotati = 0;
    }

    // metodi getter e setter

    // titolo sia in lettura che in scrittura
    public String getTitolo(){
        return this.titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    // data sia in lettura che in scrittura
    public LocalDate getData(){
        return this.data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    // posti totali solo in lettura
    public int getPostiTotali(){
        return this.postiTotali;
    }

    // posti prenotati solo in lettura
    public int getPostiPrenotati(){
        return this.postiPrenotati;
    }

}
