package com.humanbooster.moncv.Object;

/**
 * Classe de l'objet Competences
 * Une compétence est définie par l'ID de son image et une chaine de caractère
 * correspondant à la compétence.
 */
public class Competences {

    /** ID de l'image de la compétence */
    private int nbStar;

    /** Chaine de caractère contenant la compétence */
    private String competence;

    /**
     * Constructeur d'initialisation d'une compétence.
     * L'ID de l'image de la compétence sera initialisée à 0 !
     * @param competence la chaine de caractère qui définira la compétence
     */
    public Competences(String competence) {
        this.nbStar = 0;
        this.competence = competence;
    }

    /**
     * Constructeur d'initialisation d'une compétence.
     * L'ID de l'image de la compétence sera initialisée à 0 !
     * La compétence correspondra à une chaine de caractère vide !
     */
    public Competences() {
        nbStar = 0;
        competence = "";
    }

    public Competences(String competence, int idImg) {
        this.nbStar = idImg;
        this.competence = competence;
    }

    public int getNbStar() {
        return nbStar;
    }

    public String getCompetence() {
        return competence;
    }
}
