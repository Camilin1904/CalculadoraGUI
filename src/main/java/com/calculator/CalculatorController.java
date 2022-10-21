package com.calculator;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.*;
import javax.swing.JOptionPane;

public class CalculatorController {
    private double result = 0;
    private ArrayList<String> operations = new ArrayList<>();
    @FXML
    private TextField input = new TextField("Ingrese su input");
    @FXML
    private Label history = new Label("Empty");
    @FXML
    private TextField resultShow = new TextField();
    @FXML
    private void calculate() throws IOException {
        String data = input.getText();
        String[] split;
        if(data.contains("*")){
            split = data.split("\\*");
            try{
                result = Double.parseDouble(split[0])*Double.parseDouble(split[1]);
                operations.add(data + " = " + result);
                showLastResult();
                updateHistory();
            } catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, n);
            }
        }
        else if(data.contains("+")){
            split = data.split("\\+");
            try{
                result = Double.parseDouble(split[0])+Double.parseDouble(split[1]);
                operations.add(data + " = " + result);
                showLastResult();
                updateHistory();
            } catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, n);
            }   
        }
        if(data.contains("-")){
            split = data.split("-");
            try{
                result = Double.parseDouble(split[0])-Double.parseDouble(split[1]);
                operations.add(data + " = " + result);
                showLastResult();
                updateHistory();
            } catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, n);
            }   
        }
        if(data.contains("/")){
            split = data.split("/");
            try{
                result = Double.parseDouble(split[0])/Double.parseDouble(split[1]);
                operations.add(data + " = " + result);
                showLastResult();
                updateHistory();
            } catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, n);
            }   
        }

        
    }

    @FXML 
    private void showLastResult(){
        resultShow.setText(result + "");
        updateHistory();
    } 

    @FXML
    private void updateHistory(){
        String things = "";

        for(String s : operations){
            things += s + "\n";
        }

        history.setText(things);
    }


    @FXML
    private void addInfo(String data){
        if(!((data.equals("+")||data.equals("*")||data.equals("-")||data.equals("/"))&&(input.getText().contains("+")||input.getText().contains("*")||input.getText().contains("-")||input.getText().contains("/")))){
            input.setText(input.getText() + data);
        }
    }

    @FXML
    private void one(){
        addInfo("1");
    } 
    @FXML
    private void two(){
        addInfo("2");
    } 
    @FXML
    private void three(){
        addInfo("3");
    } 
    @FXML
    private void four(){
        addInfo("4");
    } 
    @FXML
    private void five(){
        addInfo("5");
    } 
    @FXML
    private void six(){
        addInfo("6");
    } 
    @FXML
    private void seven(){
        addInfo("7");
    } 
    @FXML
    private void eight(){
        addInfo("8");
    } 
    @FXML
    private void nine(){
        addInfo("9");
    } 
    @FXML
    private void asterix(){
        addInfo("*");
    } 
    @FXML
    private void plus(){
        addInfo("+");
    } 
    @FXML
    private void minus(){
        addInfo("-");
    } 
    @FXML
    private void slash(){
        addInfo("/");
    } 
    @FXML
    private void zero(){
        addInfo("");
    } 

    @FXML
    private void clear(){
        input.setText("");
    }
}
