package my.ccaregui;

import java.sql.*;
import javax.sql.*;
import javax.swing.JOptionPane;
import java.util.prefs.Preferences;
import java.io.*;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectDB {
    //String serverName;
    public  Connection getConnection(){
        Connection con = null;   
        
        
        try {
            
           // Load the JDBC driver
                String driverName = "oracle.jdbc.driver.OracleDriver";
                Class.forName(driverName);

                // Create a connection to the database
                String serverName = "10.196.190.57"; //"10.196.190.57";
                String portNumber = "1521";
                String sid = "PRODPIN";
                String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + "/" + sid;
                //String url = "jdbc:oracle:thin:@10.196.190.57:1521/PRODPIN";
                String username = "PRODPIN1";
                String password = "PRODPIN1";
                con = DriverManager.getConnection(url, username, password);
                
                //JOptionPane.showMessageDialog(null,"Connected");
                
                System.out.println("Connected");
        }
        catch(ClassNotFoundException e){
           System.out.println(e.getMessage());
           System.exit(0);
        }
        catch (SQLException e)
        {
           System.out.println(e.getMessage());
           System.exit(0);
        }
        return con;
    }
      
//   public static  ReadData(){
//        
//        
//        try{
//            
//              fis = new FileInputStream(file);
//
//               Here BufferedInputStream is added for fast reading.
//              bis = new BufferedInputStream(fis);
//              dis = new DataInputStream(bis);
//              FileReader fr = new FileReader("C:\\MyFile.txt");
//              BufferedReader bf = new BufferedReader(fr);
//
//              int numberOfLines = 3;
//               String[] textData = new String[numberOfLines];
//              int i;
//              for (i=0; i < numberOfLines; i++) {
//                textData[i] = bf.readLine();
//                }
//
//             
//              
//                     dispose all the resources after using them.
//              bf.close();
//              fr.close();
//              
//
//
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } 
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//      
// }  
//    
}



