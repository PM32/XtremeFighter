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
public class NinoIlluminati extends SupportFighter {

    Fighter nextFighter;

    public NinoIlluminati(Fighter dad) {
        this.nextFighter = dad;
    }

    @Override
    public String nombre() {
        return nextFighter.nombre() + ", + Niño Illuminati";
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
        return nextFighter.calcularPoder() + 40;
    }
}


/*@Override
    public void inicializarPoder() {
        //empty function
    }

    @Override
    public String saltar() {
        return null;
    }

    @Override
    public String golpear() {
        return null;
    }

    @Override
    public String patear() {
        return null;
    }

    @Override
    public String lanzarPoder() {
        return null;
    }
 */
