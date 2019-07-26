package com.hand.mapper;

import com.hand.model.Film;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface FilmMapper {
   @ResultMap("BaseResultMap")
   @Insert(" insert into film (title, release_year, \n" +
           "      language_id, original_language_id, rental_duration, \n" +
           "      rental_rate, length, replacement_cost, \n" +
           "      rating, special_features, last_update, \n" +
           "      description)\n" +
           "    values ( #{title,jdbcType=VARCHAR}, #{releaseYear,jdbcType=DATE}, \n" +
           "      #{languageId,jdbcType=TINYINT}, #{originalLanguageId,jdbcType=TINYINT}, #{rentalDuration,jdbcType=TINYINT}, \n" +
           "      #{rentalRate,jdbcType=DECIMAL}, #{length,jdbcType=SMALLINT}, #{replacementCost,jdbcType=DECIMAL}, \n" +
           "      #{rating,jdbcType=CHAR}, #{specialFeatures,jdbcType=CHAR}, #{lastUpdate,jdbcType=TIMESTAMP}, \n" +
           "      #{description,jdbcType=LONGVARCHAR})")
   @Options(useGeneratedKeys = true, keyProperty = "filmId", keyColumn = "film_id")
   int add(Film film);

   @ResultMap("BaseResultMap")
   @Select("select * from film")
   List<Film> select(Film film);

   @ResultMap("BaseResultMap")
   @Update("UPDATE film set title=#{title} where film_id=#{film_id}")
   int  update(Film film);

   @ResultMap("BaseResultMap")
   @Delete("DELETE FROM film where id=#{id}")
   int delete(Film film);


}