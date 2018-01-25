package com.mofancn.service;

import java.util.List;

import javax.imageio.event.IIOReadWarningListener;

import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.pojo.TreeNode;
import com.mofancn.common.utils.MofancnResult;

public interface ContentCategoryService {

	public List<TreeNode> getCategoryList(Long parentId);

	public MofancnResult insertCategory(Long parentId, String name);

	public MofancnResult delCategory(Long parentId, Long id);

	public MofancnResult updateCategory(Long id, String name);
	
	public EUDataGridResult showcategory(long categoryId,int page,int rows);
}
