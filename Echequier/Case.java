package Echequier;

import Coordonnee.Coordonnee;
import IHM.IPiece;
import Piece.Couleur;

public class Case {
    Couleur couleur;
    Coordonnee coordonnee;
    IPiece piece;
    public Case(Couleur couleur, Coordonnee coordonnee, IPiece piece) {
        this.couleur = couleur;
        this.coordonnee = coordonnee;
        this.piece = piece;
    }
    public boolean estVide() {
        return piece == null;
    }
    public String getCouleur() {
        if (couleur == Couleur.BLANC) {
            return "■";
        } else {
            return "□";
        }
    }

    public void setPiece(IPiece piece) {
        this.piece = piece;
    }

    public IPiece getPiece() {
        return piece;
    }

}
