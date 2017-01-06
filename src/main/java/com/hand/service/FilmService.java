package com.hand.service;

import com.hand.bean.Film;
import com.hand.mapper.FilmMapper;
import com.hand.page.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.DirectFieldBindingResult;
import org.springframework.validation.Errors;

import java.util.List;

/**
 * Created by 陈伟 on 2016/12/29.
 * Film存储实现类
 */
@Service
public class FilmService {
    @Autowired
    private FilmMapper filmMapper;

    public int addFilm(Film film) {
        try {
            if (film.getTitle() == null || film.getLanguageId() == null) {
                return 0;
            }
            return filmMapper.addFilm(film);
        } catch (Exception e) {
            return 0;
        }
    }

    public PageHelper<Film> getFilmsByPage(Film film, int pageSize, int nowPage) {
        PageHelper<Film> page = new PageHelper<Film>(nowPage, pageSize, filmMapper.getCount(film));
        page.setEntity(film);
        List<Film> filmsByPage = filmMapper.getFilmsByPage(page);
        page.setList(filmsByPage);
        return page;
    }


}








