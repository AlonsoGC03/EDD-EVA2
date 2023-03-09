package MisClases;

/**
 *
 * @author Alonso
 */
public class Television {
    //CANAL VOLUMEN Y POWER
    private String power;
    private int volumen;
    private int canal;
    
    public Television (){
    power = "";
    volumen = 0;
    canal = 0;
    }
    public String getpower (){
        return power;
    }
    public void setpower (String valor){
        power = valor;
    }
    public int getvolumen (){
        return volumen;
    }
    public void setvolumen (int valor){
        volumen = valor;
    }
    public int getcanal (){
        return canal;
    }
    public void setcanal(int valor){
        canal = valor;
    }
    public void imprimirdatos(){
        System.out.println("el televisor esta " + power);
        System.out.println("volumen:  " + volumen);
        System.out.println("canal:  " + canal);
    }
    
}
