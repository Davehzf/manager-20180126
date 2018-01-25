package com.mofancn.service;

import com.mofancn.common.utils.MofancnResult;
import com.mofancn.pojo.TbItemParam;

public interface itemParmService {
	
	public MofancnResult getItemParmByCid(Long cid)throws Exception;
	public MofancnResult insertParmBycid(TbItemParam tbItemParam);

}
