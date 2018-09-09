package org.ys.web.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.SqlDateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.ys.common.util.RequsetUtils;
import org.ys.manager.model.User;
import org.ys.manager.service.UserService;

@Controller
@RequestMapping("/UserController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/addUserPage")
	public ModelAndView addUserPage(){
		System.out.println("---------");
		return new ModelAndView("/user/add_user");
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(HttpServletRequest request){
		String msg = null;
		try {
			Map<String,Object> paramMap = RequsetUtils.getParamsMap(request);
			User user = new User();
			BeanUtilsBean.getInstance().getConvertUtils().register(new SqlDateConverter(null), Date.class);
			BeanUtils.populate(user, paramMap);
			userService.save(user);
			msg = "增加成功！";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "增加失败！";
		}
		return msg;
	}
}
