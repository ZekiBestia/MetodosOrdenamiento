package fes.aragon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SecuencialController {

    @FXML
    private Button btnAleatorio;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnSalir;

    @FXML
    private TextArea txtIngresar;

    @FXML
    private TextArea txtNumeros;

    @FXML
    void aleatorio(ActionEvent event) {

    }

    @FXML
    void buscar(ActionEvent event) {

      }
      //Mostrar los datos del vector
      public void mostrarArreglos(int [] arreglo){
          int k;
          for(k=0; k < arreglo.length; k++){
                 System.out.print("["+ arreglo[k] +"]");
          }
          System.out.println();
      }
  
    

    @FXML
    void salir(ActionEvent event) {

    }

}
