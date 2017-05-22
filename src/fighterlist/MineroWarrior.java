package fighterlist;

import fighterpowers.Mago;

public class MineroWarrior extends Fighter {

    @Override
    public void inicializarPoder() {
        this.setPoder(new Mago());
    }

    @Override
    public String nombre() {
        return "Minero Warrior";
    }

    @Override
    public String golpear() {
        return ("PU�O DEL PIRQUINEROOOO!!!");
    }

    @Override
    public String patear() {
        return ("PATADA DEL CATEADOOOOOOR!!!");
    }

    @Override
    public String saltar() {
        return ("SALTO EXPLOSIVOOOOO!!!");
    }

}
