package com.osyunge.service.impl;

import com.osyunge.EasyUITreeNode;
import com.osyunge.mapper.TbItemCatMapper;
import com.osyunge.pojo.TbItemCat;
import com.osyunge.pojo.TbItemCatExample;
import com.osyunge.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper itemCatMapper;
    @Override
    public List<EasyUITreeNode> getItemCatList(long parentid) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria=example.createCriteria();
        criteria.andParentIdEqualTo(parentid);
        List<TbItemCat> list=itemCatMapper.selectByExample(example);
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for(TbItemCat tbItemCat : list){
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            resultList.add(node);
        }
        return resultList;
    }
}
