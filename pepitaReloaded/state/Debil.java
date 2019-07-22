package Ejercicios.pepitaReloaded.state;

import Ejercicios.pepitaReloaded.Golondrina;

public class Debil implements Estado {
    public void deseoCumplido(Golondrina golondrina) {
        golondrina.comer(500);
    }
}
