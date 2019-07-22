package Ejercicios.Tren;

public class VagonPasajeros implements Vagon {
    // 1)
    private static Integer largo = 6;     //private: nadie sabe que existe el atr. desde otra clase pueden usar el valor que le damos pero no el atributo en si,
    private static double anchoUtil = 3; //y no pueden setearlo, para hacerlo tengo que generar un setter para que desde afuera nos pasen el valor y nosotros lo seteamos.

    public VagonPasajeros(){ //constructor con argumentos que puede ser utilizado por
        this.setLargo(largo);                          //otro VagonPasajeros. Definiendolos ofrecemos distintas formas
        this.setAnchoUtil(anchoUtil);                      //de construir objetos, en este caso Vagones de pasajeros.
    }

    public Integer capacidadDePasajeros() {   //Si el ancho útil es menor a 2.5 entonces el largo multiplicalo x8
        if (getAnchoUtil() > 2.5){            //Si no lo es, multiplicalo x10 y esas seran las cantidades de pasajeros.
            return (getLargo()*8);
        }
        else return getLargo()*10;
    }

    public static Integer getLargo() {    //éstos son encapsulate fields.
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public static double getAnchoUtil() {
        return anchoUtil;
    }

    public void setAnchoUtil(double anchoUtil) {
        this.anchoUtil = anchoUtil;
    }

    // 2)
    public Integer pesoDelVagon(){

        return this.capacidadDePasajeros() * 80;    //return porque queremos que nos retorne algo.
    }

    public Boolean esLiviano(){
       return (pesoDelVagon() > 2500); //devuelve Boolean únicamente

        /*if(pesoDelVagon() > 2500){
            return true;
        }else {
            return false;
        }*/
      }

    }

