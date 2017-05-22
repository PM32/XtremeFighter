/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighterlist;

import fighterpowers.PowerUp;

/**
 *
 * @author Francisco
 */
public class Fighter {

    private PowerUp power = null;

    public void inicializarPoder() {
        this.setPoder(null);
    }

    public String nombre() {
        return "Luchador Sin Nombre";
    }

    public String golpear() {
        return "GOLPE BASICO!";
    }

    public String patear() {
        return "PATADA BASICA!";
    }

    public String saltar() {
        return "SALTO BASICO!";
    }

    public void setPoder(PowerUp power) {
        this.power = power;
    }

    public int calcularPoder() {
        if (this.power != null) {
            return this.power.superPoder();
        } 
            
        return 50;
    }
}
