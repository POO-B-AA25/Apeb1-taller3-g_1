
package testcalificacion;
public class TestCalificacion {
    public static Calificaciones estudiantel = new Calificaciones();
    public static Calificaciones estudiante2 = new Calificaciones();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        estudiantel.setNombre("");
        estudiantel.setCalificacion1(0);
        estudiantel.setCalificacion2(0);
        estudiantel.setCalificacion3(0);
        estudiantel.calcularPromedio();
        estudiantel.calcularAprobado();
        System.out.println("estudiantel: " + estudiantel.toString());
        
        System.out.println("\nFORMA EFICIENTE");
        Calificaciones miEstudiante = new Calificaciones(
            "ArielYampatrick",
            6.0,
            7.0,
            8.0
        );
        miEstudiante.calcularPromedio();
        miEstudiante.calcularAprobado();
        System.out.println("miEstudiante: " + miEstudiante.toString());
        
        estudiante2.setNombre("ArielYampatrick");
        estudiante2.setCalificacion1(6.0);
        estudiante2.setCalificacion2(7.0);
        estudiante2.setCalificacion3(8.0);
        estudiante2.calcularPromedio();
        estudiante2.calcularAprobado();
        System.out.println("\nestudiante2: " + estudiante2.toString());
    }
}

class Calificaciones {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private boolean resultado;
    
    public Calificaciones() {}
    
    public Calificaciones(String nombre, double calificacion1, 
                         double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }
    
    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }
    
    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getCalificacion1() {
        return this.calificacion1;
    }
    
    public double getCalificacion2() {
        return this.calificacion2;
    }
    
    public double getCalificacion3() {
        return this.calificacion3;
    }
    
    public double getPromedio() {
        return this.promedio;
    }
    
    public boolean getResultado() {
        return this.resultado;
    }
    
    public void calcularPromedio() {
        this.promedio = (this.calificacion1 + this.calificacion2 + this.calificacion3) / 3;
    }
    
    public boolean calcularAprobado() {
        this.resultado = this.promedio >= 7.0;
        return this.resultado;
    }
    
    public String toString() {
        return "{nombre: " + this.getNombre() + ", " +
               "calificacion1: " + String.format("%.1f", this.getCalificacion1()) + ", " +
               "calificacion2: " + String.format("%.1f", this.getCalificacion2()) + ", " +
               "calificacion3: " + String.format("%.1f", this.getCalificacion3()) + ", " +
               "promedio: " + String.format("%.1f", this.getPromedio()) + ", " +
               "resultado: " + (this.getResultado() ? "Aprobó" : "Reprobó") + "}";
    }
}