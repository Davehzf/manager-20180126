package com.mofancn.service;

import java.util.List;

import com.mofancn.common.pojo.TreeNode;

public interface ItemCatService {
	public List<TreeNode> getItemCatList(long parentId);
}
