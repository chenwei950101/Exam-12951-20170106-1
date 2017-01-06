package com.hand.controller;

import com.hand.bean.Film;
import com.hand.page.PageHelper;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 陈伟 on 2017/1/4.
 */
@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    @RequestMapping("/getFilms")
    @ResponseBody
    public PageHelper<Film> getFilms(String title,String languageId,int nowPage,int pageSize){
        Film film=new Film();
        if(languageId!=null&&!"".equals(languageId)){
            try{
                film.setLanguageId(Integer.parseInt(languageId));
            }
            catch (NumberFormatException e){
                return null;
            }
        }
        else{
            film.setLanguageId(null);
        }

        if(title!=null&&!"".equals(title)){
            film.setTitle(title);
        }
        else {
            film.setTitle(null);
        }
        return filmService.getFilmsByPage(film,pageSize,nowPage);
    }


    @RequestMapping(value = "/addFilms",method = RequestMethod.POST)
    @ResponseBody
    public Boolean getFilms(@RequestBody Film film){
        int sum = filmService.addFilm(film);
        if(sum>0){
            return true;
        }else {
            return false;
        }
    }
}
