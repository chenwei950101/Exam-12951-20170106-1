package com.hand.controller;

import com.hand.bean.Language;
import com.hand.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 陈伟 on 2017/1/4.
 */
@Controller
public class LanguageController {
    @Autowired
    private LanguageService languageService;
    @RequestMapping("/getLanguage")
    @ResponseBody
    public List<Language> getLanguage(){
        return languageService.queryAllLanguage();
    }
}
