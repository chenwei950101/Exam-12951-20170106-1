package com.hand.mapper;

import com.hand.bean.Language;

import java.util.List;

/**
 * Created by 陈伟 on 2016/12/29.
 * Film存储映射接口
 */
public interface LanguageMapper {
    List<Language> selectAllLanguage();
}
