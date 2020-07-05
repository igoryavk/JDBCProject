package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DAOClass {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource)
    {
        this.dataSource=dataSource;
        this.jdbcTemplate=new JdbcTemplate();
    }

}
