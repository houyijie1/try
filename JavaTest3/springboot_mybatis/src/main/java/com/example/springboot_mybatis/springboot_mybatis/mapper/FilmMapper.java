package com.example.springboot_mybatis.springboot_mybatis.mapper;

import com.example.springboot_mybatis.springboot_mybatis.domain.Film;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface FilmMapper {
    @Insert("INSERT INTO film1(title,description,release_year,language_id,original_language_id,rental_duration,rental_rate,length," +
            "replacement_cost,rating,special_features,last_update) VALUES( #{title},#{description},#{release_year},#{language_id}," +
            "#{original_language_id},#{original_language_id},#{rental_duration},#{rental_rate},#{length},#{replacement_cost},#{rating},#{special_features},#{last_update})")
   @Options(useGeneratedKeys = true,keyProperty = "film_id",keyColumn = "film_id")
    int insert(Film film);
}


