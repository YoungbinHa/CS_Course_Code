/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import java.io.File;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.xml.sax.SAXException;

/**
 *
 * @author youngbinha
 */
public class SAXParserToDOM {
    private File file;
    private StringBuffer buffer;
    private DefaultHandler dfhandler;
    
    private String tempStr;
    
    
    public SAXParserToDOM(File file)
    {
        this.file = file;
        dfhandler = Handler();
        tempStr = "";
    }
    
    
    private DefaultHandler Handler()
    {
        return new DefaultHandler(){
          
            @Override
            public void startElement(String namespaceURI,
                         String localName,
                         String qName, 
                         Attributes atts) throws SAXException {
                tempStr = tempStr + "<" + qName + ">" + "\n"+"   ";
                buffer = new StringBuffer();
            }
            
            @Override
            public void characters(char ch[],int start,int length){ 
                buffer.append(new String(ch,start,length));
            } 
            
            @Override
            public void endElement(String namespaceURI,
                         String localName,
                         String qName)
            {
                tempStr = tempStr.substring(0, tempStr.length());
                tempStr = tempStr + "-"  + buffer + "\"" + "\n";
            }
        };
    }
    
    public void parse() throws SAXException
    {
        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            saxParser.parse(file, dfhandler);
        }
        catch(Exception e)
        {
            throw new SAXException();
        }
    }
    
    public String getOutput()
    {
        return tempStr;
    }
}

