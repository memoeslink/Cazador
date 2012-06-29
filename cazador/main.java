/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cazador;

/**
 *
 * @author Memoeslink
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona humanoCall = new Cazador();
        Animal venadoCall = new Venado();
        Animal elefanteCall = new Elefante();
        Animal patoCall = new Pato();
        Animal cebraCall = new Cebra();
        Animal leonCall = new Leon();
        venadoCall.GenerarHP();
        venadoCall.RecibirAtaque(humanoCall.Atacar(venadoCall.getName()));
        elefanteCall.GenerarHP();
        elefanteCall.RecibirAtaque(humanoCall.Atacar(elefanteCall.getName()));
        patoCall.GenerarHP();
        patoCall.RecibirAtaque(humanoCall.Atacar(patoCall.getName()));
        cebraCall.GenerarHP();
        cebraCall.RecibirAtaque(humanoCall.Atacar(cebraCall.getName()));
        leonCall.GenerarHP();
        leonCall.RecibirAtaque(humanoCall.Atacar(leonCall.getName()));
        
    }
}
