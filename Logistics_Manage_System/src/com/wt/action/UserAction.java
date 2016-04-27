package com.wt.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.wt.entity.User;
import com.wt.service.UserService;

public class UserAction extends ActionSupport implements RequestAware,
ModelDriven<User>, Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String list() {

		List<User> users = userService.getAll();
		
		// ����Ϊ����ʱʹ��
		for (User user : users) {
			
			System.out.println("User_name --- " + user.getUser_name());
			
		}
		
		return "list";
	}

	@Override
	public void prepare() throws Exception {}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

}