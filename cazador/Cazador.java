/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cazador;

import javax.swing.JOptionPane;

/**
 *
 * @author Memoeslink
 */
public class Cazador implements Persona{

    @Override
    public boolean Atacar(String animal) {
        JOptionPane.showMessageDialog(null, "El cazador ha disparado a " + animal + ".");
        return true;
    }

    @Override
    public String getName() {
        return "Juan";
    }
    
}
