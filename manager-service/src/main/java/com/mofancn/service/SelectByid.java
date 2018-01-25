package com.mofancn.service;

import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.utils.MofancnResult;
import com.mofancn.pojo.TbItem;

public interface SelectByid {
	public TbItem SelecByidTest(long itemId); 
	public EUDataGridResult getid(int start,int rows);
	public MofancnResult CreatItem(TbItem tbItem,String desc,String itemparm) throws Exception;
}
