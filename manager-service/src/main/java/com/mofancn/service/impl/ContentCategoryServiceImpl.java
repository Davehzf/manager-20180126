package com.mofancn.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.pojo.TreeNode;
import com.mofancn.common.utils.MofancnResult;
import com.mofancn.mapper.TbContentCategoryMapper;
import com.mofancn.mapper.TbContentMapper;
import com.mofancn.pojo.TbContent;
import com.mofancn.pojo.TbContentCategory;
import com.mofancn.pojo.TbContentCategoryExample;
import com.mofancn.pojo.TbContentCategoryExample.Criteria;

import com.mofancn.pojo.TbContentExample;
import com.mofancn.service.ContentCategoryService;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;
	@Autowired
	private TbContentMapper TbContentMapper;
	@Override
	public List<TreeNode> getCategoryList(Long parentId) {
		//根据parentid查询节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		List<TreeNode> resultList = new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			//创建一个节点
			TreeNode node = new TreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			
			resultList.add(node);
		}
//		showContent(categoryId,page,rows);
		
		
		return resultList;
	}
	
		
		
		
	
	@Override
	public MofancnResult insertCategory(Long parentId, String name) {
		TbContentCategory tbContentCategory = new TbContentCategory();
		tbContentCategory.setParentId(parentId);
		tbContentCategory.setName(name);
		tbContentCategory.setIsParent(false);
		tbContentCategory.setStatus(1);
		tbContentCategory.setSortOrder(1);
		tbContentCategory.setCreated(new Date());
		tbContentCategory.setUpdated(new Date());
		contentCategoryMapper.insert(tbContentCategory);
		TbContentCategory tbparent = contentCategoryMapper.selectByPrimaryKey(parentId);
		if(!tbparent.getIsParent())
		{
			tbparent.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(tbparent);
		}
		return MofancnResult.ok(tbContentCategory);
	}
	@Override
	public MofancnResult delCategory(Long parentId, Long id) {
		TbContentCategory tbContentCategory = contentCategoryMapper.selectByPrimaryKey(id);
		contentCategoryMapper.deleteByPrimaryKey(id);
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(tbContentCategory.getParentId());
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		
		if(list.isEmpty())
		{
			TbContentCategory selectByPrimaryKey = contentCategoryMapper.selectByPrimaryKey(tbContentCategory.getParentId());
			selectByPrimaryKey.setIsParent(false);
			contentCategoryMapper.updateByPrimaryKey(selectByPrimaryKey);
		}
		return MofancnResult.ok();
	}
	@Override
	public MofancnResult updateCategory(Long id, String name) {
		TbContentCategory tbContentCategory = contentCategoryMapper.selectByPrimaryKey(id);
		tbContentCategory.setName(name);
		contentCategoryMapper.updateByPrimaryKey(tbContentCategory);
		return MofancnResult.ok(tbContentCategory);
	}
	@Override
	public EUDataGridResult showcategory(long categoryId, int page, int rows) {

			TbContentExample example = new TbContentExample();
			com.mofancn.pojo.TbContentExample.Criteria createCriteria = example.createCriteria();
			createCriteria.andCategoryIdEqualTo(categoryId);
			PageHelper.startPage(page,rows);
			List<TbContent> list = TbContentMapper.selectByExample(example);
			EUDataGridResult results = new EUDataGridResult();
			results.setRows(list);
			
		return results;
	}

}

