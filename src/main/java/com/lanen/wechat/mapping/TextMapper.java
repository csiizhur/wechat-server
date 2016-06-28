package com.lanen.wechat.mapping;

import com.lanen.wechat.pojo.Text;

public interface TextMapper {

	/*
	 * 通过关键字获取回复文本信息
	 */
	Text queryByKeyword(String keyword);
}
