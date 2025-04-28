
public class EjecutorEquivalenteHora {
    public static EquivalenteHoras horas1 = new EquivalenteHoras();
    public static EquivalenteHoras horas2 = new EquivalenteHoras(48);
    public static void main(String[]args){
        System.out.println(horas2);
    }
}
class EquivalenteHoras{
    public int horas;
    public int segundos;
    public int minutos;
    public float dia;
    
    public EquivalenteHoras() {}
    public EquivalenteHoras(int horas){
        this.horas = horas ;
        calcularMinutos();
        calcularSegundos();
        calcularDia();
    }
  
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    public void calcularSegundos(){
        segundos = horas * 3600;
    }
    public void calcularDia(){
        dia = horas /24.0f;
    
    }
    @Override
    public String toString(){
        return ("EquivalentesHoras{"+
        ", horas = " + horas +
        ", Dia = "+ dia +
        ", Minutos = "+ minutos +
        ", Segundos = "+segundos+ "}");
                
    }
    


}
