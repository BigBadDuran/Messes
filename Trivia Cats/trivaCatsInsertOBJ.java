import java.sql.*; 
  //using the Users table as a template with placeholder vals
public class insertUsers
{ 
    public static void main(String args[]) 
    { 
        int userID = 1988421; 
        String userName = "TimbreJack"; 
        String password_hash = "******"; 
        String status = "Active"; 
        int lastLogin = 11182019
        int experience = 420;
        int questionsAsked = 4;
        int questionsCorrect = 4;

          
        try
        { 
            Class.forName("org.mariadb.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword"); 
            Statement stmt = con.createStatement();
              
            // Inserting data in database 
            String q1 = "insert into Users values('" +userID+ "', '" +userName+ "', '" +password_hash+ "', '" +status+ "', '" +lastLogin+ "', '" +experience+ "', '" +questionsAsked+ "', '" +questionsCorrect+ "')"; 
            int x = stmt.executeUpdate(q1); 
            if (x > 0)             
                System.out.println("Successfully Inserted");             
            else            
                System.out.println("Insert Failed"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
    } 
} 