
package testinstituto;
public class TestInstituto {
    public static InstitucionEducativa instPrimaria1 = new InstitucionEducativa();
    public static InstitucionEducativa instPrimaria2 = new InstitucionEducativa();
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA");
        instPrimaria1.setNombre("");
        instPrimaria1.setTipoInstitution("");
        instPrimaria1.setNroAlumnos(0);
        instPrimaria1.setNroDocente(0);
        instPrimaria1.setNroSedes(0);
        instPrimaria1.setGastroEstudiante(0);
        instPrimaria1.calculatPresupuesto();
        System.out.println("instPrimaria1: " + instPrimaria1.toString());
        
        System.out.println("FORMA EFICIENTE");
        InstitucionEducativa miInstitucion = new InstitucionEducativa(
            "Escuela nueva Milenio", 
            "Privada", 
            850, 
            40, 
            30, 
            15
        );
        miInstitucion.calculatPresupuesto();
        System.out.println("miInstitucion: " + miInstitucion.toString());
        
        instPrimaria2.setNombre("Escuela nueva Milenio");
        instPrimaria2.setTipoInstitution("Privada");
        instPrimaria2.setNroAlumnos(850);
        instPrimaria2.setNroDocente(40);
        instPrimaria2.setNroSedes(30);
        instPrimaria2.setGastroEstudiante(15);
        instPrimaria2.calculatPresupuesto();
        System.out.println("instPrimaria2: " + instPrimaria2.toString());
    }
}

class InstitucionEducativa {
    private String nombre;
    private String tipoInstitution;
    private int nroAlumnos;
    private int nroDocente;
    private int nroSedes;
    private int gastroEstudiante;
    private float presupuesto;
    
    public InstitucionEducativa() {}
    
    public InstitucionEducativa(String nombre, String tipoInstitution,
                              int nroAlumnos, int nroDocente,
                              int nroSedes, int gastroEstudiante) {
        this.nombre = nombre;
        this.tipoInstitution = tipoInstitution;
        this.nroAlumnos = nroAlumnos;
        this.nroDocente = nroDocente;
        this.nroSedes = nroSedes;
        this.gastroEstudiante = gastroEstudiante;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTipoInstitution(String tipoInstitution) {
        this.tipoInstitution = tipoInstitution;
    }
    
    public void setNroAlumnos(int nroAlumnos) {
        this.nroAlumnos = nroAlumnos;
    }
    
    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }
    
    public void setNroSedes(int nroSedes) {
        this.nroSedes = nroSedes;
    }
    
    public void setGastroEstudiante(int gastroEstudiante) {
        this.gastroEstudiante = gastroEstudiante;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getTipoInstitution() {
        return this.tipoInstitution;
    }
    
    public int getNroAlumnos() {
        return this.nroAlumnos;
    }
    
    public int getNroDocente() {
        return this.nroDocente;
    }
    
    public int getNroSedes() {
        return this.nroSedes;
    }
    
    public int getGastroEstudiante() {
        return this.gastroEstudiante;
    }
    
    public float getPresupuesto() {
        return this.presupuesto;
    }
    
    public void calculatPresupuesto() {
        this.presupuesto = this.nroAlumnos * this.gastroEstudiante;
    }
    
    
    public String toString() {
        return "{nombre: " + this.getNombre() + ", " +
               "tipoInstitution: " + this.getTipoInstitution() + ", " +
               "nroAlumnos: " + this.getNroAlumnos() + ", " +
               "nroDocente: " + this.getNroDocente() + ", " +
               "nroSedes: " + this.getNroSedes() + ", " +
               "gastroEstudiante: " + this.getGastroEstudiante() + ", " +
               "presupuesto: " + this.getPresupuesto() + "}";
    }
}
