package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        
        //llamamos y hacemos visible a IGU
        Principal princ = new Principal();
        princ.setVisible(true);                 //que la pantalla principal se vuelva visible
        princ.setLocationRelativeTo(null);      //que aparezca en el medio
        
    }
}
