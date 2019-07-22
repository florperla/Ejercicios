package Ejercicios.Tren;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Tren{
    // 1) El total de pasajeros que puede transportar una formación.
    private List<Vagon> vagones = new ArrayList<>();

    private List<Locomotora> locomotoras = new ArrayList<>();

    public Integer capacidadDePasajerosTotal(){  //con esto preguntamos la capacidad maxima de tren
        return vagones.stream()
                .mapToInt(vagon -> vagon.capacidadDePasajeros()) //mapToInt porque .sum entiende int
                .sum();
    }

    // 2) Cuántos vagones livianos tiene una formación; un vagón es liviano si su peso máximo es menor a 2500 kg.
    public Integer cantidadVagonesLivianos(){
        return (int) vagones.stream()
                .filter(vagon -> vagon.esLiviano())//(int) transforma a Integer en int
                .count(); //count devuelve Long pero entiede el int porque son casi lo mismo
    }

    // 3) ????????????? POR QUE NO RECONOCE MAPTOINT + COMPARATOR?
   /* public Integer velocidadMaximaTren(){
        return locomotoras.stream()
                .mapToInt(Comparator.comparing(locomotora -> locomotora.velocidadMaxima())
                .min()
                .get().velocidadMaxima());

        // Le estamos pidiendo que me de la mínima entre las maximas velocidades
        // con .min siempre hay que poner el Comparator.comparing
        // pero lo que me devuelve es el objeto Locomotora y no la velocidad
        // por eso hsy que poonerle .get().velocidadMaxima para que entienda que le pedimos la velocidad del objeto
    }*/

    // 4)
    public Boolean esEficiente(){
      return locomotoras.stream().allMatch(locomotora -> locomotora.esEficiente());

      //recorre la lista y si coinciden con la condicion todos devuelve true
    }

    // 5)
    public Boolean puedeMoverse() {
        return locomotoras.stream()
                .mapToInt(locomotora -> locomotora.arrastreUtil())
                .sum()
                >= vagones.stream()
                .mapToInt(vagon -> vagon.pesoDelVagon())
                .sum();

        //busca entre locomotoras y saca la suma de los arrastre util
        //busca entre los vagones y saca el maximo de los pesos de vagones.
    }

    // 6) ???
    public Integer kilosParaMoverse() {
        return vagones.stream()
                .mapToInt (vagon -> vagon.pesoDelVagon())
                .sum()
                - locomotoras.stream()
                .mapToInt (locomotora -> locomotora.arrastreUtil())
                .sum();
      }

    // 8)
    // a)
    private List<Tren> trenes = new ArrayList<>();  //lista para el stream

    // b)
        public Boolean formacionCompleja() {      //compleja o no?
        return trenes.stream()
        .mapToInt (tren -> tren.cantidadDeUnidades())
        .sum() > 20 || trenes.stream() .mapToInt(tren -> tren.pesoTotal()) .count() > 1000;
        }

    // c)
    private Integer cantidadDeUnidades() {        //como saber si es compleja
        return cantidadDeVagones + cantidadDeLocomotoras;
    }

    // d) variables
    private Integer cantidadDeVagones;
    private Integer cantidadDeLocomotoras;

    // e)
    private Integer pesoTotal(){
     return pesoLocomotora + pesoVagones;
    }

    // f)
    private Integer pesoLocomotora;
    private Integer pesoVagones;
}


