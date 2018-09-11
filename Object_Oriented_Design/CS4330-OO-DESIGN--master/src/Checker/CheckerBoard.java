/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Checker;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author youngbinha
 */
public class CheckerBoard{
    
    private double width;
    private double height;
    private int rows;
    private int columns;
    private double rectangleWidth;
    private double rectangleHeight;
    private AnchorPane anchorPane;
    private Color lightColor, darkColor;
    
    
    public CheckerBoard(int rows, int columns, double width, double height, Color lightColor, Color darkColor) {
        this.rows = rows;
        this.columns = columns;
        this.width = width;
        this.height = height;
        this.lightColor = lightColor;
        this.darkColor = darkColor;

        anchorPane = new AnchorPane();
    }
    
    public CheckerBoard(int rows, int columns, double width, double height) {
        this(rows, columns, width, height, Color.RED, Color.BLACK);
    }
  
    public AnchorPane build(double width, double height) {
        
        clear();
        this.width = width;
        this.height = height;
        rectangleWidth = Math.ceil(width / (double)columns);
        rectangleHeight = Math.ceil(height / (double)rows);
        
        
        for (int row = 0; row < this.rows; row++) {
            for (int col = 0; col <this.columns; col++) {            
            
                Rectangle rect = new Rectangle(row*this.rectangleWidth, col*this.rectangleHeight, this.rectangleWidth, this.rectangleHeight);

            if ( (row+col) % 2 == 0 ) 
                rect.setFill(this.lightColor);
            else
                rect.setFill(this.darkColor);
                
            anchorPane.getChildren().add(rect);
        }
    }
        
        return anchorPane;
    }
    public void clear() {
        
        if(anchorPane != null){
            anchorPane.getChildren().clear();
        }
    }
    
    public AnchorPane getBoard() {
        if ( build(this.width, this.height) !=null)
            return anchorPane;
        return null;
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getRectangleWidth() {
        return rectangleWidth;
    }
    
    public double getRectangleHeight() {
        return rectangleHeight;
    }
}
