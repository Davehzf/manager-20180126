package com.mofancn.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mofancn.common.utils.MofancnResult;
import com.mofancn.mapper.TbContentMapper;
import com.mofancn.pojo.TbContent;
import com.mofancn.service.ContentService;
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper TbContentMapper;
	@Override
	public MofancnResult insertContent(TbContent tbContent) {

		tbContent.setCreated(new Date());
		tbContent.setUpdated(new Date());
		TbContentMapper.insert(tbContent);
		return MofancnResult.ok();
	}

}
