package mybasicandroidcodelib.nl.org.codelib.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */

public class LoginBean implements Serializable{

    /**
     * code : 1
     * msg : 登录成功
     * data : [{"username":"傻逼","deid":1}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public static class DataBean implements Serializable{
        /**
         * username : 傻逼
         * deid : 1
         */

        private String username;
        private int deid;

        public void setUsername(String username) {
            this.username = username;
        }

        public void setDeid(int deid) {
            this.deid = deid;
        }

        public String getUsername() {
            return username;
        }

        public int getDeid() {
            return deid;
        }
    }
}
