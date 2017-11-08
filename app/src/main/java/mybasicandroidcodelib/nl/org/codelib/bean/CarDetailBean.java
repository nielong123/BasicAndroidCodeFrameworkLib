package mybasicandroidcodelib.nl.org.codelib.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/11/8.
 */

public class CarDetailBean implements Serializable {


    /**
     * code : 1
     * msg : 获取成功
     * data : [{"carno":"湘KJ283学","carsstate":"离线","location":"湖南省,娄底市,涟源市,芙蓉北路,距离娄底市涟源交通学校约36米","coachname":null,"stuname":null,"gpstime":"2017-07-27 17:39:45","longitudenew":"111.652569","latitudenew":"27.693561"}]
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

    public static class DataBean implements Serializable {
        /**
         * carno : 湘KJ283学
         * carsstate : 离线
         * location : 湖南省,娄底市,涟源市,芙蓉北路,距离娄底市涟源交通学校约36米
         * coachname : null
         * stuname : null
         * gpstime : 2017-07-27 17:39:45
         * longitudenew : 111.652569
         * latitudenew : 27.693561
         */

        private String carno;
        private String carsstate;
        private String location;
        private String coachname;
        private String stuname;
        private String gpstime;
        private String longitudenew;
        private String latitudenew;

        public void setCarno(String carno) {
            this.carno = carno;
        }

        public void setCarsstate(String carsstate) {
            this.carsstate = carsstate;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setCoachname(String coachname) {
            this.coachname = coachname;
        }

        public void setStuname(String stuname) {
            this.stuname = stuname;
        }

        public void setGpstime(String gpstime) {
            this.gpstime = gpstime;
        }

        public void setLongitudenew(String longitudenew) {
            this.longitudenew = longitudenew;
        }

        public void setLatitudenew(String latitudenew) {
            this.latitudenew = latitudenew;
        }

        public String getCarno() {
            return carno;
        }

        public String getCarsstate() {
            return carsstate;
        }

        public String getLocation() {
            return location;
        }

        public String getCoachname() {
            return coachname;
        }

        public String getStuname() {
            return stuname;
        }

        public String getGpstime() {
            return gpstime;
        }

        public String getLongitudenew() {
            return longitudenew;
        }

        public String getLatitudenew() {
            return latitudenew;
        }
    }
}
