package Ejercicios.sueldoPepeSuper.herencia;

import Ejercicios.sueldoPepeSuper.bonos.BonoPresentismo;
import Ejercicios.sueldoPepeSuper.bonos.BonoResultados;

public class Gerente extends Empleado {

    public Gerente(Integer faltas, BonoPresentismo bp, BonoResultados br) {
        super(faltas, bp, br);
    }
    protected Integer neto() { return 10000;}
}
