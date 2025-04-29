
package testemprendimiento;
public class TestEmprendimiento {
    public static Emprendimiento restaurante1 = new Emprendimiento();
    public static Emprendimiento restaurante2 = new Emprendimiento();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        restaurante1.setNombreComercio("");
        restaurante1.setRuc("");
        restaurante1.setSectorEconomico("");
        restaurante1.setPropietario("");
        restaurante1.setUbicacion("");
        restaurante1.setFechafinicio("");
        restaurante1.setCapitalinicial(0);
        restaurante1.calcularAntiguedad();
        restaurante1.calcularTamanioNegocio();
        System.out.println("restaurante1: " + restaurante1.toString());
        
        System.out.println("\nFORMA EFICIENTE");
        Emprendimiento miEmprendimiento = new Emprendimiento(
            "Marisqueria Chuno",
            "1317882698001",
            "gastronomia",
            "Ariel Cedeno",
            "portoviejo",
            "07/12/2018"
        );
        miEmprendimiento.setCapitalinicial(450);
        miEmprendimiento.calcularAntiguedad();
        miEmprendimiento.calcularTamanioNegocio();
        System.out.println("miEmprendimiento: " + miEmprendimiento.toString());
        
        restaurante2.setNombreComercio("Marisqueria Chuno");
        restaurante2.setRuc("1317882698001");
        restaurante2.setSectorEconomico("gastronomia");
        restaurante2.setPropietario("Ariel Cedeno");
        restaurante2.setUbicacion("portoviejo");
        restaurante2.setFechafinicio("07/12/2018");
        restaurante2.setCapitalinicial(450);
        restaurante2.calcularAntiguedad();
        restaurante2.calcularTamanioNegocio();
        System.out.println("\nrestaurante2: " + restaurante2.toString());
    }
}

class Emprendimiento {
    private String nombreComercio;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private String fechafinicio;
    private double capitalinicial;
    private int antiguedad;
    private String tamanioNegocio;
    
    public Emprendimiento() {}
    
    public Emprendimiento(String nombreComercio, String ruc, 
                        String sectorEconomico, String propietario,
                        String ubicacion, String fechafinicio) {
        this.nombreComercio = nombreComercio;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechafinicio = fechafinicio;
    }
    
    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void setFechafinicio(String fechafinicio) {
        this.fechafinicio = fechafinicio;
    }
    
    public void setCapitalinicial(double capitalinicial) {
        this.capitalinicial = capitalinicial;
    }
    
    public String getNombreComercio() {
        return this.nombreComercio;
    }
    
    public String getRuc() {
        return this.ruc;
    }
    
    public String getSectorEconomico() {
        return this.sectorEconomico;
    }
    
    public String getPropietario() {
        return this.propietario;
    }
    
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public String getFechafinicio() {
        return this.fechafinicio;
    }
    
    public double getCapitalinicial() {
        return this.capitalinicial;
    }
    
    public int getAntiguedad() {
        return this.antiguedad;
    }
    
    public String getTamanioNegocio() {
        return this.tamanioNegocio;
    }
    
    public void calcularAntiguedad() {
        int anioInicio = Integer.parseInt(this.fechafinicio.substring(6));
        this.antiguedad = 2025 - anioInicio;
    }
    
    public void calcularTamanioNegocio() {
        if (this.capitalinicial < 100) {
            this.tamanioNegocio = "pequeño";
        } else if (this.capitalinicial < 1000) {
            this.tamanioNegocio = "mediano";
        } else {
            this.tamanioNegocio = "grande";
        }
    }
    
    
    public String toString() {
        return "{nombreComercio: " + this.getNombreComercio() + ", " +
               "ruc: " + this.getRuc() + ", " +
               "sectorEconomico: " + this.getSectorEconomico() + ", " +
               "propietario: " + this.getPropietario() + ", " +
               "ubicacion: " + this.getUbicacion() + ", " +
               "fechafinicio: " + this.getFechafinicio() + ", " +
               "capitalinicial: " + this.getCapitalinicial() + ", " +
               "antiguedad: " + this.getAntiguedad() + ", " +
               "tamanioNegocio: " + this.getTamanioNegocio() + "}";
    }
}