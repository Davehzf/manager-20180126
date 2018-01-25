package com.mofancn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mofancn.common.pojo.TreeNode;
import com.mofancn.mapper.TbItemCatMapper;
import com.mofancn.pojo.TbItemCat;
import com.mofancn.pojo.TbItemCatExample;
import com.mofancn.pojo.TbItemCatExample.Criteria;
import com.mofancn.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;

	@Override
	public List<TreeNode> getItemCatList(long parentId) {
		// 根据parentId查询分类列表
		TbItemCatExample example = new TbItemCatExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		// 分类列表转换成TreeNode的列表
		List<TreeNode> resultList = new ArrayList<>();
		for (TbItemCat tbItemCat : list) {
			// 创建一个TreeNode对象
			TreeNode node = new TreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"close":"open");
			resultList.add(node);
		}

		return resultList;

	}

}
