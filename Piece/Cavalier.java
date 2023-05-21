package Piece;
import Coordonnee.Coordonnee;
import IHM.IPiece;

public class Cavalier implements IPiece{
    Couleur couleur;
    Coordonnee coordonnee;
    public Cavalier(Couleur couleur, int x, int y) {
        this.couleur = couleur;
        this.coordonnee = new Coordonnee(x, y);
    }
    @Override
    public String representation() {
        return couleur == Couleur.BLANC ? "♞" : "♘";
    }

    @Override
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    @Override
    public void deplacer(int x, int y) {
        if(peutDeplacer(x, y)) {
            this.coordonnee.setX(x);
            this.coordonnee.setY(y);
        }
    }

    @Override
    public boolean peutDeplacer(int x, int y) {

        if (x == this.coordonnee.getX() + 2 && y == this.coordonnee.getY() + 1) {
            return true;
        }
        if (x == this.coordonnee.getX() + 2 && y == this.coordonnee.getY() - 1) {
            return true;
        }
        if (x == this.coordonnee.getX() - 2 && y == this.coordonnee.getY() + 1) {
            return true;
        }
        if (x == this.coordonnee.getX() - 2 && y == this.coordonnee.getY() - 1) {
            return true;
        }
        if (x == this.coordonnee.getX() + 1 && y == this.coordonnee.getY() + 2) {
            return true;
        }
        if (x == this.coordonnee.getX() + 1 && y == this.coordonnee.getY() - 2) {
            return true;
        }
        if (x == this.coordonnee.getX() - 1 && y == this.coordonnee.getY() + 2) {
            return true;
        }
        if (x == this.coordonnee.getX() - 1 && y == this.coordonnee.getY() - 2) {
            return true;
        }
        return false;
    }
}
