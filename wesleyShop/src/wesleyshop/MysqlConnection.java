
package wesleyshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;



public class MysqlConnection {
    private Connection connect =null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    String Username, Password;
    
    public void readDatabase() throws Exception{
            //This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/WesleyEnterprise", "root", "wesleigh#1");
            
            //Create SQL Query
            Statement stmt = connect.createStatement();
            String SQL = "SELECT * FROM User WHERE username = '" + Username + "' && password = '" + Password + "'";
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            //check Username and password
            while(rs.next()){
                Username = rs.getString(0);
                Password = rs.getString(3);
              }
    
             if (Username.equals(Username) && Password.equals(Password)){
                   System.out.println("Successful Login!\n-----");
                }
             else {
                   System.out.println("Incorrect Password\n-----");
            }
}
          
        }
    
    

    
   