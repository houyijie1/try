package com.hand.conntroller;

import com.hand.model.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
//public static final int mm=1;
@RestController
public class Testcontroller {

    static int tt=1;
    @Autowired
    private FilmService filmService;
    @RequestMapping("/add")
    public int add(){
        Film film=new Film();
        film .setDescription("ttt");
        film.setLanguageId((byte) 123);
        film.setLastUpdate(new Date());
        film.setLength(null);
        film.setOriginalLanguageId(null);
        film.setRating(null);
        film.setReleaseYear(null);
        film.setRentalDuration((byte) 24);
        film.setRentalRate("1");
        film.setTitle("old title");
        film.setReplacementCost(BigDecimal.valueOf(8));
        film.setSpecialFeatures(null);
       int id=filmService.add(film);
       tt=film.getFilmId();

        return  tt;
    }
    @GetMapping("/select")
    public List<Film> select(Film film){
        List<Film> list=filmService.select(film);
        return list;
    }
    @PutMapping("/update")
    public int update(){
        Film film=new Film();
        film.setFilmId((short)tt);
        film.setTitle("new title");
        int id=filmService.update(film);
        return tt;
    }
    @RequestMapping("/delete")
    public  int delete(){
        Film film=new Film();
        film.setFilmId((short)tt);
        int id = filmService.delete(film);
        return tt;
    }
}
