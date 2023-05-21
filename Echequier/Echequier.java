package Echequier;

import IHM.IPiece;
import Piece.Couleur;
import Coordonnee.Coordonnee;
import Piece.*;
import java.io.DataInput;
import java.util.ArrayList;
import java.util.Arrays;

public class Echequier {
    private Case[][] plateau;
    private final static int TAILLE = 8;
    private ArrayList<IPiece> pieces;

    public Echequier() {
        plateau = new Case[TAILLE][TAILLE];
        pieces = new ArrayList<>();

        pieces.add(new Tour(Couleur.BLANC, 0, 0));
        pieces.add(new Cavalier(Couleur.BLANC, 0, 1));
        pieces.add(new Fou(Couleur.BLANC, 0, 2));
        pieces.add(new Roi(Couleur.BLANC, 0, 3));
        pieces.add(new Reine(Couleur.BLANC, 0, 4));
        pieces.add(new Fou(Couleur.BLANC, 0, 5));
        pieces.add(new Cavalier(Couleur.BLANC, 0, 6));
        pieces.add(new Tour(Couleur.BLANC, 0, 7));

        pieces.add(new Tour(Couleur.NOIR, 7, 0));
        pieces.add(new Cavalier(Couleur.NOIR, 7, 1));
        pieces.add(new Fou(Couleur.NOIR, 7, 2));
        pieces.add(new Roi(Couleur.NOIR, 7, 3));
        pieces.add(new Reine(Couleur.NOIR, 7, 4));
        pieces.add(new Fou(Couleur.NOIR, 7, 5));
        pieces.add(new Cavalier(Couleur.NOIR, 7, 6));
        pieces.add(new Tour(Couleur.NOIR, 7, 7));

        for (int i = 0; i < TAILLE; i++) {
            pieces.add(new Pion(Couleur.BLANC, 1, i));
            pieces.add(new Pion(Couleur.NOIR, 6, i));
        }
        initialiserEchequier();



    }

    public void initialiserEchequier() {
        // initialiser l'échéquier
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                plateau[i][j] = new Case((i + j) % 2 == 0 ? Couleur.BLANC : Couleur.NOIR, new Coordonnee(i, j), null);
            }
        }
        for (IPiece piece : pieces) {
            plateau[piece.getCoordonnee().getX()][piece.getCoordonnee().getY()].setPiece(piece);
        }
    }

    @Override
    public String toString() {
        // afficher l'échéquier initilisé
        String affichage = "";
        for (int i = 0; i < TAILLE; i++) {
            affichage += "\n";
            for (int j = 0; j < TAILLE; j++) {
                if (!plateau[i][j].estVide()) {
                    affichage += plateau[i][j].getPiece().representation();
                }
                affichage+=" ";
            }
        }
        return affichage;
    }
}
