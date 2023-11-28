package com.example.assignment2_javafx;


import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.ToggleGroup;

public class ExcelController {
    // Fields to link with the FXML components
    @FXML
    private TextField inputField;

    @FXML
    private RadioButton rdoSum;

    @FXML
    private RadioButton rdoAvg;

    @FXML
    private RadioButton rdoMax;

    @FXML
    private RadioButton rdoMin;

    @FXML
    private TextField resultField;

    @FXML
    private ToggleGroup rdoGroup;

    @FXML
    private Excel excelFile;

    // Initialization method for setting up radio button groups
    @FXML
    public void initialize() {
        rdoGroup = new ToggleGroup();
        rdoSum.setToggleGroup(rdoGroup);
        rdoAvg.setToggleGroup(rdoGroup);
        rdoMax.setToggleGroup(rdoGroup);
        rdoMin.setToggleGroup(rdoGroup);
    }

    // Event handler for the "Calculate" button
    @FXML
    private void OnCalculateButton(ActionEvent event){
        System.out.println("Calculate Button is clicked");

        // Get user input from the text field
        String userInput = inputField.getText();

        //Create an Excel object with user inout
        excelFile = new Excel(userInput);
        double result = 0.0;

        // Do the math operation when a radio button is selected using if else if statement
        if (rdoSum.isSelected()) {
            result = excelFile.findTotal();
        }else if (rdoAvg.isSelected()) {
            result = excelFile.findAvg();
        }else if (rdoMax.isSelected()){
            result = excelFile.findMax();
        }else if (rdoMin.isSelected()){
            result = excelFile.findMin();
        }

        // Display the result in the result field
        resultField.setText(String.valueOf(result));
    }
}




