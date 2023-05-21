package Piece;
import Coordonnee.Coordonnee;
import IHM.IPiece;
public class Roi implements IPiece {
    Couleur couleur;
    Coordonnee coordonnee;
    public Roi(Couleur couleur , int x , int y) {
        this.couleur = couleur;
        this.coordonnee = new Coordonnee(x , y);
    }
    @Override
    public String representation() {
        return couleur == Couleur.BLANC ? "♚" : "♔";
    }

    @Override
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }
}
