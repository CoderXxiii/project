package com.osyunge.mapper;

import com.osyunge.pojo.TbItem;

public interface TbItemMapper {
    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem getItemById(long id);
}