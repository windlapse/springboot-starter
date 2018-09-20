package liangwenhan.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import liangwenhan.web.dao.AbilityMapper;
import liangwenhan.web.entity.User;
import liangwenhan.web.util.AppUtil;
import liangwenhan.web.util.ResultDTO;

@Component
public class AbilityService {

	@Autowired
	AbilityMapper abilityMapper;

	public ResultDTO selectAbilityListByUserId(User user, Integer beginPage, Integer pageSize) {
		if (beginPage == null || beginPage < 1) {
			beginPage = 1;
		}
		if (pageSize == null || pageSize < 1) {
			pageSize = Integer.MAX_VALUE;
		}
		return new ResultDTO().setSuccess(AppUtil.getCommonPageQueryMap(beginPage, pageSize).put("userId", user.getId()));
	}
}
