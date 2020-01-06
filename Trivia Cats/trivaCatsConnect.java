//connecting to the database
import java.sql.*; 
  
public class trivCatsDBObj  
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            Class.forName("org.mariadb.jdbc.Driver"); 
              
            // Establishing Connection 
            //fill with our username and password
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword"); 
  
            if (con != null)              
                System.out.println("Connected");             
            else            
                System.out.println("Not Connected"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
} 