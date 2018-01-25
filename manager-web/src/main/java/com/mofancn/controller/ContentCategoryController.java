package com.mofancn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.pojo.TreeNode;
import com.mofancn.common.utils.MofancnResult;
import com.mofancn.service.ContentCategoryService;

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;

	@RequestMapping("/list")
	@ResponseBody
	public List<TreeNode> getContentCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		List<TreeNode> list = contentCategoryService.getCategoryList(parentId);
		return list;
	}

	@RequestMapping("/create")
	@ResponseBody
	public MofancnResult insertContentcategory(long parentId, String name) {
		MofancnResult insertCategory = contentCategoryService.insertCategory(parentId, name);
		return insertCategory;
	}

	@RequestMapping("/delete")
	@ResponseBody
	public MofancnResult delContentcategory(Long parentId, Long id) {
		MofancnResult delCategory = contentCategoryService.delCategory(parentId, id);
		return delCategory;
	}

	@RequestMapping("/update")
	@ResponseBody
	public MofancnResult updateCategory(long id,String name) {
		MofancnResult updateCategory = contentCategoryService.updateCategory(id, name);
		return updateCategory;
	}
	
		
	
}
