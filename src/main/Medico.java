package src.main;
public class Medico {
    private String nombre;
    private String apellidos;
    private String especialidad;
    private String cargo;
    public Medico(String nombre, String apellidos, String especialidad, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.cargo = cargo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}