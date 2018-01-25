package com.mofancn.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mofancn.common.utils.JsonUtils;
import com.mofancn.mapper.TbItemParamItemMapper;

import com.mofancn.pojo.TbItemParamItem;
import com.mofancn.pojo.TbItemParamItemExample;
import com.mofancn.pojo.TbItemParamItemExample.Criteria;
import com.mofancn.service.showItemParamService;
@Service
public class showItemParmServiceImpl implements showItemParamService {

	@Autowired
	private TbItemParamItemMapper TbItemParamItemMapper;

	@Override
	public String showItemParm(long itemId) {
		TbItemParamItemExample example = new TbItemParamItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		List<TbItemParamItem> list = TbItemParamItemMapper.selectByExampleWithBLOBs(example);
		if (list == null || list.size() <= 0) {
			return "";

		}
		TbItemParamItem tbItemParamItem = list.get(0);
		String paramData = tbItemParamItem.getParamData();
		List<Map> jsonToList = JsonUtils.jsonToList(paramData, Map.class);
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"1\" class=\"Ptable\">\n");
		sBuffer.append("    <tbody>\n");
		for(Map m1:jsonToList) {
			sBuffer.append("        <tr>\n");
			sBuffer.append("            <th class=\"tdTitle\" colspan=\"2\">"+m1.get("group")+"</th>\n");
			sBuffer.append("        </tr>\n");
			List<Map> list2 = (List<Map>) m1.get("params");
			for(Map m2:list2) {
				sBuffer.append("        <tr>\n");
				sBuffer.append("            <td class=\"tdTitle\">"+m2.get("k")+"</td>\n");
				sBuffer.append("            <td>"+m2.get("v")+"</td>\n");
				sBuffer.append("        </tr>\n");
			}
		}
		sBuffer.append("    </tbody>\n");
		sBuffer.append("</table>");

		return sBuffer.toString();
	}

}
