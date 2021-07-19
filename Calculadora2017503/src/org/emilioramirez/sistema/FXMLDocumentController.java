/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emilioramirez.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author emial
 */
public class FXMLDocumentController implements Initializable {
    
    float dato1,dato2,resultado;
    int op,cont;
    
    @FXML private TextField txtValores;
    @FXML private TextField txtOperacion;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnUnoX;
    @FXML private Button btnXY;
    @FXML private Button btnPorciento;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnIgual;

    @FXML
    private void handleButtonAction(ActionEvent event){
        if (event.getSource() == btnCero){
            txtValores.setText(txtValores.getText() + "0");
            txtOperacion.setText(txtOperacion.getText() + "0");
            enablebtn();
        }
        else if (event.getSource() == btnUno){
            txtValores.setText(txtValores.getText() + "1");
            txtOperacion.setText(txtOperacion.getText() + "1");
            enablebtn();
        }
        else if(event.getSource() == btnDos){
            txtValores.setText(txtValores.getText() + "2");
            txtOperacion.setText(txtOperacion.getText() + "2");
            enablebtn();
        }
        else if(event.getSource() == btnTres){
            txtValores.setText(txtValores.getText() + "3");
            txtOperacion.setText(txtOperacion.getText() + "3");
            enablebtn();
        }
        else if(event.getSource() == btnCuatro){
            txtValores.setText(txtValores.getText() + "4");
            txtOperacion.setText(txtOperacion.getText() + "4");
            enablebtn();
        }
        else if(event.getSource() == btnCinco){
            txtValores.setText(txtValores.getText() + "5");
            txtOperacion.setText(txtOperacion.getText() + "5");
            enablebtn();
        }
        else if(event.getSource() == btnSeis){
            txtValores.setText(txtValores.getText() + "6");
            txtOperacion.setText(txtOperacion.getText() + "6");
            enablebtn();
        }    
        else if(event.getSource() == btnSiete){
            txtValores.setText(txtValores.getText() + "7");
            txtOperacion.setText(txtOperacion.getText() + "7");
            enablebtn();
        }    
        else if(event.getSource() == btnOcho){
            txtValores.setText(txtValores.getText() + "8");
            txtOperacion.setText(txtOperacion.getText() + "8");
            enablebtn();
        }
        else if(event.getSource() == btnNueve){
            txtValores.setText(txtValores.getText() + "9");
            txtOperacion.setText(txtOperacion.getText() + "9");
            enablebtn();
        }
        else if(event.getSource() == btnPunto &&  btnPunto.isDisabled() == false && txtValores.getText().equals("")){
            txtValores.setText("0.");
            txtOperacion.setText(txtOperacion.getText() + "0.");
            btnPunto.setDisable(true);
            enablebtn();
        }
        else if(event.getSource() == btnPunto &&  btnPunto.isDisabled() == false){
            txtValores.setText(txtValores.getText() + ".");
            txtOperacion.setText(txtOperacion.getText() + ".");
            btnPunto.setDisable(true);
            enablebtn();
        }
        
        else if(event.getSource() == btnSuma && dato1 != 0 && dato2 != 0){
            dato1 = dato2 + dato1;
            dato2 = Float.parseFloat(txtValores.getText());
            op = 1;
            txtOperacion.setText(txtOperacion.getText() + "+");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        
        else if(event.getSource() == btnSuma && dato2 != 0){
            dato1 = dato2;
            dato2 = Float.parseFloat(txtValores.getText());
            op = 1;
            txtOperacion.setText(txtOperacion.getText() + "+");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        
         else if(event.getSource() == btnSuma){
            dato2 = Float.parseFloat(txtValores.getText());
            op = 1;
            txtOperacion.setText(txtOperacion.getText() + "+");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        
        else if(event.getSource() == btnResta && dato2 != 0 && (txtOperacion.getText()).charAt(txtOperacion.getText().length()) >= 4){
            dato1 = dato2 * (-1) - dato1;
            dato2 = Float.parseFloat(txtValores.getText());
            dato1 = dato1 - dato2;
            op = 2;
            txtOperacion.setText(txtOperacion.getText() + "-");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        else if(event.getSource() == btnResta && dato2 != 0 && (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 4) != '-'){
            dato1 = dato2 - dato1;
            dato2 = Float.parseFloat(txtValores.getText());
            dato1 = dato1 - dato2;
            op = 2;
            txtOperacion.setText(txtOperacion.getText() + "-");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
         else if(event.getSource() == btnResta && dato2 == 0 && (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 1) == '-'){
            op = 2;
            txtOperacion.setText(txtOperacion.getText() + "0-");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        else if(event.getSource() == btnResta){
            dato2 = Float.parseFloat(txtValores.getText());
            op = 2;
            txtOperacion.setText(txtOperacion.getText() + "-");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        else if(event.getSource() == btnMulti){
            dato2 = Float.parseFloat(txtValores.getText());
            op = 3;
            txtOperacion.setText(txtOperacion.getText() + "*");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        else if(event.getSource() == btnDivi){
            dato2 = Float.parseFloat(txtValores.getText());
            op = 4;
            txtOperacion.setText(txtOperacion.getText() + "/");
            txtValores.setText("");
            btnPunto.setDisable(false);
            desablebtn();
        }
        else if(event.getSource() == btnUnoX){
            dato2 = Float.parseFloat(txtValores.getText());
            txtOperacion.setText("1/" + txtOperacion.getText());
            resultado = 1 / dato2;
            txtValores.setText(String.valueOf(resultado));
            btnPunto.setDisable(false);
            desablebtn();
        }
        else if(event.getSource() == btnXY){
            dato2 = Float.parseFloat(txtValores.getText());
            txtOperacion.setText(txtOperacion.getText() + "^");
            btnPunto.setDisable(false);
            op = 5;
            txtValores.setText("");
            desablebtn();
        }
        else if(event.getSource() == btnPorciento){
            dato2 = Float.parseFloat(txtValores.getText());
            txtOperacion.setText(txtOperacion.getText() + "%");
            btnPunto.setDisable(false);
            resultado = (1 / 100) * dato2;
            txtValores.setText(String.valueOf(resultado));
            desablebtn();
        }
        else if(event.getSource() == btnC){
            txtValores.setText("");
            txtOperacion.setText("");
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            btnPunto.setDisable(false);
            btnSuma.setDisable(false);
        }
        else if(event.getSource() == btnCE){
            txtValores.setText("");
            btnPunto.setDisable(false);
            btnSuma.setDisable(false);
        }
        else if(event.getSource() == btnMasMenos){
            dato2 = Float.parseFloat(txtValores.getText()) * (-1);
            txtValores.setText(String.valueOf(dato2));
            txtOperacion.setText(txtOperacion.getText() + "(-1)");
        }
        
        else if(event.getSource() == btnIgual && (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 1) == '='){
            
            switch (op){
                case 1:
                    txtValores.setText("");
                    txtOperacion.setText(String.valueOf(dato1) + "+" + String.valueOf(resultado) + "=");
                    dato1 = dato1 + resultado;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(false);
                break;
                case 2:
                    txtValores.setText("");
                    txtOperacion.setText(String.valueOf(dato1) + "-" + String.valueOf(resultado) + "=");
                    dato1 = dato1 - resultado;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(false);
                break;
               
            }
        }
        else if(event.getSource() == btnIgual && (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 1) == '+' 
                || (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 1) == '-' 
                || (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 1) == '*' 
                || (txtOperacion.getText()).charAt(txtOperacion.getText().length() - 1) == '/'){
            
            switch (op){
                case 1:
                    txtOperacion.setText(txtOperacion.getText() + String.valueOf(dato1 + dato2) + "=");
                    txtValores.setText("");
                    
                    resultado = dato1 * dato2;
                    dato1 = dato2 * dato1;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
                case 2:
                    txtOperacion.setText(txtOperacion.getText() + String.valueOf(dato1 - dato2) + "=");
                    txtValores.setText("");
                    
                    resultado = dato1 - dato2;
                    dato1 = dato1 - dato2 - (dato1 - dato2);
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
            }
        }
        else if(event.getSource() == btnIgual){
            
            switch (op){
                case 1:
                    dato1 = dato2 + dato1;
                    dato2 = Float.parseFloat(txtValores.getText());
                    txtOperacion.setText(txtOperacion.getText() + "=");
                    txtValores.setText("");
                    
                    dato1 = dato2 + dato1;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
                case 2:
                    dato1 = dato2;
                    dato2 = Float.parseFloat(txtValores.getText());
                    txtOperacion.setText(txtOperacion.getText() + "=");
                    txtValores.setText("");
                    
                    dato1 = dato1 - dato2;
                    resultado = dato2;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
                case 3:
                    dato1 = dato2;
                    dato2 = Float.parseFloat(txtValores.getText());
                    txtOperacion.setText(txtOperacion.getText() + "=");
                    txtValores.setText("");
                    
                    dato1 = dato2 * dato1;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
                case 4:
                    dato1 = dato2;
                    dato2 = Float.parseFloat(txtValores.getText());
                    txtOperacion.setText(txtOperacion.getText() + "=");
                    txtValores.setText("");
                    
                    dato1 = dato1 / dato2;
                    txtValores.setText(String.valueOf(dato1));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
                case 5:
                    dato1 = Float.parseFloat(txtValores.getText());
                    txtOperacion.setText(txtOperacion.getText() + "=");
                    txtValores.setText("");
                    resultado = 1;
                    for(cont = 1; cont <= dato1; cont++){
                        resultado = resultado * dato2;
                    }
                    txtValores.setText(String.valueOf(resultado));
                    enablebtn();
                    btnPunto.setDisable(true);
                break;
            }
        }
       
    }
    
    @FXML
    public void desablebtn(){
            btnSuma.setDisable(true);
            btnResta.setDisable(true);
            btnMulti.setDisable(true);
            btnDivi.setDisable(true);
    }
    
    @FXML
    public void desablebtnnum(){
            btnSuma.setDisable(true);
            btnResta.setDisable(true);
            btnMulti.setDisable(true);
            btnDivi.setDisable(true);
    }
    
    @FXML
    public void enablebtn(){
            btnSuma.setDisable(false);
            btnResta.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);
    }
    
    @FXML
    public void enablebtnnum(){
            btnSuma.setDisable(false);
            btnResta.setDisable(false);
            btnMulti.setDisable(false);
            btnDivi.setDisable(false);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
