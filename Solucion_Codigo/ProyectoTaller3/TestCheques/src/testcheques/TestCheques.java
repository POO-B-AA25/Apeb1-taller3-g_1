
package testcheques;
public class TestCheques {
    public static EntidadFinanciera cheque1 = new EntidadFinanciera();
    public static EntidadFinanciera cheque2 = new EntidadFinanciera();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        cheque1.setCliente("");
        cheque1.setNombreBanco("");
        cheque1.setValorCheque(0);
        cheque1.calculatComision();
        System.out.println("cheque1: " + cheque1.toString());
        
        System.out.println("FORMA EFICIENTE");
        EntidadFinanciera miCheque = new EntidadFinanciera(
            "Yandry Patricio",
            "Banco Bolivariano",
            850
        );
        miCheque.calculatComision();
        System.out.println("miCheque: " + miCheque.toString());
        
        cheque2.setCliente("Yandry Patricio");
        cheque2.setNombreBanco("Banco Bolivariano");
        cheque2.setValorCheque(850);
        cheque2.calculatComision();
        System.out.println("cheque2: " + cheque2.toString());
    }
}

class EntidadFinanciera {
    private String cliente;
    private String nombreBanco;
    private float valorCheque;
    private double comisionBanco;
    
    public EntidadFinanciera() {}
    
    public EntidadFinanciera(String cliente, String nombreBanco, float valorCheque) {
        this.cliente = cliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    public void setValorCheque(float valorCheque) {
        this.valorCheque = valorCheque;
    }
    
    public String getCliente() {
        return this.cliente;
    }
    
    public String getNombreBanco() {
        return this.nombreBanco;
    }
    
    public float getValorCheque() {
        return this.valorCheque;
    }
    
    public double getComisionBanco() {
        return this.comisionBanco;
    }
    
    public void calculatComision() {
        this.comisionBanco = this.valorCheque * 0.003; // 0.3% de comisión
    }
    
    
    public String toString() {
        return "{cliente: " + this.getCliente() + ", " +
               "nombreBanco: " + this.getNombreBanco() + ", " +
               "valorCheque: " + this.getValorCheque() + ", " +
               "comisionBanco: " + this.getComisionBanco() + "}";
    }
}