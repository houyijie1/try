package com.example.springboot_mybatis.springboot_mybatis.controller;

import com.example.springboot_mybatis.springboot_mybatis.domain.Film;
import com.example.springboot_mybatis.springboot_mybatis.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;


@RestController
@RequestMapping("/api/user")
public class MVCController {
   @Autowired
    private FilmService filmService;
    @GetMapping("add1")
    public  int add1(){
        Film film=new Film();
      //  film.setFilm_id(10000);
        film.setTitle("aaa");
        film.setDescription("DDD");
        film.setRelease_year("SDSAD");
        film.setLanguage_id(12);
        film.setOriginal_language_id(23);
        film.setRental_duration(23);
        film.setRental_rate("SADA");
        film.setLength(123);
        film.setReplacement_cost("UUJ");
        film.setRating("adaf");
        film.setSpecial_features("ADASD");
        film.setLast_update(new Date());
        int id = filmService.add(film);

        System.out.println(id);
        return  id;
    }
}
