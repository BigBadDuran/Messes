

//creating table

import java.sql.*;

public class crtUsers {
   // JDBC driver name and database URL
    //fill with our username and pw
   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
   static final String DB_URL = "jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.mariadb.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE Users " +
                   "(userID INTEGER not NULL, " +
                   " UserName VARCHAR(20) not NULL, " + 
                   " password_hash VARCHAR(20) not NULL, " + 
                   " status VARCHAR(50), " + 
                   " lastLogin date, " +
                   " experience INTEGER, " +
                   " questionsAsked INTEGER, " +
                   " questionsCorrect INTEGER, "
                   " PRIMARY KEY ( userID ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end crtUsers



import java.sql.*;

public class crtUserPoses {
   // JDBC driver name and database URL
    //fill with our username and pw
   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
   static final String DB_URL = "jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.mariadb.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE UserPoses " +
                   "(userID VARCHAR(20) not NULL, " +
                   " poseID INTEGER not NULL, " + 
                   " aquiredDate date, " +
                   " status enum('A', 'I', 'M'), " 
                   " PRIMARY KEY ( userID, poseID ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end crtUserPoses


import java.sql.*;

public class crtPoses {
   // JDBC driver name and database URL
    //fill with our username and pw
   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
   static final String DB_URL = "jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.mariadb.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE Poses " +
                   "(poseID INTEGER not NULL, " +
                   " implementationDate date not NULL, " + 
                   " description VARCHAR(50), " 
                   " PRIMARY KEY ( poseID ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end crtPoses



import java.sql.*;

public class crtAvatar {
   // JDBC driver name and database URL
    //fill with our username and pw
   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
   static final String DB_URL = "jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.mariadb.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE Avatar " +
                   "(avatarID INTEGER not NULL, " +
                   " implementationDate date not NULL, " + 
                   " description VARCHAR(50), " 
                   " PRIMARY KEY ( avatarID ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end crtAvatar



import java.sql.*;

public class crtUserAvatar {
   // JDBC driver name and database URL
    //fill with our username and pw
   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
   static final String DB_URL = "jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.mariadb.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE UserAvatar " +
                   "(userID INTEGER not NULL, " +
                   " avatarID INTEGER not NULL, " + 
                   " aquiredDate date, " +
                   " status enum('A', 'I', 'M'), " 
                   " PRIMARY KEY ( userID, avatarId ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end crtUserAvatar


import java.sql.*;

public class crtImageData {
   // JDBC driver name and database URL
    //fill with our username and pw
   static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";  
   static final String DB_URL = "jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.mariadb.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE ImageData " +
                   "(avatarID INTEGER not NULL, " +
                   " poseID INTEGER not NULL, " + 
                   " imageData VARCHAR(150) not NULL, " +
                   " status enum('A', 'I', 'M'), " 
                   " PRIMARY KEY ( avatarID, avatarId ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end crtImageData





