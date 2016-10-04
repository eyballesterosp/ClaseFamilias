package FamiliasCollection;

import java.util.ArrayList;

public class Familia {

    private String apellido;
    private ArrayList<Miembro> miembros;

    public Familia(String Apellido) {
        this.apellido = Apellido;
        this.miembros = new ArrayList<Miembro>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public boolean insertarMiembro(Miembro miembro) {
        boolean insercion = this.miembros.add(miembro);
        return insercion;
    }

    public void listarMiembros() {
        for (int i = 0; i < this.miembros.size(); i++) {
            Miembro m = this.miembros.get(i);
            System.out.print(m);
        }
    }
}
