package Ejercicios.sueldoPepeSuper;

import Ejercicios.sueldoPepeSuper.bonos.BonoNuloPresentismo;
import Ejercicios.sueldoPepeSuper.bonos.BonoNuloResultados;
import Ejercicios.sueldoPepeSuper.herencia.Cadete;

public class MainSuperPepe {

    public static void main(String[] args) {
        BonoNuloResultados bonoRes = new BonoNuloResultados();
        BonoNuloPresentismo bonoPres = new BonoNuloPresentismo();
        Cadete pepe = new Cadete(0, bonoPres, bonoRes);


        pepe.sueldo();

    }
}
