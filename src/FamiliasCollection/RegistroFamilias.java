package FamiliasCollection;

import java.util.ArrayList;

public class RegistroFamilias {

    private ArrayList<Familia> familias;

    public RegistroFamilias() {
        this.familias = new ArrayList<Familia>();
    }

    public boolean ingresarFamilia(Familia familia) {
        boolean insercion = this.familias.add(familia);
        return insercion;
    }

    public void listarFamilia() {
        for (Familia familia : familias) {
            System.out.println(">  ------------------------------------------------------------");
            System.out.print(">  ");
            familia.listarMiembros();
            System.out.println("  <");
            System.out.println(">  ------------------------------------------------------------------------");
        }
    }

    public void consultarFamilia(String apellido) {
        for (Familia familia : familias) {
            if (familia.getApellido().equals(apellido)) {
                familia.listarMiembros();
            }
        }
    }

}
