package FamiliasCollection;

public class Familias {

    public static void main(String[] args) {
        Miembro yesid = new Miembro("Yesid", "Ballesteros", "M", 17, "Hijo");
        //Miembro m2 = new Miembro("Yesid", "Ballesteros", "M", 17, "Hijo");
        Familia Ballesteros = new Familia("Ballesteros");
        Ballesteros.insertarMiembro(yesid);
        //Ballesteros.insertarMiembro(m2);

        RegistroFamilias registro = new RegistroFamilias();
        for (int i = 0; i < 1; i++) {
            registro.ingresarFamilia(Ballesteros);
        }
        registro.listarFamilia();

    }

}
