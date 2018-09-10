package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.po.Scienceapply;

public interface ScienceapplyMapper {
    int deleteByPrimaryKey(Integer said);

    int insert(Scienceapply record);

    int insertSelective(Scienceapply record);

    Scienceapply selectByPrimaryKey(Integer said);

    //立项审批操作 (修改两个状态)
    int updateByPrimaryKeySelective(Scienceapply record);

    int updateByPrimaryKey(Scienceapply record);
    
    //查找立项未申请的 项目
    @Select("select * from scienceapply where states <= 3 and pid = #{pid}" )
    List<Scienceapply> findAllApply(Integer pid);
    
    //查找已通过立项审批的项目
    @Select("select * from scienceapply where states == 3 and pid = #{pid}" )
    List<Scienceapply> findAllsuccess(Integer pid);
}