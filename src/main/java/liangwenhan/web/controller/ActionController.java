package liangwenhan.web.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import liangwenhan.web.dao.UserMapper;
import liangwenhan.web.entity.User;
import liangwenhan.web.util.ResultDTO;


/**
 * 资金明细对账
 * 
 * @author Administrator
 *
 */
@RestController
public class ActionController {

	private final static Logger log = LoggerFactory.getLogger("Admin");
	
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/queryActionList")
	public ResultDTO queryActionList(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		User user = userMapper.selectByPrimaryKey(1);
		ResultDTO result = new ResultDTO();
		result.setSuccess(user);
		return result;
	}
	
	@RequestMapping("/queryActionTransaction")
	public ResultDTO queryActionTransaction(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		User user = userMapper.selectByPrimaryKey(1);
		ResultDTO result = new ResultDTO();
		result.setSuccess(user);
		return result;
	}
	
	@RequestMapping("/beginAction")
	public ResultDTO beginAction(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		User user = userMapper.selectByPrimaryKey(1);
		ResultDTO result = new ResultDTO();
		result.setSuccess(user);
		return result;
	}
	
	@RequestMapping("/endAction")
	public ResultDTO endAction(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		User user = userMapper.selectByPrimaryKey(1);
		ResultDTO result = new ResultDTO();
		result.setSuccess(user);
		return result;
	}
}
