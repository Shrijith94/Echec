package Piece;

import Coordonnee.Coordonnee;
import IHM.IPiece;

public class Fou implements IPiece {
    Couleur couleur;
    Coordonnee coordonnee;
    public Fou(Couleur couleur, int x, int y) {
        this.couleur = couleur;
        this.coordonnee = new Coordonnee(x, y);
    }

    @Override
    public String representation() {
        return couleur == Couleur.BLANC ? "♝" : "♗";
    }

    @Override
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

}
