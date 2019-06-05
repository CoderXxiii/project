package com.osyunge.mapper;

import com.osyunge.pojo.TbContentCategory;

public interface TbContentCategoryMapper {

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);
}