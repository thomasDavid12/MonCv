package com.humanbooster.moncv.Object;

/**
 * Created by hb-asus on 24/04/2017.
 */

/**
 * Classe correspondant à l'objet Formations
 * Une formation est définie par une date et un titre.
 */
public class Formations {

    /** date de la formation */
    private String date;

    /** titre de la formation */
    private String titre;

    /**
     * Constructeur d'initialisation d'une formation
     *
     * initialisation :
     * date : chaine de caractère vide
     * titre : chaine de caractère vide
     */
    public Formations() {
        date = "";
        titre = "";
    }

    /**
     * Constructeur d'une formation
     *
     * initialisation :
     * @param date : date de la formation
     * @param titre : titre de la formation
     */
    public Formations(String date, String titre ) {
        this.date = date;
        this.titre = titre;
    }

    public String getDate() {
        return date;
    }

    public String getTitre() {
        return titre;
    }

}
