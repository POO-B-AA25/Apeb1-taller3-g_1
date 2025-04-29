
package testcandidatos;
public class TestCandidatos {
    public static CandidatoPresidencial candidato1 = new CandidatoPresidencial();
    public static CandidatoPresidencial candidato2 = new CandidatoPresidencial();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        candidato1.setNombre("Luiza Gonzales");
        candidato1.setEdad(32);
        candidato1.setPartidoPolitico("Revolucion Ciudadana");
        candidato1.setPlanGobierno("Ecuador");
        candidato1.setNumPropuestoClave(5);
        System.out.println("candidato1: " + candidato1.toString());
        System.out.println("Cumple requisito de edad: " + candidato1.requisitoEdad());
        
        System.out.println("\nFORMA EFICIENTE");
        CandidatoPresidencial miCandidato = new CandidatoPresidencial(
            "Daniel Noboa",
            26,
            "ADN",
            "reforzar la seguridad",
            3
        );
        System.out.println("miCandidato: " + miCandidato.toString());
        System.out.println("Cumple requisito de edad: " + miCandidato.requisitoEdad());
        
        candidato2.setNombre("Daniel Noboa");
        candidato2.setEdad(26);
        candidato2.setPartidoPolitico("ADN");
        candidato2.setPlanGobierno("reforzar la seguridad");
        candidato2.setNumPropuestoClave(3);
        System.out.println("\ncandidato2: " + candidato2.toString());
        System.out.println("Cumple requisito de edad: " + candidato2.requisitoEdad());
    }
}

class CandidatoPresidencial {
    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numPropuestoClave;
    
    public CandidatoPresidencial() {}
    
    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }
    
    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico, 
                                String planGobierno, int numPropuestoClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numPropuestoClave = numPropuestoClave;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }
    
    public void setNumPropuestoClave(int numPropuestoClave) {
        this.numPropuestoClave = numPropuestoClave;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public String getPartidoPolitico() {
        return this.partidoPolitico;
    }
    
    public String getPlanGobierno() {
        return this.planGobierno;
    }
    
    public int getPropuestoClave() {
        return this.numPropuestoClave;
    }
    
    public int getNumPresupuestoClave() {
        return this.numPropuestoClave;
    }
    
    public boolean requisitoEdad() {
        return this.edad >= 30; // Requisito mínimo de 30 años para candidato presidencial
    }
    
    public String toString() {
        return "{nombre: " + this.getNombre() + ", " +
               "edad: " + this.getEdad() + ", " +
               "partidoPolitico: " + this.getPartidoPolitico() + ", " +
               "planGobierno: " + this.getPlanGobierno() + ", " +
               "numPropuestoClave: " + this.getPropuestoClave() + "}";
    }
}