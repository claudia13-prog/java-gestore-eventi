package org.java.gestore.eventi;
import java.util.List;
import java.util.ArrayList;

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
    
    //prove
    public static void main(String[] args) {
        ProgrammaEventi lista = new ProgrammaEventi("titolo");
        System.out.println(lista);
    }
}
