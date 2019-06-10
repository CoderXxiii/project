package com.osyunge.service;

import com.osyunge.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {
    public List<EasyUITreeNode> getItemCatList(long parentid);
}
