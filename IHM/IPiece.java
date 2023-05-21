package IHM;

import Coordonnee.Coordonnee;

public interface IPiece {
    public String representation() ;
    public Coordonnee getCoordonnee();
    // déplacer la pièce
    public void deplacer(int x, int y);
    //peux être déplacer
    public boolean peutDeplacer(int x, int y);
    // manger une pièce


}
