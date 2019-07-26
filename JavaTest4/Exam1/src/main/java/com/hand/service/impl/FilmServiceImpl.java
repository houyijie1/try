package com.hand.service.impl;

import com.hand.mapper.FilmMapper;
import com.hand.model.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<Film> select(Film film) {
        List<Film> list=filmMapper.select(film);
        return list;
    }

    @Override
    public int add(Film film) {
        int id=filmMapper.add(film);
        return id;
    }

    @Override
    public int update(Film film) {
        int id = filmMapper.update(film);
        return id;
    }

    @Override
    public int delete(Film film) {
        int id=filmMapper.delete(film);
        return id;
    }
}
