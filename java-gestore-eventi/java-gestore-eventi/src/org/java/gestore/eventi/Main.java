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
        scanner.nextLine();  // Consumo la nuova linea

        // creo un nuovo evento
        Evento evento = new Evento(inputTitolo, dataEvento, inputPostiTotali);

        // chiedere all’utente se e quante prenotazioni vuole fare e provare ad effettuarle implementando opportuni controlli
        if(evento.getPostiTotali() > 0 && !dataEvento.isBefore(LocalDate.now())){
            System.out.println("Evento creato con successo: " + evento + ". Vuoi prenotare dei posti? (si/no) ");
            String inputPrenotazione = scanner.nextLine();
            
            if(inputPrenotazione.equals("no")){
                System.out.println("Ok, speriamo di vederti al prossimo evento!");
            }else if(inputPrenotazione.equals("si")){
                System.out.println("Quanti posti vuoi prenotare?");
                int prenotazioni = scanner.nextInt();
                scanner.nextLine();  // Consumo la nuova linea

                if(prenotazioni <= evento.getPostiTotali() && prenotazioni > 0){
                    
                    for(int i = 0; i < prenotazioni; i++){
                        evento.prenota();
                    }

                    // Stampare a video il numero di posti prenotati e quelli disponibili
                    System.out.println("Numero di posti prenotati: " + evento.getPostiPrenotati());
                    System.out.println("Numero di posti disponibili: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));

                    // Chiedere all’utente se e quanti posti vuole disdire
                    // Provare ad effettuare le disdette, implementando opportuni controlli
                    System.out.println("Vuoi effettuare una disdetta? (si/no)");
                    String inputDisdetta = scanner.nextLine();

                    if(inputDisdetta.equals("no")){
                        System.out.println("Perfetto, ci vediamo all'evento!");
                    }else if(inputDisdetta.equals("si")){
                        System.out.println("Quanti posti vuoi disdire?");
                        int disdette = scanner.nextInt();
                        
                        if(disdette <= 0 || disdette > evento.getPostiPrenotati()){
                            System.out.println("Il numero di posti da disdire deve essere almeno 1 e non deve superare il numero di posti prenotati");
                        }else{

                            for(int i = 0; i < disdette; i++){
                                evento.disdici();
                            }
        
                            // Stampare a video il numero di posti prenotati e quelli disponibili
                            System.out.println("Numero di posti prenotati: " + evento.getPostiPrenotati());
                            System.out.println("Numero di posti disponibili: " + (evento.getPostiTotali() - evento.getPostiPrenotati()));
                        }

                        
                    }else{
                        System.out.println("Risposta non valida");
                    }
                

                }else{
                    System.out.println("Il numero di posti prenotabili deve essere almeno 1 e non deve superare il numero di posti disponibili");
                }
                

                


            }else{
                System.out.println("Risposta non valida");
            }
        }


        scanner.close();
    }

}
