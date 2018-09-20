package liangwenhan.web.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import liangwenhan.web.dao.AbilityMapper;
import liangwenhan.web.service.AbilityService;
import liangwenhan.web.util.AppUtil;
import liangwenhan.web.util.CommonUtil;
import liangwenhan.web.util.ResultDTO;


/**
 * 资金明细对账
 * 
 * @author Administrator
 *
 */
@RestController
public class AbilityController {

	private final static Logger log = LoggerFactory.getLogger("Admin");
	
	@Autowired
	AbilityService abilityService;
	
	@RequestMapping("/queryAbilityList")
	public ResultDTO queryAbilityList(HttpServletRequest request, HttpServletResponse response) throws ParseException, IOException {
		return abilityService.selectAbilityListByUserId(AppUtil.getUserByRequest(request), 
				CommonUtil.parseInteger(request.getParameter("beginPage")),
				CommonUtil.parseInteger(request.getParameter("pageSize")));
	}
}
