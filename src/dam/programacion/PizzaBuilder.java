package dam.programacion;

/**
 * Creado por @autor: angel
 * El  05 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/

/**
 * Builder Class
 */
public class PizzaBuilder {
    Pizza _pizza;
    // método que devuelve el objeto terminado
    public Pizza build(){
        return this._pizza;
    }
    // Constructor

    /**
     * Constructor method
     */
    public PizzaBuilder() {
        _pizza= new Pizza();
    }

   // Métodos para la personalización de la pizza

    public PizzaBuilder setTipoMasa (String masa){
       _pizza.setMasa(masa);
       return this;
   }

    public PizzaBuilder setTamaño(int tamaño){
        _pizza.setTamaño(tamaño);
        return this;
    }
    public PizzaBuilder setTipoSalsa (String tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }
    public PizzaBuilder setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }
    public PizzaBuilder setSalsa (boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }
    public PizzaBuilder setCebolla (boolean cebolla){
        _pizza.setRelleno(cebolla);
        return this;
    }
    public PizzaBuilder setSinGluten (boolean gluten){
        _pizza.setSinGluten(gluten);
        return this;
    }
    public PizzaBuilder setExtraQueso (boolean queso){
        _pizza.setExtraQueso(queso);
        return this;
    }
    public PizzaBuilder setPiña (boolean piña){
        _pizza.setPiña(piña);
        return this;
    }
    public PizzaBuilder setChampiñones (boolean champis){
        _pizza.setChampiñones(champis);
        return this;
    }
    public PizzaBuilder setJamon (boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }
}
