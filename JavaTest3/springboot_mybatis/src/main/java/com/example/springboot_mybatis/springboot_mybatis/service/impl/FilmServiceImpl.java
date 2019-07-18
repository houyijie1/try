package com.example.springboot_mybatis.springboot_mybatis.service.impl;

import com.example.springboot_mybatis.springboot_mybatis.domain.Film;
import com.example.springboot_mybatis.springboot_mybatis.mapper.FilmMapper;
import com.example.springboot_mybatis.springboot_mybatis.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public int add(Film film) {
        filmMapper.insert(film);
        int id=film.getFilm_id();
        return id;
    }
}
