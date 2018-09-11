/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifcationexamples;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import taskers.*;

/**
 * FXML Controller class
 *
 * @author dalemusser
 */
public class NotificationsUIController implements Initializable, Notifiable {

    @FXML
    private TextArea textArea;
    
    private Task1 task1;
    private Task2 task2;
    private Task3 task3;
    
    @FXML
    private Button btn1, btn2, btn3;
    private Boolean swich1 = false, swich2 = false, swich3 = false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void start(Stage stage) {
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                if (task1 != null) task1.end();
                if (task2 != null) task2.end();
                if (task3 != null) task3.end();
            }
        });
    }
    
    @FXML
    public void startTask1(ActionEvent event) {
        if (swich1 == false) {
            System.out.println("start task 1");
            if(task1 == null){
                btn1.setText("End Task 1");
                task1 = new Task1(2147483647, 1000000);
                task1.setNotificationTarget(this);
                task1.start();
                swich1 = true;
            }
        }
        else {
            btn1.setText("start task 1");
            if(task1 != null){
                task1.end();
                swich1 = false;
                task1 = null;
                
            }
        }
    }
    
    @Override
    public void notify(String message) {
        if (message.equals("Task1 done.")) {
            task1 = null;
            btn1.setText("start task 1");
            swich1 = false;

        }
        if (message.equals("Task2 done.")) {
            task2 = null;
            btn2.setText("start task 2");
            swich2 = false;

        }
        if (message.equals("Task3 done.")) {
            task3 = null;
            btn3.setText("start task 3");
            swich3 = false;
            
        }
        textArea.appendText(message + "\n");
    }
    
    @FXML
    public void startTask2(ActionEvent event) {
        if (swich2 == false) {
            System.out.println("start task 2");
            if (task2 == null) {
                btn2.setText("End task 2");
                task2 = new Task2(2147483647, 1000000);
                task2.setOnNotification((String message) -> {
                    notify(message);
                });
                task2.start();
                swich2 = true;
            }
        }
        else {
            btn2.setText("start Task 2");
            if(task2 != null){
                task2.end();
                swich2 = false;
                task2 = null;
                
            } 
        }
        
    }
    
    @FXML
    public void startTask3(ActionEvent event) {
        if (swich3 == false) {
            System.out.println("start task 3");
            if (task3 == null) {
                btn3.setText("End task 2");
                task3 = new Task3(2147483647, 1000000);
                // this uses a property change listener to get messages
                task3.addPropertyChangeListener((PropertyChangeEvent evt) -> {
                    notify((String)evt.getNewValue());
                });
                task3.start();
                swich3 = true;

            }
        }
        else {
            btn3.setText("start Task 2");
            if(task3 != null){
                task3.end();
                swich3 = false;
                task3 = null;
                
            } 
        }
    } 
}
