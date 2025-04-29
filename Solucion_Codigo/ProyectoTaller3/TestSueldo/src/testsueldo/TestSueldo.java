
package testsueldo;
public class TestSueldo {
    public static SueldoBasico profesori = new SueldoBasico();
    public static SueldoBasico profesor2 = new SueldoBasico();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        profesori.setNombre("");
        profesori.setApellido("");
        profesori.setCedula(0);
        profesori.setSueldoBasico(0);
        profesori.setAumento(0);
        profesori.calcularSueldoTotal();
        System.out.println("profesori: " + profesori.toString());
        
        System.out.println("\nFORMA EFICIENTE");
        SueldoBasico miProfesor = new SueldoBasico(
            "Pedro Daniel",
            "Irene Robalino",
            314548964,
            450,
            0.20 // 20% de aumento
        );
        miProfesor.calcularSueldoTotal();
        System.out.println("miProfesor: " + miProfesor.toString());
        
        profesor2.setNombre("Pedro Daniel");
        profesor2.setApellido("Irene Robalino");
        profesor2.setCedula(314548964);
        profesor2.setSueldoBasico(450);
        profesor2.setAumento(0.20); // 20% de aumento
        profesor2.calcularSueldoTotal();
        System.out.println("\nprofesor2: " + profesor2.toString());
    }
}

class SueldoBasico {
    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private double aumento;
    
    public SueldoBasico() {}
    
    public SueldoBasico(String nombre, String apellido, 
                       int cedula, double sueldoBasico,
                       double aumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        this.aumento = aumento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public void setAumento(double aumento) {
        this.aumento = aumento;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public int getCedula() {
        return this.cedula;
    }
    
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    
    public double getSueldoTotal() {
        return this.sueldoTotal;
    }
    
    public double getAumento() {
        return this.aumento;
    }
    
    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico * (1 + this.aumento);
    }
    
    public String toString() {
        return "{nombre: " + this.getNombre() + ", " +
               "apellido: " + this.getApellido() + ", " +
               "cedula: " + this.getCedula() + ", " +
               "sueldoBasico: " + String.format("%.2f", this.getSueldoBasico()) + ", " +
               "aumento: " + String.format("%.0f%%", this.getAumento() * 100) + ", " +
               "sueldoTotal: " + String.format("%.2f", this.getSueldoTotal()) + "}";
    }
}
