/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supfighter;

import fighterlist.*;

/**
 *
 * @author Francisco
 */
public class Tarro extends SupportFighter {

    Fighter nextFighter;

    public Tarro(Fighter dad) {
        this.nextFighter = dad;
    }

    @Override
    public String nombre() {
        return nextFighter.nombre() + ", + Tarro";
    }

    @Override
    public String saltar() {
        return nextFighter.saltar();
    }

    @Override
    public String golpear() {
        return nextFighter.golpear();
    }

    @Override
    public String patear() {
        return nextFighter.patear();
    }

    @Override
    public int calcularPoder() {
        return nextFighter.calcularPoder() + 25;
    }
}
