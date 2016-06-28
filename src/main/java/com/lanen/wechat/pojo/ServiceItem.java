package com.lanen.wechat.pojo;

import java.sql.Timestamp;

/**
 * 
 * @Description 服务项目
 * @ClassName ServiceItem.java
 * @author Administrator
 * @date 2016年6月15日下午3:36:44
 */
public class ServiceItem {

	private Integer id;
	
	private String serviceName;
		
	private String serviceContent;
			
	private Timestamp createTime;
	
	private String servicePic;
	
	private int createUser;
	
	private int isShow;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceContent() {
		return serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getServicePic() {
		return servicePic;
	}

	public void setServicePic(String servicePic) {
		this.servicePic = servicePic;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	public int getIsShow() {
		return isShow;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}


	
	
}
