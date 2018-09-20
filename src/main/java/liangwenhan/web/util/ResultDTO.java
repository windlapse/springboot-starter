package liangwenhan.web.util;

import java.io.Serializable;

import liangwenhan.web.constant.ResultCode;

public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String status;
	private String msg;
	private Object data;

	public ResultDTO setSuccess(Object retData) {
		status = ResultCode.SUCCESS.getCode();
		msg = ResultCode.SUCCESS.getDesc();
		data = retData;
		return this;
	}

	public ResultDTO setFail() {
		status = ResultCode.FAIL.getCode();
		msg = ResultCode.FAIL.getDesc();
		return this;
	}

	public ResultDTO setParameterInvalid() {
		status = ResultCode.PARAMETER_ERROR.getCode();
		msg = ResultCode.PARAMETER_ERROR.getDesc();
		return this;
	}
	
	public ResultDTO setParameterInvalid(String message) {
		status = ResultCode.PARAMETER_ERROR.getCode();
		msg = message;
		return this;
	}


	public ResultDTO setSystemError() {
		status = ResultCode.SYSTEM_ERROR.getCode();
		msg = ResultCode.SYSTEM_ERROR.getDesc();
		return this;
	}

	public ResultDTO setNotLogin() {
		status = ResultCode.NOT_LOGIN.getCode();
		msg = ResultCode.NOT_LOGIN.getDesc();
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultDTO [status=" + status + ", msg=" + msg + ", data=" + data.toString() + "]";
	}
}
