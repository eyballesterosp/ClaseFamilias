package FAMILIA;

public class Familia {

    private String Apellido;
    private Persona Madre;
    private Persona Padre;
    private Persona[] Hijos;

    public Familia(String Apellido) {
        this.Apellido = Apellido;
        this.Hijos = new Persona[2];
    }

    public Persona[] listarMiembros() {
        return null;
    }

    public Persona[] buscarMiembros() {
        return null;
    }

    public Persona[] agregarMiembros() {
        return null;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Persona getMadre() {
        return Madre;
    }

    public void setMadre(Persona Madre) {
        this.Madre = Madre;
    }

    public Persona getPadre() {
        return Padre;
    }

    public void setPadre(Persona Padre) {
        this.Padre = Padre;
    }

    public Persona[] getHijos() {
        return Hijos;
    }

    public void setHijos(Persona[] Hijos) {
        this.Hijos = Hijos;
    }

}
