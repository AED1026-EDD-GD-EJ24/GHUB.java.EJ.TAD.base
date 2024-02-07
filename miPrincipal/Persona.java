package miPrincipal;

public class Persona {
    private String dni;
    private String nombre;
    private Fecha FechaNacimiento;
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public Fecha getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    
}
