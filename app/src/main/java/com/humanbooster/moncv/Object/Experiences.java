package com.humanbooster.moncv.Object;


/**
 * Classe de l'objet Experiences
 * Une expérience est définie par une date, un titre une descrition courte et une longue.
 */
public class Experiences {

    /** date de l'expérience */
    private String date;

    /** titre de l'expérience */
    private String titre;

    /** description courte de l'expérience */
    private String descCourte;

    /** description longie de l'expérience */
    private String descLongue;

    /**
     * Constructeur par défaut d'une expérience.
     *
     * initialisation :
     * date : chaine de caractère vide
     * titre : chaine de caractère vide
     * descCourte : chaine de caractère vide
     * descLongue : chaine de caractère vide
     */
    public Experiences() {
        date = "";
        titre = "";
        descCourte = "";
        descLongue = "";
    }

    /**
     * Constructeur par défaut d'une expérience.
     *
     * initialisation :
     * @param date       : date de l'expérience
     * @param titre      : titre de l'expérience
     * @param descCourte : description courte de l'expérience
     * @param descLongue : description longue de l'expérience
     */
    public Experiences(String date, String titre, String descCourte, String descLongue) {
        this.date = date;
        this.titre = titre;
        this.descCourte = descCourte;
        this.descLongue = descLongue;
    }

    public String getDate() {
        return date;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescCourte() {
        return descCourte;
    }

    public String getDescLongue() {
        return descLongue;
    }

}
