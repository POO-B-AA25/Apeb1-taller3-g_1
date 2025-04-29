
package testcelulares;
public class TestCelulares {
    public static EquipoCelulares celular1 = new EquipoCelulares();
    public static EquipoCelulares celular2 = new EquipoCelulares();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        celular1.setSistema("");
        celular1.setPantalla(0.0f);
        celular1.setDireccionMac("");
        celular1.setInfoIMEI("");
        celular1.setCostoInicial(0.0f);
        celular1.setIvaPorcentaje(0.0);
        celular1.calcularIvaInicial();
        celular1.calcularCostoFinal();
        System.out.println("celular1: " + celular1.toString());
        
        System.out.println("\nFORMA EFICIENTE");
        EquipoCelulares miCelular = new EquipoCelulares(
            "Android 11",
            1444.0f,
            156.0f,
            "805EC093F600",
            "40935MUI73363"
        );
        miCelular.setIvaPorcentaje(15.0);
        miCelular.calcularIvaInicial();
        miCelular.calcularCostoFinal();
        System.out.println("miCelular: " + miCelular.toString());
        
        celular2.setSistema("Android 11");
        celular2.setPantalla(1444.0f);
        celular2.setDireccionMac("805EC093F600");
        celular2.setInfoIMEI("40935MUI73363");
        celular2.setCostoInicial(156.0f);
        celular2.setIvaPorcentaje(15.0);
        celular2.calcularIvaInicial();
        celular2.calcularCostoFinal();
        System.out.println("\ncelular2: " + celular2.toString());
    }
}

class EquipoCelulares {
    private String sistema;
    private float pantalla;
    private String direccionMac;
    private String infoIMEI;
    private double ivaPorcentaje;
    private float costoInicial;
    private float costoFinal;
    private double ivaCosto;
    
    public EquipoCelulares() {}
    
    public EquipoCelulares(String sistema, float pantalla, 
                         float costoInicial, String direccionMac,
                         String infoIMEI) {
        this.sistema = sistema;
        this.pantalla = pantalla;
        this.costoInicial = costoInicial;
        this.direccionMac = direccionMac;
        this.infoIMEI = infoIMEI;
    }
    
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    
    public void setPantalla(float pantalla) {
        this.pantalla = pantalla;
    }
    
    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }
    
    public void setInfoIMEI(String infoIMEI) {
        this.infoIMEI = infoIMEI;
    }
    
    public void setCostoInicial(float costoInicial) {
        this.costoInicial = costoInicial;
    }
    
    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }
    
    public String getSistema() {
        return this.sistema;
    }
    
    public float getPantalla() {
        return this.pantalla;
    }
    
    public String getDireccionMac() {
        return this.direccionMac;
    }
    
    public String getInfoIMEI() {
        return this.infoIMEI;
    }
    
    public float getCostoInicial() {
        return this.costoInicial;
    }
    
    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }
    
    public float getCostoFinal() {
        return this.costoFinal;
    }
    
    public double getIvaCosto() {
        return this.ivaCosto;
    }
    
    public void calcularIvaInicial() {
        this.ivaCosto = this.costoInicial * (this.ivaPorcentaje / 100);
    }
    
    public void calcularCostoFinal() {
        this.costoFinal = (float)(this.costoInicial + this.ivaCosto);
    }
    
    public String toString() {
        return "{sistema: " + this.getSistema() + ", " +
               "pantalla: " + this.getPantalla() + "p, " +
               "direccionMac: " + this.getDireccionMac() + ", " +
               "IMEI: " + this.getInfoIMEI() + ", " +
               "costoInicial: " + String.format("%.2f", this.getCostoInicial()) + ", " +
               "porcentajeIVA: " + String.format("%.2f", this.getIvaPorcentaje()) + "%, " +
               "costoIVA: " + String.format("%.2f", this.getIvaCosto()) + ", " +
               "costoFinal: " + String.format("%.2f", this.getCostoFinal()) + "}";
    }
}