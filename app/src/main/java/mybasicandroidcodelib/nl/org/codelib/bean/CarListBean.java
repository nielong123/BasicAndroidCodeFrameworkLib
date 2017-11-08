package mybasicandroidcodelib.nl.org.codelib.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */

public class CarListBean implements Serializable {

    /**
     * code : 1
     * msg : 获取成功
     * data : [{"id":null,"key":0,"parentid":0,"text":null,"carstatus":null,"StuId":null,"children":null,"attributes":null},{"id":"Car_277","key":0,"parentid":0,"text":"湘KJ283学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_280","key":0,"parentid":0,"text":"湘KJ284学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_329","key":0,"parentid":0,"text":"湘KJ290学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_337","key":0,"parentid":0,"text":"湘KJ501学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_276","key":0,"parentid":0,"text":"湘KJ590学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_275","key":0,"parentid":0,"text":"湘KJ731学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_333","key":0,"parentid":0,"text":"湘KJ761学","carstatus":"停车","StuId":0,"children":null,"attributes":null},{"id":"Car_331","key":0,"parentid":0,"text":"湘KJ980学","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_1616","key":0,"parentid":0,"text":"湘KJJ27学S","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_330","key":0,"parentid":0,"text":"湘KJK26学","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_338","key":0,"parentid":0,"text":"湘KJL21学","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_336","key":0,"parentid":0,"text":"湘KJM97学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_1617","key":0,"parentid":0,"text":"湘KJN25学S","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_1615","key":0,"parentid":0,"text":"湘KJN76学S","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_335","key":0,"parentid":0,"text":"湘KJT60学","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_279","key":0,"parentid":0,"text":"湘KJT62学","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_334","key":0,"parentid":0,"text":"湘KJT67学","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_281","key":0,"parentid":0,"text":"湘KJT79学","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_1613","key":0,"parentid":0,"text":"湘KJT85学S","carstatus":"停车","StuId":0,"children":null,"attributes":null},{"id":"Car_1614","key":0,"parentid":0,"text":"湘KJU49学S","carstatus":"熄火","StuId":0,"children":null,"attributes":null},{"id":"Car_1786","key":0,"parentid":0,"text":"湘KJZ63学Q","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_1785","key":0,"parentid":0,"text":"湘KJZ73学Q","carstatus":"离线","StuId":0,"children":null,"attributes":null},{"id":"Car_1784","key":0,"parentid":0,"text":"湘KJZ86学Q","carstatus":"离线","StuId":0,"children":null,"attributes":null}]
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
         * id : null
         * key : 0
         * parentid : 0
         * text : null
         * carstatus : null
         * StuId : null
         * children : null
         * attributes : null
         */

        private String id;
        private int key;
        private int parentid;
        private String text;
        private String carstatus;
        private String StuId;
        private String children;
        private String attributes;

        public void setId(String id) {
            this.id = id;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setCarstatus(String carstatus) {
            this.carstatus = carstatus;
        }

        public void setStuId(String StuId) {
            this.StuId = StuId;
        }

        public void setChildren(String children) {
            this.children = children;
        }

        public void setAttributes(String attributes) {
            this.attributes = attributes;
        }

        public String getId() {
            return id;
        }

        public int getKey() {
            return key;
        }

        public int getParentid() {
            return parentid;
        }

        public String getText() {
            return text;
        }

        public String getCarstatus() {
            return carstatus;
        }

        public String getStuId() {
            return StuId;
        }

        public String getChildren() {
            return children;
        }

        public String getAttributes() {
            return attributes;
        }
    }
}
