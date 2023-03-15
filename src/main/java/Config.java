public class Config {
    public String getUrl() {
        return "jdbc:mysql://studentdb.fulgetcorp.com/ymir_misael?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUsername() {
        return "ymir_misael";
    }

    public String getPassword() {
        return "eBgPszkQCOMJ03r";
    }

    public String getUser() {
        return null;
    }
}

//import java.sql.Connection;
//        import java.sql.DriverManager;
//        import java.sql.SQLException;
//
//public class DatabaseConnector {
//    public static Connection getConnection() throws SQLException {
//        String url = "jdbc:mysql://studentdb.fulgetcorp.com/ymir_misael?allowPublicKeyRetrieval=true&useSSL=false";
//        String username = "ymir_misael";
//        String password = "eBgPszkQCOMJ03r";
//
//        Connection conn = DriverManager.getConnection(url, username, password);
//        return conn;
//    }
//}

