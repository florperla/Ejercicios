package Ejercicios.Tren;

public interface Vagon {
//las interfaces solo tienen metodos que van a tener que entender todas las clases que la implementen

    // 1)
    Integer capacidadDePasajeros();
    //los metodos deben estar en la clase y ahí les damos los atributos

    // 2)
    Boolean esLiviano();

    Integer pesoDelVagon();

}
