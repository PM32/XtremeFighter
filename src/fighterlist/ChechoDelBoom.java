package fighterlist;

import fighterpowers.Fuerte;

public class ChechoDelBoom extends Fighter {

    @Override
    public void inicializarPoder() {
        this.setPoder(new Fuerte());
    }

    @Override
    public String nombre() {
        return "Checho del Boom";
    }

    @Override
    public String golpear() {
        return ("PU�O DEL CHOROOO!!!");
    }

    @Override
    public String patear() {
        return ("PATADA DEL COMPAREEE!!!");
    }

    @Override
    public String saltar() {
        return ("SALTO PULENTOO!!!");
    }
}
