

package a.modelo.preparo;

import a.iinterface.EstrategiaDePreparo;


public class PreparoPremium implements EstrategiaDePreparo {

    @Override
    public String preparar() {
        return "Preparo Premium";
    }
}