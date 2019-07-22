package Ejercicios.Tren;

public class VagonCarga implements Vagon {
    private Integer cargaMaxima;
    private Integer largo = 4;
    private Integer anchoUtil = 2;

    public Integer pesoDelVagon(){

        return this.cargaMaxima + 160;    //return porque queremos que nos retorne algo. This llama a el "cargaMaxima"
    }                                     //declarado anteriormente.

    public Integer capacidadDePasajeros() {
        return 0;
    }

    public Boolean esLiviano(){
        return (pesoDelVagon() > 2500);
        /*if(pesoDelVagon() > 2500){
            return true;
        }else {
            return false;
        }*/
    }

}
