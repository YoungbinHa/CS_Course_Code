/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import org.xml.sax.SAXException;

/**
 *
 * @author youngbinha
 */
public class SAXParserFXMLController implements Initializable {
    

    @FXML
    public TextArea textArea;

    private SAXParserToDOM parser;
    
    @FXML
    private void handleOpen(ActionEvent event) throws SAXException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("XML Documents", "*.xml", "*.XML"));
        File file = fileChooser.showOpenDialog(textArea.getScene().getWindow());
        
        parser = new SAXParserToDOM(file);
        parser.parse();
        textArea.setText(parser.getOutput());    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
