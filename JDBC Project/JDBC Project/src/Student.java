import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Student {

    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/ritik";
            String username = "root";
            String password = "ritik123";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stm = con.createStatement();

            // String query = "Create table Student (sid int(30) , sname varchar(200) , semail varchar(200))";
            // stm.execute(query);
            // System.out.println("Table Create Succesfully");
            // con.close();
            
            String insert = "Insert into Student VALUES (02, 'Aman' , 'abc12@gmail.com')";
            stm.execute(insert);
            System.out.println(" insert Table  Succesfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
