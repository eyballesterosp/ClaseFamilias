package FamiliasCollection;

public class Miembro {

    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String rol;

    public Miembro(String nombre, String apellido, String sexo, int edad, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Miembro{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", rol=" + rol + '}';
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
