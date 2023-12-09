package com.example.tryapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private TextField tfY,tfM,tfD,tfH,tfMin;
    @FXML
    private Button btn2,btn1,btn3;
    @FXML
    private Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;


    @FXML
    void btnOKClicked(ActionEvent e) {
        Calc2 cl = new Calc2();
        lbl2.setText(cl.mathMinute(Integer.parseInt(tfMin.getText())) + " minutes passed," + cl.mathHour(Integer.parseInt(tfH.getText())) + " hours passed");
        lbl1.setText(cl.mathDayy(Integer.parseInt(tfD.getText())) + " days passed," + cl.mathMonth(Integer.parseInt(tfM.getText())) + " months passed," + cl.mathYear(Integer.parseInt(tfY.getText())) + " years passed");
    }
    public void btnFinalClicked(ActionEvent e) {
        Calc2 cl = new Calc2();
        lbl2.setText(cl.mathMinute(34)+" minutes passed,"+cl.mathHour(11)+" hours passed");
        lbl1.setText(cl.mathDayy(24)+" days passed,"+cl.mathMonth(10)+" months passed,"+cl.mathYear(2022)+" years passed");

    }

    public void ClearLBL(ActionEvent e) {
        lbl1.setText("");lbl2.setText("");tfD.setText("");tfH.setText("");tfM.setText("");tfMin.setText("");tfY.setText("");
    }

    public void Ts1(MouseEvent e) {
        lbl5.setVisible(false); lbl6.setVisible(false);
    }
}

