package com.lanen.web.start;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @Description 项目启动初始化servlet
 * @ClassName InterfaceUrlIntiServlet.java
 * @author Administrator-zhur
 * @date 2016年5月28日下午5:58:14
 */
public class InterfaceUrlIntiServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		InterfaceUrlInti.init();
	}

}
