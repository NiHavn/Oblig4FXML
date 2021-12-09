package com.example.oblig4fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

class Person{
    // attributtene til klassen
    String navn;
    String personnummer;

    // konstruktør for å initialisere attributtene til klassen
    public Person(String navn, String personnummer){
        this.navn = navn;
        this.personnummer = personnummer;
    }
}

class Register{

        ArrayList<Person> personer = new ArrayList<>();

    public void registrerPerson(String navn, String personnummer){
        // sjekk om personnummeret finnes fra før
        boolean found = false;
        String ut = "";
        for(Person enPerson : personer){
            if(enPerson.personnummer.equals(personnummer)){
                found = true;
            }
            if (!found){
                ut += enPerson.personnummer;
            }
        }
        // dersom det ikke gjør det registrer det
    }

    public void slettPerson(String personnummer){
        // løp igjennom arrayet for å finne personen,
        boolean found = false;
        String ut = "";
        for(Person enPerson : personer){
            if(enPerson.personnummer.equals(personnummer)){
                found = true;
                personer.remove(enPerson);
            }
            if(!found){
                ut += "Personen finnes ikke";
            }
        }
        //   dersom den finnes, slett den
    }

    public boolean finnesFraFør(String personnummer){
        /* sjekk om personnummeret allerede ligger i arrayet
        
           dersom det gjør det returner true, ellers false */
    }

    public String visAllePersonene(){
        /* løp igjennom arrayet og formater først personnummer så navn på
           hver sin linje i en streng og returner denne. */
    }
}


public class HelloController {

    @FXML
    private Label lblText;

    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtPersonnummer;

    @FXML
    void Registrer(ActionEvent event) {

    }

    @FXML
    void Slett(ActionEvent event) {

    }

}