import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Amar@1995");
            s=c.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
