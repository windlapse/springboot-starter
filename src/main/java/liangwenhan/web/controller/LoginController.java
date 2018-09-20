package liangwenhan.web.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import liangwenhan.web.constant.Constant;
import liangwenhan.web.service.UserService;
import liangwenhan.web.util.AppUtil;
import liangwenhan.web.util.ResultDTO;


/**
 * 资金明细对账
 * 
 * @author Administrator
 *
 */
@RestController
public class LoginController {

	private final static Logger log = LoggerFactory.getLogger("Admin");
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public ResultDTO login(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		return userService.login(account, password);
	}
	
	@RequestMapping("/logout")
	public ResultDTO logout(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		return userService.logout(request.getHeader(Constant.TOKEN_HEADER_KEY));
	}
	
	@RequestMapping("/queryUserInfo")
	public ResultDTO queryUserInfo(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		return userService.queryUserInfo(AppUtil.getUserByRequest(request));
	}
}
