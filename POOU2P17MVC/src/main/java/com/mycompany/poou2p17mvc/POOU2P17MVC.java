
package com.mycompany.poou2p17mvc;

import control.control;
import modelo.modelo;
import vista.vista;

public class POOU2P17MVC {

    public static void main(String[] args) {
        modelo mod =new modelo();
        vista vis=new vista();
        control cont=new control(vis,mod);
        
        cont.iniciar();
        vis.setVisible(true);
        
    }
}
