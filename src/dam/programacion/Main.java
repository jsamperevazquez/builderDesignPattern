package dam.programacion;

/**
 * Main Class
 */
public class Main {

    private Main() {
    }

    public static void main(String[] args) {
/*
    Pizza margarita = new Pizza();
    margarita.setCebolla(true);
    margarita.setChampiñones(true);
    margarita.setExtraQueso(true);
    margarita.setMasa("Fina");
    margarita.setJamon(true);
    margarita.setPiña(true);
    margarita.setSinGluten(false);
    margarita.setRelleno(false);
    margarita.setTamaño(Pizza.FAMILIAR);
    }
    Pizza hawaiana = new Pizza("Masa pan","Tomate",true,true,false,true,true,false,true,true,Pizza.MEDIANA);
*/

        Pizza base = new PizzaBuilder().setTipoMasa("Pan")
                .setTamaño(2)
                .build();

    }

}
