package fighterlist;

import fighterpowers.Agil;

public class ChoroPortenho extends Fighter {

    @Override
    public void inicializarPoder() {
        this.setPoder(new Agil());
    }

    @Override
    public String nombre() {
        return "Choro Portenho";
    }

    @Override
    public String golpear() {
        return ("ALETAZO MARINO!!!");
    }

    @Override
    public String patear() {
        return ("PATADA DE LA JAIBAAAAA!!!");
    }

    @Override
    public String saltar() {
        return ("PIQUERO INFERNAAAAAL!!!");
    }
}
