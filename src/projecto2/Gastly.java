package projecto2;

/**
 *
 * @author jgarciaamor
 */
public class Gastly extends Pokemon{
    public Gastly() {
        super("Gastly");
    }
    //Metodos

    @Override
    public int ataque2() {//Pulso umbrio
       int daño=0;
       if(pp2 > 0){
           daño=ataque * 4;}
       return daño;
    }
    
    @Override
    public int ataque3() {//Bola Sombra
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 7;}
       return daño;
    }

    @Override
    public int ataque4() {//Tinieblas
        int daño=0;
       if(pp4 > 0){
           daño=ataque * 3;}
       return daño;
    }
}
