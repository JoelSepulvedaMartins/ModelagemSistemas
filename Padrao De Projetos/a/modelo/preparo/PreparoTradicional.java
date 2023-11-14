
package a.modelo.preparo;

import a.iinterface.EstrategiaDePreparo;


public class PreparoTradicional implements EstrategiaDePreparo {

    @Override
    public String preparar() {
        return "Preparo Tradicional";
    }
}