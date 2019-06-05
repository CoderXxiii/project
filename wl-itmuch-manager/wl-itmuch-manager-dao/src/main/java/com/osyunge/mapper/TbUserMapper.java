package com.osyunge.mapper;

import com.osyunge.pojo.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {

    int insert(TbUser record);

    int insertSelective(TbUser record);
}