package Ejercicios.pepitaReloaded.state;

import Ejercicios.pepitaReloaded.Golondrina;

public class Euforica implements Estado {
    public void deseoCumplido(Golondrina golondrina) {
        golondrina.volar(5);
    }
}
