
package testautomotor;
public class TestAutomotor {
    public static Automotor auto1 = new Automotor();
    public static Automotor auto2 = new Automotor();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        auto1.setCedula("");
        auto1.setMarcaVehiculo("");
        auto1.setAnioFabricacion(0);
        auto1.setValorVehiculo(0);
        auto1.calcularPorcentajeValor();
        auto1.calcularValorMatricula();
        System.out.println("auto1: " + auto1.toString());
        
        System.out.println("\nFORMA EFICIENTE");
        Automotor miAuto = new Automotor(
            "1317882692",
            "Ford",
            2002,
            4000
        );
        miAuto.calcularPorcentajeValor();
        miAuto.calcularValorMatricula();
        System.out.println("miAuto: " + miAuto.toString());
        
        auto2.setCedula("1317882692");
        auto2.setMarcaVehiculo("Ford");
        auto2.setAnioFabricacion(2002);
        auto2.setValorVehiculo(4000);
        auto2.calcularPorcentajeValor();
        auto2.calcularValorMatricula();
        System.out.println("\nauto2: " + auto2.toString());
    }
}

class Automotor {
    private String cedula;
    private String marcaVehiculo;
    private int aniofabricacion;
    private int valorVehiculo;
    private double porcentajeValor;
    private double valorMatricula;
    
    public Automotor() {}
    
    public Automotor(String cedula, String marcaVehiculo, 
                   int aniofabricacion, int valorVehiculo) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.aniofabricacion = aniofabricacion;
        this.valorVehiculo = valorVehiculo;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }
    
    public void setAnioFabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }
    
    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    
    public String getCedula() {
        return this.cedula;
    }
    
    public String getMarcaVehiculo() {
        return this.marcaVehiculo;
    }
    
    public int getAnioFabricacion() {
        return this.aniofabricacion;
    }
    
    public int getValorVehiculo() {
        return this.valorVehiculo;
    }
    
    public double getPorcentajeValor() {
        return this.porcentajeValor;
    }
    
    public double getValorMatricula() {
        return this.valorMatricula;
    }
    
    public void calcularPorcentajeValor() {
        int antiguedad = java.time.Year.now().getValue() - this.aniofabricacion;
        
        if (antiguedad < 5) {
            this.porcentajeValor = 0.002; // 0.2%
        } else if (antiguedad < 10) {
            this.porcentajeValor = 0.004; // 0.4%
        } else if (antiguedad < 15) {
            this.porcentajeValor = 0.006; // 0.6%
        } else {
            this.porcentajeValor = 0.008; // 0.8%
        }
    }
    
    public void calcularValorMatricula() {
        this.valorMatricula = this.valorVehiculo * this.porcentajeValor;
    }
    
    
    public String toString() {
        return "{cedula: " + this.getCedula() + ", " +
               "marcaVehiculo: " + this.getMarcaVehiculo() + ", " +
               "aniofabricacion: " + this.getAnioFabricacion() + ", " +
               "valorVehiculo: " + this.getValorVehiculo() + ", " +
               "porcentajeValor: " + String.format("%.4f", this.getPorcentajeValor()) + ", " +
               "valorMatricula: " + String.format("%.2f", this.getValorMatricula()) + "}";
    }
}