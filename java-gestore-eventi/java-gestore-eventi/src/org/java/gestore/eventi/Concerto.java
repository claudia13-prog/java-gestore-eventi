package org.java.gestore.eventi;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
    //attributi
    private LocalTime ora;
    private double prezzo;

    //metodi

    //costruttore
    public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, double prezzo){
        super(titolo, data, postiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    
    // getter e setter ora
    
    public LocalTime getOra(){
        return this.ora;
    }

    public void setOra(LocalTime ora){
        this.ora = ora;
    }


    // getter e setter prezzo
    
    public double getPrezzo(){
        return this.prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
}
