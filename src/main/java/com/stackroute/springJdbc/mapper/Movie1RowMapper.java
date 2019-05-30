package com.stackroute.springJdbc.mapper;

import com.stackroute.springJdbc.domain.Movie1;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Movie1RowMapper implements RowMapper<Movie1> {

    @Override
    public Movie1 mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Movie1 Movie = new Movie1();
        Movie.setMovieId(rs.getInt(1));
        Movie.setMovieName(rs.getString(2));
        Movie.setYear(rs.getInt(3));
        Movie.setRatings(rs.getFloat(4));
        return Movie;
    }
}
