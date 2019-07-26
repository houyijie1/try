package com.hand.service;

import com.hand.model.Film;

import java.util.List;

public interface FilmService {
    public List<Film> select(Film film);
    public int add(Film film);
    public int update(Film film);
    public  int delete(Film film);
}
