package org.java.gestore.eventi;
import java.time.LocalDate;
import java.time.LocalTime;
import java.text.DecimalFormat;

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

    // metodo per restituire data e ora formattata
    public String getDataOraFormattata(){
        return getDataFormattata() + " " + getOra();
    }

    // metodo per restituire prezzo formattato
    public String getPrezzoFormattato(){
        DecimalFormat formattazioneDecimale = new DecimalFormat("##.##");
        return formattazioneDecimale.format(this.prezzo) + " E";
    }

    // override del metodo toString() che restituisce una stringa del tipo: data e ora formattata - titolo - prezzo formattato
    @Override
    public String toString(){
        return getDataOraFormattata() + " - " + getTitolo() + " - " + getPrezzoFormattato();
    }


}
