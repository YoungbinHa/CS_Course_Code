/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author youngbinha
 */
public class CheckerBoardFXMLController implements Initializable, Startable {
    private Stage stage;
    
    private int numRows;
    private int numColumns;
    private Color lightColor, darkColor;
    
    
    private Checker.CheckerBoard checkerBoard;
    
    @FXML
    private VBox vBox;
    
    @FXML
    private MenuBar menuBar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.numRows =8;
        this.numColumns = 8;
        this.lightColor=Color.RED;
        this.darkColor=Color.BLACK;
        
    }    

    @Override
    public void start(Stage stage) {
        
        
        this.stage = stage;
        
        this.checkerBoard= new Checker.CheckerBoard(this.numRows, this.numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
        
        ChangeListener<Number> lambdaChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            refresh();
        };
        
        this.stage.widthProperty().addListener(lambdaChangeListener);
        this.stage.heightProperty().addListener(lambdaChangeListener);
        
        refresh();
    }
    
    private void refresh() {
        checkerBoard.build(this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight());
    }
    private void clearAnchorPane() {
        checkerBoard.clear();
    }
    @FXML
    private void handleSixteenBySixteen(ActionEvent event) {

        this.numRows =16;
        this.numColumns = 16;
        
        checkerBoard.clear();

        this.checkerBoard= new Checker.CheckerBoard(this.numRows, this.numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
    }
    
    @FXML
    private void handleTenByTen(ActionEvent event) {
        this.numRows =10;
        this.numColumns = 10;
        
        checkerBoard.clear();

        this.checkerBoard= new Checker.CheckerBoard(numRows, numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
    }
    
    @FXML
    private void handleEightByEight(ActionEvent event) {
        this.numRows =8;
        this.numColumns = 8;
        
        checkerBoard.clear();

        this.checkerBoard= new Checker.CheckerBoard(numRows, numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
    }
    
    @FXML
    private void handleThreeByThree(ActionEvent event) {
        this.numRows =3;
        this.numColumns = 3;
        
        checkerBoard.clear();

        this.checkerBoard= new Checker.CheckerBoard(numRows, numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
    }
    
    @FXML
    private void handleDefaultColor(ActionEvent event) {
        
        this.lightColor=Color.RED;
        this.darkColor=Color.BLACK;
        checkerBoard.clear();

        this.checkerBoard= new Checker.CheckerBoard(numRows, numColumns,this.stage.getScene().getWidth(), this.stage.getScene().getHeight()-this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
    }
    
    @FXML
    private void handleBlueColor(ActionEvent event) {
        
        this.lightColor=Color.SKYBLUE;
        this.darkColor=Color.DARKBLUE;
        checkerBoard.clear();

        this.checkerBoard = new Checker.CheckerBoard(numRows, numColumns, this.stage.getScene().getWidth(), this.stage.getScene().getHeight() - this.menuBar.getHeight(), this.lightColor, this.darkColor);
        vBox.getChildren().add(this.checkerBoard.getBoard());
    }
}
