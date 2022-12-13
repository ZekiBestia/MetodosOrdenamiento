package fes.aragon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrincipalController extends BaseController{

    @FXML
    private Button btnBinaria;

    @FXML
    private Button btnEstacionamiento;

    @FXML
    private Button btnOrden;

    @FXML
    private Button btnSecuencial;

    @FXML
    void binaria(ActionEvent event) {
    	this.nuevaVentana("Binaria");
    }

    @FXML
    void estacionamiento(ActionEvent event) {
    	this.nuevaVentana("");
    }

    @FXML
    void orden(ActionEvent event) {
    	this.nuevaVentana("Principal");
    }

    @FXML
    void secuencial(ActionEvent event) {
    	this.nuevaVentana("Secuencial");
    }

}
