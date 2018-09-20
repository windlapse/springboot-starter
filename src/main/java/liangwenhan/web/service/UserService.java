package liangwenhan.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import liangwenhan.web.dao.UserMapper;
import liangwenhan.web.entity.User;
import liangwenhan.web.util.CacheUtil;
import liangwenhan.web.util.CommonUtil;
import liangwenhan.web.util.MD5Util;
import liangwenhan.web.util.ResultDTO;

@Component
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public ResultDTO login(String account, String password) {
		if (CommonUtil.isEmpty(password) || CommonUtil.isEmpty(password)) {
			return new ResultDTO().setFail();
		}
		User user = userMapper.selectByAccount(account);
		if (user == null) {
			return new ResultDTO().setFail();
		}
		if (MD5Util.getMD5Format(password).equals(user.getPassword())) {
			String token = CommonUtil.getUUid();
			CacheUtil.put(token, user);
			return new ResultDTO().setSuccess(token);
		}
		return new ResultDTO().setFail();
	}
	
	public ResultDTO logout(String token) {
		if (CommonUtil.isEmpty(token)) {
			return new ResultDTO().setFail();
		}
		CacheUtil.remove(token);
		return new ResultDTO().setSuccess(null);
	}
	
	public ResultDTO queryUserInfo(User user) {
		return new ResultDTO().setSuccess(userMapper.selectByPrimaryKey(user.getId()));
	}
}
