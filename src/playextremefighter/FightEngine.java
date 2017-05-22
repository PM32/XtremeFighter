package playextremefighter;

import java.util.ArrayList;
import java.util.Scanner;
import fighterlist.Fighter;
import supfighter.*;

public class FightEngine {

    private ArrayList<String> fighters;
    private ArrayList<Fighter> fighterList;
    private ArrayList<String> supfighters;
    private ArrayList<Fighter> supfighterList;

    public FightEngine() {

        String packageName;

        fighters = new ArrayList<>();
        fighterList = new ArrayList<>();
        fighters.add("ChoroPortenho");
        fighters.add("MineroWarrior");
        fighters.add("ChechoDelBoom");

        packageName = "fighterlist";

        for (String line : fighters) {
            Class c;
            try {
                c = Class.forName(packageName + "." + line);
            } catch (ClassNotFoundException ex) {
                System.out.println("Skipping class " + line + ": not found");
                return;
            }

            Fighter inherited;
            try {
                inherited = (Fighter) c.newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                System.out.println("Skipping class " + line + ": instantiation error");
                return;
            }

            inherited.inicializarPoder();
            fighterList.add(inherited);
        }

        // FASE 1
        System.out.println("Empieza el juego!!!");

        for (int i = 0; i < fighterList.size(); i++) {
            System.out.println((i + 1) + "- " + fighterList.get(i).nombre());
        }

        Scanner seleccion = new Scanner(System.in);

        if (!seleccion.hasNextInt()) {
            System.out.println("Escribe un numero!!!");
            return;
        }

        int choosen = seleccion.nextInt() - 1;

        if (choosen < 0 || choosen >= fighterList.size()) {
            System.out.println("Opcion invalida!!!");
            return;
        }

        System.out.println("Jugador Seleccionado: " + (choosen + 1));

        Fighter choosenFighter = fighterList.get(choosen);
        fighterList.clear();
        fighterList = null;

        // FASE 2
        System.out.println("Escoje tus Luchadores Segundarios!!! (Pon 0 para no seguir)");

        seleccion = new Scanner(System.in);

        while (true) {
            System.out.println("1- Nino Illuminati 2- Nino No Peleen 3- Tarro 0- SALIR");
            
            if (!seleccion.hasNextInt()) {
                System.out.println("Escribe un numero!!!");
                continue;
            }

            choosen = seleccion.nextInt();

            if (choosen == 0) {
                break;
            }

            if (choosen < 1 || choosen > 3) {
                System.out.println("Opcion invalida!!!");
                continue;
            }

            System.out.println("Jugador Seleccionado: " + choosen);

            switch (choosen) {
                case 1: {
                    choosenFighter = new NinoIlluminati(choosenFighter);
                    break;
                }
                case 2: {
                    choosenFighter = new NinoNoPeleen(choosenFighter);
                    break;
                }
                case 3: {
                    choosenFighter = new Tarro(choosenFighter);
                    break;
                }
            }
            
            System.out.println("Actualmente tus Luchadores son: " + choosenFighter.nombre());
        }

        // FASE 3
        System.out.println(choosenFighter.nombre() + " inicia a batalla!");

        System.out.println("Ingresa tu accion!: 1-Golpe 2-Patada 3-Salto 4-Super Poder Especial");

        if (!seleccion.hasNextInt()) {
            System.out.println("Escribe un poder valido!!!");
            return;
        }

        int poder = seleccion.nextInt();

        switch (poder) {
            case 1:
                System.out.println(choosenFighter.golpear());
                break;
            case 2:
                System.out.println(choosenFighter.patear());
                break;
            case 3:
                System.out.println(choosenFighter.saltar());
                break;
            case 4:
                System.out.println("SUPER PODER ESPECIAL! Recibiste " + choosenFighter.calcularPoder() + " de Damage");
                break;
        }
        System.out.println("FIN DEL JUEGO...");

    }

}
