package se.lexicon;

import java.time.LocalDate;

public class Car {

    String regId;
    String model;
    String color;
    int releaseDate;

    public String getInformation(){
        String personData ="RegId is: " + regId + "Model is: " + model + " " + color + " " +releaseDate;
        return personData;
    }

    }

