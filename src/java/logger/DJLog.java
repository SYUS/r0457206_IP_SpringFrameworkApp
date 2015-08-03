/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author SYUS
 */
public class DJLog {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    private boolean writeToLogFile = false;
    private Logger logger;
    
    public DJLog(){}
    
    public DJLog(boolean writeToLogFile) throws IOException{
        this.writeToLogFile = writeToLogFile;
        if(writeToLogFile){
            logger = Logger.getLogger("DreamJournal log");  
            FileHandler fh;  
            try {  

                // This block configure the logger with handler and formatter  
                fh = new FileHandler("M:\\School\\Semester 4\\IP\\DreamJournal Project\\logs");  
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();  
                fh.setFormatter(formatter);  

                // the following statement is used to log any messages  
                logger.log(Level.CONFIG, "Started logger for DreamJournal project...");  

            } catch (SecurityException | IOException e) {  
            }  
        }
    }
    
    public void writeInfo(String infoMessage) {
        System.out.println(ANSI_GREEN + "[LOG][INFO] << " + infoMessage + " >>" + ANSI_RESET);
        if(writeToLogFile)
            logger.log(Level.INFO, "[LOG][INFO] << {0} >>", infoMessage);
    }
    
    public void writeWarning(String warningMessage) {
        System.out.println(ANSI_YELLOW + "[LOG][INFO] ! " + warningMessage + " !" + ANSI_RESET);
        if(writeToLogFile)
            logger.log(Level.WARNING, "[LOG][INFO] ! {0} !", warningMessage);
    }
    
    public void writeFatal(String fatalMessage) {
        System.out.println(ANSI_RED + "[LOG][INFO] !! " + fatalMessage + " !!" + ANSI_RESET);
        if(writeToLogFile)
            logger.log(Level.SEVERE, "[LOG][INFO] !! {0} !!", fatalMessage);
    } 
}
