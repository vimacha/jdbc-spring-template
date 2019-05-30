package com.stackroute.springJdbc.repository;

import com.stackroute.springJdbc.domain.Movie1;
import com.stackroute.springJdbc.mapper.Movie1RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class SpringJdbcRepository {
    private JdbcTemplate jdbcTemplate ;

    public SpringJdbcRepository(){}


//    @Autowired
//    public void SpringJdbcRepository(final DataSource dataSource) {
//        this.jdbcTemplate.setDataSource(dataSource);
//    }
    @Autowired
    public void  setDataSource(final DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Movie1> getAll() {
        return jdbcTemplate.query("SELECT * FROM Movie", new Movie1RowMapper());
    }

//    public int add(final String  id, final String firstName) {
//        return jdbcTemplate.update("INSERT INTO STUDENT VALUES (?, ?)", id, firstName);
//    }

    public int add(Movie1 movie) {
        return jdbcTemplate.update("INSERT INTO Movie VALUES (?, ?,?,?)", movie.getMovieId(), movie.getMovieName(),movie.getYear(),movie.getRatings());
    }

    public Movie1 get(final int id) {
        final String query = "SELECT * FROM Movie WHERE movieId = ?";
        return jdbcTemplate.queryForObject(query, new Object[] { id }, new Movie1RowMapper());
    }

    public int update(Movie1 entity) {
        return jdbcTemplate.update("UPDATE Movie SET Ratting=? WHERE movieId=?", entity.getMovieId(), entity.getMovieId());
    }


    public int delete(Movie1 entity) {
        return jdbcTemplate.update("DELETE FROM Movie WHERE movieId=?", entity.getMovieId());
    }

}
