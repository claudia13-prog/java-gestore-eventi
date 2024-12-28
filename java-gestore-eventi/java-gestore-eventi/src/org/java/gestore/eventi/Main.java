package org.java.gestore.eventi;
import java.time.LocalDate; // importo la classe LocalDate
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // chiedo all’utente di inserire un nuovo evento con tutti i parametri
        Scanner scanner = new Scanner(System.in);

        // input per il titolo
        System.out.println("Inserisci il titolo dell'evento:");
        String inputTitolo = scanner.nextLine();

        // input per la data
        System.out.println("Inserisci la data dell'evento (dd/MM/yyyy) :");
        String inputData = scanner.nextLine();
        DateTimeFormatter formattazione = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataEvento = LocalDate.parse(inputData, formattazione);    // converto la stringa inputData in un oggetto di tipo LocalDate

        // input per i posti totali
        System.out.println("Inserisci il numero di posti totali:");
        int inputPostiTotali = scanner.nextInt();

        // creo un nuovo evento
        Evento evento = new Evento(inputTitolo, dataEvento, inputPostiTotali);

        System.out.println(evento);
        System.out.println(evento.getPostiTotali());
    }

}
