
package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.vista;

public class control implements ActionListener {
    
   private vista view;
   private modelo model; 
   
   public control (vista view, modelo model) {
   this.view=view;
   this.model=model;
   this.view.btSumar.addActionListener(this);
   this.view.btRestar.addActionListener(this);
   this.view.btMulti.addActionListener(this);
   this.view.btDivi.addActionListener(this);
   
   }
   
public void iniciar(){
    view.setTitle("usted va a sumar por medio de mvc");
    view.setLocationRelativeTo(null);
    view.txtn1.setText(String.valueOf(model.getV1()));
    view.txtn2.setText(String.valueOf(model.getV2()));
    view.txtoperacion.setText(String.valueOf(model.getTotal()));
    
}


    @Override
    public void actionPerformed(ActionEvent e) {
    model.setV1(Integer.valueOf(view.txtn1.getText()));
    model.setV2(Integer.valueOf(view.txtn2.getText())) ;  
            model.sumar();
            model.restar();
            model.multiplicar();
            model.dividir();
            view.txtoperacion.setText(String.valueOf(model.getTotal()));
            
            
            
    }
   
}
