package com.yc.dao;

import com.yc.po.Achievement;

public interface AchievementMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Achievement record);

    int insertSelective(Achievement record);

    Achievement selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Achievement record);

    int updateByPrimaryKey(Achievement record);
}