package com.hand.mapper;

import com.hand.bean.Film;
import com.hand.page.PageHelper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 陈伟 on 2016/12/29.
 * Film存储映射接口
 */
@Component
public interface FilmMapper {
    int addFilm(Film film) throws Exception;
    int delete(Integer id) throws Exception;
    /**
     * 获取总条数
     * @return
     */
    int getCount(Film film);

    /**
     * 分页后的数量
     * @param pageHelper
     * @return
     */
    List<Film> getFilmsByPage(PageHelper pageHelper);



}
