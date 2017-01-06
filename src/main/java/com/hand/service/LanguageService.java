package com.hand.service;

import com.hand.bean.Language;
import com.hand.mapper.LanguageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈伟 on 2016/12/29.
 * Film存储实现类
 */
@Service
public class LanguageService {
    @Autowired
    private LanguageMapper languageMapper;

    public List<Language> queryAllLanguage() {
        List<Language> languageList = languageMapper.selectAllLanguage();
        return languageList;
    }


}








