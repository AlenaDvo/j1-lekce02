package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        int strana = 100;
        int pocet = 6;

//        nakresliDomecek(strana);
//        nakresliXdomecku(pocet, strana);
        nakresliPrasatko(strana);
//        nakresliSlunce();
    }

    private void nakresliXdomecku(int pocet, int strana) {
        if (pocet > 4) {
            zofka.penUp();
            posunSeDoprava(strana);
        }
        for (int i = 0; i < pocet - 1; i++) {
            nakresliDomecek(strana);
            posunSeNaDalsiDomecekDoleva(strana);
        }
        nakresliDomecek(strana);
    }

    private void nakresliSlunce() {
        zofka.penDown();
        for (int i = 0; i <= 50; i++) {
            zofka.move(10);
            if (i % 4 == 0) {
                zofka.turnLeft(90);
                zofka.move(20);
                zofka.turnLeft(180);
                zofka.move(20);
                zofka.turnLeft(90);
            }
            zofka.turnRight(360 / 50);
        }
        zofka.penUp();
    }

    private void nakresliDomecek(int strana) {
        nakresliCtverecek(strana);
        zofka.move(strana);
        nakresliStrechuAVratSeNaZacatek(strana);
    }

    private void nakresliPrasatko(int strana) {
        nakresliObdelnik(strana);

        // predni nohy
        nakresliNohy(strana);

        // presun a zadni nohy
        zofka.turnRight(90);
        zofka.move(strana * 1.5);
        zofka.turnLeft(90);
        nakresliNohy(strana);

        // presun, hlava a oko
        zofka.turnLeft(90);
        zofka.move(strana * 1.5);
        nakresliHlavu(strana);
        zofka.turnRight(120);
        zofka.move(strana / 2);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(strana / 2);
        zofka.penDown();
        zofka.move(1);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(strana / 2);
        zofka.turnRight(90);
        zofka.move(strana / 2);
        zofka.turnRight(180);
    }

    private void nakresliObdelnik(int strana) {
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
            zofka.move(strana * 1.5);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    private void nakresliNohy(int strana) {
//        1. noha
        zofka.turnLeft(150);
        zofka.penDown();
        zofka.move(strana / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(strana / 2);
        zofka.turnRight(150);

//        2. noha
        zofka.turnLeft(30);
        zofka.penDown();
        zofka.move(strana / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(strana / 2);
        zofka.turnRight(30);
    }

    private void nakresliHlavu(int strana) {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(120);
        zofka.move(strana);
        zofka.penUp();
    }

    private void posunSeDoprava(int strana) {
        zofka.turnRight(90);
        zofka.move(strana);
        zofka.move(strana);
        zofka.move(strana);
        zofka.move(strana);
        zofka.turnLeft(90);
    }

    public void nakresliCtverecek(int strana) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    public void nakresliStrechuAVratSeNaZacatek(int strana) {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(120);
        zofka.move(strana);
        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(strana);
        zofka.turnRight(90);
        zofka.move(strana);
        zofka.turnRight(90);
    }

    public void posunSeNaDalsiDomecekDoleva(int strana) {
        zofka.turnLeft(90);
        zofka.move(strana);
        zofka.move(strana);
        zofka.turnRight(90);
    }
}