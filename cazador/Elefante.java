/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cazador;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Memoeslink
 */
public class Elefante implements Animal{
    int hp = 0;
    int hpdamage = 0;

    @Override
    public boolean Huir() {
        JOptionPane.showMessageDialog(null, "El " + this.getName() + " ha huído.");
        return true;
    }

    @Override
    public boolean Atacar() {
        JOptionPane.showMessageDialog(null, "El " + this.getName() + " te ha aplastado.");
        return true;
    }

    @Override
    public void GenerarHP() {
        Random rnd = new Random();
        this.hp = rnd.nextInt(100) + 1;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public String getName() {
        return "elefante";
    }

    @Override
    public void Accion() {
        int rand;
        if(this.hp > 0){
            Random rnd = new Random();
            rand = rnd.nextInt(3) + 1;
            switch(rand)
            {
                case 1: this.Huir();
                    break;
                case 2: this.Atacar();
                    break;
                default: JOptionPane.showMessageDialog(null, "El animal no ha hecho nada.");
                    break;
            }
        }
    }

    @Override
    public void RecibirAtaque(boolean b) {
        if(b==true)
        {
            Random rnd = new Random();
            int posibilidad = 0;
            posibilidad = rnd.nextInt(4) + 1;
            if(posibilidad == 4)
            {
                JOptionPane.showMessageDialog(null, "¡El cazador ha fallado!");
            }
            else
            {
                this.hpdamage = rnd.nextInt(100) + 1;

                if(hp < hpdamage)
                {
                    hp = 0;
                    JOptionPane.showMessageDialog(null, "El animal ha muerto.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Daño de HP recibido por el animal: " + this.hpdamage);
                    hp = hp - hpdamage;
                    JOptionPane.showMessageDialog(null, "HP restante del animal: " + this.getHp());
                }
                this.Accion();
            }
        }
    }
    
}
