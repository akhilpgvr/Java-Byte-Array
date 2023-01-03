package exam;

import  java.sql.*;
public class RunSql {
	
public static void main(String[] args) {
   try{
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acabestraining", "root", "1234");
	   Statement stmt = con.createStatement();
	   ResultSet res = stmt.executeQuery("select MAX(SALARY) AS MAX_SALARY from doctors;");
      while (res.next()) {
//         System.out.print("ID: " + res.getInt("ID"));
         System.out.print("MAX_Salary: " + res.getInt("MAX_SALARY"));
//         System.out.print(", First: " + res.getString("FNAME"));
//         System.out.println(", Last: " + res.getString("LNAME"));
         }
   }
   catch (SQLException e){
      e.printStackTrace();
   }
}
}
