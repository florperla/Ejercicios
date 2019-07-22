package Ejercicios.Tren;
import java.util.List;
import java.util.ArrayList;

public class Locomotora{

    // atributos
    Integer pesoLocomotora;
    Integer pesoMaximoDeArrastre;
    Integer velocidadMaxima;

    public Integer arrastreUtil(){
        return pesoMaximoDeArrastre - pesoLocomotora;
    }

    // 3)
    List<Locomotora> listaLocomotoras = new ArrayList<>();

    // 4)
    public Boolean esEficiente(){
      return pesoMaximoDeArrastre >= pesoLocomotora * 5;
    }

}
