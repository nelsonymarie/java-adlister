package jdbc;

import java.sql.SQLException;
import java.util.List;

public interface Ads {
    List<Ad> all();
    Long insert(Ad ad) throws SQLException;
}
