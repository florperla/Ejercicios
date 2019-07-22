package Ejercicios.Tren;

import java.util.List;
import java.util.ArrayList;

public class MainTren {
    public static void main (String args[]){

        Locomotora locomotora1 = new Locomotora();

        Deposito deposito1 = new Deposito();

        Vagon vagonPasajeros1 = new VagonPasajeros();

        System.out.println("capacidad maxima de pasajeros " + vagonPasajeros1.capacidadDePasajeros());

        Vagon vagonCarga1 = new VagonCarga();

    // 3) Lista de locomotoras que hay que recorrer para sacar su velocidad máxima.
    List<Locomotora> listaLocomotoras = new ArrayList<>();

    Locomotora locomotora2 = new Locomotora();
    Locomotora locomotora3 = new Locomotora();
    Locomotora locomotora4 = new Locomotora();

    listaLocomotoras.add(locomotora1);
    listaLocomotoras.add(locomotora2);
    listaLocomotoras.add(locomotora3);
    listaLocomotoras.add(locomotora4);

    List<Tren> listaTrenes = new ArrayList<>();

    Tren tren1 = new Tren();
    Tren tren2 = new Tren();
    Tren tren3 = new Tren();

    listaTrenes.add(tren1);
    listaTrenes.add(tren2);
    listaTrenes.add(tren3);

    // 8) COMO LO HAGO FUNCIONAR?
  }
}