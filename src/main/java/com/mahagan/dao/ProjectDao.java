package com.mahagan.dao;

import com.mahagan.domain.Insert;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ProjectDao
{
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ProjectDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    private final String SQL="INSERT INTO INSET VALUES(:id,:email,:username,:password)";

    public int setabhi(Insert insert)
    {
        MapSqlParameterSource mapSqlParameterSource=new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id",insert.getId());
        mapSqlParameterSource.addValue("email",insert.getEmail());
        mapSqlParameterSource.addValue("username",insert.getUsername());
        mapSqlParameterSource.addValue("password",insert.getPassword());

        int count= namedParameterJdbcTemplate.update(SQL,mapSqlParameterSource);
        return  count;

    }
}
