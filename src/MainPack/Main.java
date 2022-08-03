package MainPack;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // manager is the name of data base
            String url = "jdbc:mysql://localhost:3306/manager?useUnicode-true&useJDBCCompliant TimezoneShift-true&useLegacyDatetimeCode=false&server Timezone-UTC";
            String user="root";
            String pass="";
            Connection con = DriverManager.getConnection(url, user,pass);
            if(con!=null) {
                System.out.println("Successful");
             }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        int input;

        do {
            System.out.println("*************************************************");
            System.out.println("*******************Main Menu*********************");
            System.out.println("0-Exit");
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
        }while (input != 0);
    }

}
