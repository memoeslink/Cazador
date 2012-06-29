package cazador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Memoeslink
 */
public interface Animal {
    public boolean Huir();
    public boolean Atacar();
    public void GenerarHP();
    public int getHp();
    public String getName();
    public void Accion();
    public void RecibirAtaque(boolean b);
}
