package io.deadmanworking.dao;

import io.deadmanworking.Unit;
import io.deadmanworking.exception.DaoException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

public class JdbcUnitDao implements  UnitDao {
    final private String SELECT_STATEMENT = "SELECT unit_id, " +
            "name, " +
            "movement, " +
            "toughness, " +
            "save, " +
            "wounds, " +
            "leadership, " +
            "objective_control, " +
            "invulnerable_save, " +
            "warlord " +
            "FROM unit ";
    private JdbcTemplate jdbcTemplate;
    public JdbcUnitDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Unit getUnitById(int id) {
        Unit unit = null;
        String sql = SELECT_STATEMENT + "WHERE unit_id =?;";

        try {
            SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, id);
            if (results.next()) {
                unit = mapRowToUnit(results);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to database", e);
        } catch (DataIntegrityViolationException e) {
            throw new DaoException("Data bad", e);
        }
        return unit;
    }

    private Unit mapRowToUnit(SqlRowSet results) {
        Unit unit = new Unit();

    }
}
