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

    // metodo prenota: aggiunge uno ai posti prenotati.
    // Se l’evento è già passato o non ha posti disponibili deve restituire un messaggio di avviso.
    public void prenota(){
        //controllo che la data non sia già passata
        if(this.data.isBefore(LocalDate.now())){  
            System.out.println("Questa data è già passata");
            return;
        }
        //controllo che i posti non siano finiti
        if(this.postiPrenotati >= this.postiTotali){  
            System.out.println("Non ci sono più posti disponibili");

        }else{
            this.postiPrenotati += 1;
        }

    }

    // metodo disdici: riduce di uno i posti prenotati.
    // Se l’evento è già passato o non ci sono prenotazioni restituisce un messaggio di avviso.
    public void disdici(){
        //controllo che la data non sia già passata
        if(this.data.isBefore(LocalDate.now())){  
            System.out.println("Questa data è già passata");
            return;
        }
        //controllo se non ci sono prenotazioni
        if(this.postiPrenotati <= 0){  
            System.out.println("Non hai effettuato prenotazioni");

        }else{
            this.postiPrenotati -= 1;
        }
    }

    //prove
    public static void main(String[] args){
        Evento evento = new Evento("evento", LocalDate.of(2024, 12, 20), 10);

        evento.disdici();



        System.out.println(evento.getPostiPrenotati());
    }

}
