/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbcsample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Rishitha
 */
public class DBUtil {

    private Connection conn = null;
    
    /**
     * @param args the command line arguments
     */
    public static Connection getConnection(){
        
	       try {
 
		    Class.forName("oracle.jdbc.driver.OracleDriver");
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("Please add ojdbc6.jar in your classpath if you are using oracle,"
                                + "otherwise set the respective database driver jar file.In netbeans right click on"
                                + "libraries,click on add jar/folder and provide your jar file");
			
 
		}
               Connection connection = null;
 
		try {
                        //XE -- Here Give your database name
                        //hr -- Give Your database username
                        //hr -- Give your database password
                        //You have to add ojdbc.jar in your classpath
                     
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "hr",
					"hr");
                        System.out.println("Hurrah got connection "+connection);
                        
 
		} catch (SQLException e) {
 
		       System.out.println("Please check if database name username password are correct ?");
 
		}
                
                return connection;
    }
                
    }     
     
    
    

