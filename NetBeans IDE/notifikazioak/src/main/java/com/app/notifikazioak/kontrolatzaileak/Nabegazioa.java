package com.app.notifikazioak.kontrolatzaileak;

import com.app.notifikazioak.interfazea.alertaSortuJFrame;
import com.app.notifikazioak.interfazea.erregistratuJFrame;
import com.app.notifikazioak.interfazea.hasieraJFrame;
import com.app.notifikazioak.interfazea.logeatuJFrame;

public class Nabegazioa {

    public void navigateToHasiera(logeatuJFrame logeatu) {
        hasieraJFrame hasiera = new hasieraJFrame();
        hasiera.setVisible(true);
        logeatu.dispose();
    }

    public void navigateToErregistratu(logeatuJFrame logeatu) {
        erregistratuJFrame erregistratu = new erregistratuJFrame();
        erregistratu.setVisible(true);
        logeatu.dispose();
    }

    public void navigateToLogeatu(erregistratuJFrame erregistratu) {
        logeatuJFrame logeatu = new logeatuJFrame();
        logeatu.setVisible(true);
        erregistratu.dispose();
    }

        public void navigateToAlertaSortu(hasieraJFrame hasiera) {
        alertaSortuJFrame alertaSortu = new alertaSortuJFrame();
        alertaSortu.setVisible(true);
        hasiera.dispose();
    }

}
