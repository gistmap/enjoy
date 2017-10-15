package com.gistmap.comm;

/**
 * @Desc : 返回响应类
 * @User : gistmap
 * @Date : 2017/9/4  15:30
 */


public class ResponseData extends Response{

    private Object data;

    public ResponseData(Object data) {
        this.data = data;
    }
    
    public ResponseData(ExceptionMsg msg) {
    	  super(msg);
    }
    
    public ResponseData(String rspCode, String rspMsg) {
        super(rspCode, rspMsg);
    }

    public ResponseData(String rspCode, String rspMsg, Object data) {
        super(rspCode, rspMsg);
        this.data = data;
    }

    public ResponseData(ExceptionMsg msg, Object data) {
        super(msg);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "data=" + data +
                "} " + super.toString();
    }
}
