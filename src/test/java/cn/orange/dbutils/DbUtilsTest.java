package cn.orange.dbutils;

import cn.hutool.db.DbUtil;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author kz
 * @date 2019/11/27
 */
public class DbUtilsTest {

    @Test
    public void testTheConnectionPool() throws SQLException {
        DataSource ds = DbUtil.getDs();
        assert ds != null;
        assert ds.getConnection() != null;


    }

}
