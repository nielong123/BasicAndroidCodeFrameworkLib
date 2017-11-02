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
     * data : [{"carno":"鄂C1111学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂A1111学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂D0001学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂W1212学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"粤T1333学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂G9218学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂AX519学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;S104,距离中国电信新天营业厅约49米","coachname":null,"stuname":null,"gpstime":"/Date(1508993575000)/","longitudenew":"114.128126","latitudenew":"30.552032"},{"carno":"鄂AN781学","carsstate":"行驶","location":"湖北省;武汉市;蔡甸区;汉阳大街,距离独山加油站约240米","coachname":null,"stuname":null,"gpstime":"/Date(1509420229000)/","longitudenew":"114.062803","latitudenew":"30.560556"},{"carno":"鄂AV851学","carsstate":"离线","location":"湖北省;武汉市;汉阳区;汉阳大道,距离江隆超市约91米","coachname":null,"stuname":null,"gpstime":"/Date(1509358980000)/","longitudenew":"114.191836","latitudenew":"30.563631"},{"carno":"鄂AZ013学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;博奇路,距离上钟家台约276米","coachname":null,"stuname":null,"gpstime":"/Date(1508200612000)/","longitudenew":"114.050712","latitudenew":"30.579671"},{"carno":"鄂AS198学","carsstate":"停车 ","location":"湖北省;武汉市;东西湖区;张柏路,距离武汉市径河工商所约77米","coachname":null,"stuname":null,"gpstime":"/Date(1509420191000)/","longitudenew":"114.163213","latitudenew":"30.67889"},{"carno":"鄂AJ319学","carsstate":"停车 ","location":"湖北省;武汉市;江夏区;高新四路,距离冯张约590米","coachname":null,"stuname":null,"gpstime":"/Date(1509420199000)/","longitudenew":"114.430785","latitudenew":"30.442495"},{"carno":"鄂AR313学","carsstate":"离线","location":"湖北省;武汉市;江夏区;理工园路,距离湖北大学生汽车驾驶员培训学校约44米","coachname":null,"stuname":null,"gpstime":"/Date(1508902529000)/","longitudenew":"114.392722","latitudenew":"30.435988"},{"carno":"鄂AQ216学","carsstate":"离线","location":"湖北省;武汉市;江夏区;高新四路,距离冯张约584米","coachname":null,"stuname":null,"gpstime":"/Date(1508471032000)/","longitudenew":"114.431139","latitudenew":"30.442612"},{"carno":"鄂AW614学","carsstate":"离线","location":"湖北省;武汉市;洪山区;南湖大道,距离武汉市宏隆印务有限公司约102米","coachname":null,"stuname":null,"gpstime":"/Date(1509335686000)/","longitudenew":"114.329616","latitudenew":"30.479198"},{"carno":"鄂AQ591学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;蔡张,距离利成驾校综合培训基地约137米","coachname":null,"stuname":null,"gpstime":"/Date(1509339660000)/","longitudenew":"114.009715","latitudenew":"30.59041"},{"carno":"鄂AT168学","carsstate":"离线","location":"湖北省;武汉市;硚口区;工农路,距离湖北汉正西物流中心约68米","coachname":null,"stuname":null,"gpstime":"/Date(1509332271000)/","longitudenew":"114.166256","latitudenew":"30.612963"},{"carno":"鄂AW116学","carsstate":"熄火","location":"湖北省;武汉市;东西湖区;金山大道,距离金珠港湾北门约205米","coachname":null,"stuname":null,"gpstime":"/Date(1509420176000)/","longitudenew":"114.188835","latitudenew":"30.633496"},{"carno":"鄂AY719学","carsstate":"停车 ","location":"湖北省;武汉市;江夏区;高新四路,距离上海赛维干洗连锁流芳店约174米","coachname":null,"stuname":null,"gpstime":"/Date(1509420211000)/","longitudenew":"114.451579","latitudenew":"30.454732"},{"carno":"鄂AL103学","carsstate":"停车 ","location":"湖北省;武汉市;洪山区;南湖路,距离武汉怡心缘老年公寓约61米","coachname":null,"stuname":null,"gpstime":"/Date(1509420210000)/","longitudenew":"114.312047","latitudenew":"30.496315"},{"carno":"鄂AX311学","carsstate":"离线","location":"湖北省;武汉市;江夏区;洋湖大道,距离武汉语言文化职业学院约68米","coachname":null,"stuname":null,"gpstime":"/Date(1509417427000)/","longitudenew":"114.403625","latitudenew":"30.373921"},{"carno":"鄂AZ171学","carsstate":"熄火","location":"湖北省;武汉市;江夏区;光谷大道,距离堰边王约278米","coachname":null,"stuname":null,"gpstime":"/Date(1509420226000)/","longitudenew":"114.446143","latitudenew":"30.42608"},{"carno":"鄂AY412学","carsstate":"离线","location":"湖北省;武汉市;江夏区;光谷大道,距离堰边王约314米","coachname":null,"stuname":null,"gpstime":"/Date(1509262194000)/","longitudenew":"114.446429","latitudenew":"30.425773"},{"carno":"鄂AW218学","carsstate":"行驶","location":"湖北省;武汉市;汉阳区;芳草二路,距离匡湾约205米","coachname":null,"stuname":null,"gpstime":"/Date(1509420195000)/","longitudenew":"114.192309","latitudenew":"30.513196"},{"carno":"鄂AT129学","carsstate":"离线","location":"湖北省;武汉市;汉阳区;芳草二路,距离匡湾约271米","coachname":null,"stuname":null,"gpstime":"/Date(1509417166000)/","longitudenew":"114.192936","latitudenew":"30.513357"},{"carno":"鄂AQ671学","carsstate":"离线","location":"湖北省;武汉市;江夏区;阳光大道,距离王家湾约134米","coachname":null,"stuname":null,"gpstime":"/Date(1508569252000)/","longitudenew":"114.345306","latitudenew":"30.371804"},{"carno":"鄂AR118学","carsstate":"行驶","location":"湖北省;武汉市;黄陂区;巨龙大道,距离雄鹰青少年社会实践教育基地约834米","coachname":null,"stuname":null,"gpstime":"/Date(1509420184000)/","longitudenew":"114.384792","latitudenew":"30.752855"},{"carno":"鄂AP199学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;枫树二路,距离森密汽车座椅工业(武汉)公司约63米","coachname":null,"stuname":null,"gpstime":"/Date(1509172183000)/","longitudenew":"114.130253","latitudenew":"30.457855"},{"carno":"鄂AR310学","carsstate":"离线","location":"湖北省;武汉市;洪山区;南湖路,距离武汉怡心缘老年公寓约98米","coachname":null,"stuname":null,"gpstime":"/Date(1509417315000)/","longitudenew":"114.312247","latitudenew":"30.497694"},{"carno":"鄂AM199学","carsstate":"离线","location":"湖北省;武汉市;新洲区;齐安大道,距离新洲电视台约42米","coachname":null,"stuname":null,"gpstime":"/Date(1509346612000)/","longitudenew":"114.804621","latitudenew":"30.828666"},{"carno":"鄂AR106学","carsstate":"离线","location":"湖北省;武汉市;新洲区;集锦街,距离上黄家凹约310米","coachname":null,"stuname":null,"gpstime":"/Date(1509260101000)/","longitudenew":"114.958385","latitudenew":"30.873965"},{"carno":"鄂AP168学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;创业路,距离民生银行沌口支行约53米","coachname":null,"stuname":null,"gpstime":"/Date(1509343564000)/","longitudenew":"114.161126","latitudenew":"30.489944"},{"carno":"鄂AZ110学","carsstate":"离线","location":"湖北省;武汉市;黄陂区;汉施公路,距离华发羽绒制品有限公司约45米","coachname":null,"stuname":null,"gpstime":"/Date(1509263998000)/","longitudenew":"114.409876","latitudenew":"30.696977"},{"carno":"鄂AR102学","carsstate":"离线","location":"湖北省;武汉市;汉南区;S103,距离纱荆立交桥约72米","coachname":null,"stuname":null,"gpstime":"/Date(1508831745000)/","longitudenew":"114.034767","latitudenew":"30.333229"},{"carno":"鄂AR610学","carsstate":"行驶","location":"湖北省;武汉市;江夏区;英华路,距离流芳陵园约145米","coachname":null,"stuname":null,"gpstime":"/Date(1509420180000)/","longitudenew":"114.454755","latitudenew":"30.480937"},{"carno":"鄂AM513学","carsstate":"离线","location":"湖北省;武汉市;青山区;青王路,距离武冶医院约95米","coachname":null,"stuname":null,"gpstime":"/Date(1509342071000)/","longitudenew":"114.439155","latitudenew":"30.609"},{"carno":"鄂AR175学","carsstate":"熄火","location":"湖北省;武汉市;蔡甸区;工农路,距离新城菜市场约121米","coachname":null,"stuname":null,"gpstime":"/Date(1509420196000)/","longitudenew":"114.041599","latitudenew":"30.584702"},{"carno":"鄂AZ881学","carsstate":"熄火","location":"湖北省;武汉市;蔡甸区;博奇路,距离武汉玖信汽车有限公司约26米","coachname":null,"stuname":null,"gpstime":"/Date(1509420216000)/","longitudenew":"114.049854","latitudenew":"30.577521"},{"carno":"鄂AS018学","carsstate":"行驶","location":"湖北省;武汉市;蔡甸区;汉阳大街,距离侨亚会所约311米","coachname":null,"stuname":null,"gpstime":"/Date(1509420200000)/","longitudenew":"114.115927","latitudenew":"30.547403"},{"carno":"鄂AL212学","carsstate":"离线","location":"湖北省;武汉市;硚口区;长丰大道,距离利荣菜场约88米","coachname":null,"stuname":null,"gpstime":"/Date(1509415896000)/","longitudenew":"114.212936","latitudenew":"30.610615"},{"carno":"鄂AT170学","carsstate":"行驶","location":"湖北省;武汉市;汉阳区;芳草二路,距离匡湾约255米","coachname":null,"stuname":null,"gpstime":"/Date(1509420174000)/","longitudenew":"114.192877","latitudenew":"30.513084"},{"carno":"鄂AP231学","carsstate":"停车 ","location":"湖北省;武汉市;蔡甸区;G318,距离武汉市永安国税所约64米","coachname":null,"stuname":null,"gpstime":"/Date(1509419968000)/","longitudenew":"113.938701","latitudenew":"30.458361"},{"carno":"鄂AK891学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;工农路,距离新城菜市场约100米","coachname":null,"stuname":null,"gpstime":"/Date(1508474695000)/","longitudenew":"114.041954","latitudenew":"30.584467"},{"carno":"鄂AL193学","carsstate":"离线","location":"湖北省;武汉市;青山区;青王路,距离武钢炉窑协力厂约108米","coachname":null,"stuname":null,"gpstime":"/Date(1508558800000)/","longitudenew":"114.439243","latitudenew":"30.60932"},{"carno":"鄂AF310学","carsstate":"熄火","location":"湖北省;武汉市;江夏区;武昌大道,距离大桥村约737米","coachname":null,"stuname":null,"gpstime":"/Date(1509420202000)/","longitudenew":"114.300925","latitudenew":"30.369153"},{"carno":"鄂AL818学","carsstate":"熄火","location":"湖北省;武汉市;洪山区;三环线,距离白沙洲大道出口约172米","coachname":null,"stuname":null,"gpstime":"/Date(1509420234000)/","longitudenew":"114.272382","latitudenew":"30.466486"},{"carno":"鄂AV189学","carsstate":"离线","location":"湖北省;武汉市;洪山区;三环线,距离白沙洲农副产品(大市场)约225米","coachname":null,"stuname":null,"gpstime":"/Date(1508205557000)/","longitudenew":"114.271271","latitudenew":"30.466509"},{"carno":"鄂AL715学","carsstate":"行驶","location":"湖北省;武汉市;洪山区;三环线,距离白沙洲大道出口约197米","coachname":null,"stuname":null,"gpstime":"/Date(1509420172000)/","longitudenew":"114.272038","latitudenew":"30.466476"},{"carno":"鄂AL751学","carsstate":"行驶","location":"湖北省;武汉市;洪山区;三环线,距离白沙洲大道出口约183米","coachname":null,"stuname":null,"gpstime":"/Date(1509420218000)/","longitudenew":"114.272088","latitudenew":"30.466609"},{"carno":"鄂AZ168学","carsstate":"离线","location":"湖北省;武汉市;洪山区;三环线,距离白沙洲大道出口约193米","coachname":null,"stuname":null,"gpstime":"/Date(1509004784000)/","longitudenew":"114.272236","latitudenew":"30.466344"},{"carno":"鄂AX138学","carsstate":"熄火","location":"湖北省;武汉市;新洲区;古州路,距离吴氏汤王大酒店约46米","coachname":null,"stuname":null,"gpstime":"/Date(1509419013000)/","longitudenew":"114.804786","latitudenew":"30.833317"},{"carno":"鄂AM719学","carsstate":"停车 ","location":"湖北省;武汉市;黄陂区;S310,距离五里农庄约201米","coachname":null,"stuname":null,"gpstime":"/Date(1509420240000)/","longitudenew":"114.351044","latitudenew":"30.890083"},{"carno":"鄂AK961学","carsstate":"离线","location":"湖北省;武汉市;黄陂区;双凤大道,距离木兰宫糖果烟酒副食约38米","coachname":null,"stuname":null,"gpstime":"/Date(1509418331000)/","longitudenew":"114.372921","latitudenew":"30.875896"},{"carno":"鄂AW819学","carsstate":"熄火","location":"湖北省;武汉市;江夏区;光谷大道,距离隆客莱平价超市约340米","coachname":null,"stuname":null,"gpstime":"/Date(1509420245000)/","longitudenew":"114.423656","latitudenew":"30.460069"},{"carno":"鄂AS431学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;X030,距离汉南农场机关幼儿园约42米","coachname":null,"stuname":null,"gpstime":"/Date(1508978707000)/","longitudenew":"113.851934","latitudenew":"30.262146"},{"carno":"鄂AW172学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;枫树南路,距离武汉中轻机械有限公司约588米","coachname":null,"stuname":null,"gpstime":"/Date(1508902689000)/","longitudenew":"114.13076","latitudenew":"30.449338"},{"carno":"鄂AU128学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;枫树二路,距离武汉中轻机械有限公司约210米","coachname":null,"stuname":null,"gpstime":"/Date(1509250334000)/","longitudenew":"114.131213","latitudenew":"30.456952"},{"carno":"鄂AV512学","carsstate":"离线","location":"湖北省;武汉市;蔡甸区;枫树二路,距离新发源地沌口店约59米","coachname":null,"stuname":null,"gpstime":"/Date(1509332388000)/","longitudenew":"114.127903","latitudenew":"30.464519"},{"carno":"鄂AN110学","carsstate":"离线","location":"湖北省;武汉市;江夏区;X004,距离杨店村荷景湾休闲农庄约338米","coachname":null,"stuname":null,"gpstime":"/Date(1509348780000)/","longitudenew":"114.499223","latitudenew":"30.416164"},{"carno":"鄂AT081学","carsstate":"离线","location":"湖北省;武汉市;汉南区;建国路,距离加油站约624米","coachname":null,"stuname":null,"gpstime":"/Date(1509361334000)/","longitudenew":"114.064835","latitudenew":"30.306379"},{"carno":"鄂A0192学","carsstate":"离线","location":"北京市;北京市;海淀区;知春路,距离银网中心约10米","coachname":null,"stuname":null,"gpstime":"/Date(1500343486000)/","longitudenew":"116.320143","latitudenew":"39.976289"},{"carno":"京A0031学","carsstate":"离线","location":";,距离约0米","coachname":null,"stuname":null,"gpstime":"/Date(1506831188000)/","longitudenew":"3.9E-05","latitudenew":"0.000116"},{"carno":"鄂A0010学","carsstate":"离线","location":"北京市;北京市;门头沟区;X004,距离潭墅苑约134米","coachname":null,"stuname":null,"gpstime":"/Date(1481208780000)/","longitudenew":"116.029679","latitudenew":"39.880952"},{"carno":"鄂B00012学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂B00011学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"鄂B0010学","carsstate":"离线","location":"北京市;北京市;海淀区;知春路,距离和盛大厦停车场约9米","coachname":null,"stuname":null,"gpstime":"/Date(1501151966000)/","longitudenew":"116.320041","latitudenew":"39.975046"},{"carno":"鄂AU134学","carsstate":"离线","location":"湖北省;武汉市;黄陂区;前横,距离香店约567米","coachname":null,"stuname":null,"gpstime":"/Date(1506670536000)/","longitudenew":"114.312361","latitudenew":"30.830147"},{"carno":"鄂J81N11学","carsstate":"离线","location":"湖北省;武汉市;江夏区;武大园一路,距离武汉大学科技园停车场约77米","coachname":null,"stuname":null,"gpstime":"/Date(1502095160000)/","longitudenew":"114.411277","latitudenew":"30.456946"},{"carno":"鄂A1923学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null},{"carno":"津A0120学","carsstate":"未定位","location":null,"coachname":null,"stuname":null,"gpstime":null,"longitudenew":null,"latitudenew":null}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {

        @Override
        public String toString() {
            return "DataBean{" +
                    "carno='" + carno + '\'' +
                    ", carsstate='" + carsstate + '\'' +
                    ", location=" + location +
                    ", coachname=" + coachname +
                    ", stuname=" + stuname +
                    ", gpstime=" + gpstime +
                    ", longitudenew=" + longitudenew +
                    ", latitudenew=" + latitudenew +
                    '}';
        }

        /**
         * carno : 鄂C1111学
         * carsstate : 未定位
         * location : null
         * coachname : null
         * stuname : null
         * gpstime : null
         * longitudenew : null
         * latitudenew : null
         */

        private String carno;
        private String carsstate;
        private String location;
        private String coachname;
        private String stuname;
        private String gpstime;
        private String longitudenew;
        private String latitudenew;

        public String getCarno() {
            return carno;
        }

        public void setCarno(String carno) {
            this.carno = carno;
        }

        public String getCarsstate() {
            return carsstate;
        }

        public void setCarsstate(String carsstate) {
            this.carsstate = carsstate;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getCoachname() {
            return coachname;
        }

        public void setCoachname(String coachname) {
            this.coachname = coachname;
        }

        public String getStuname() {
            return stuname;
        }

        public void setStuname(String stuname) {
            this.stuname = stuname;
        }

        public String getGpstime() {
            return gpstime;
        }

        public void setGpstime(String gpstime) {
            this.gpstime = gpstime;
        }

        public String getLongitudenew() {
            return longitudenew;
        }

        public void setLongitudenew(String longitudenew) {
            this.longitudenew = longitudenew;
        }

        public String getLatitudenew() {
            return latitudenew;
        }

        public void setLatitudenew(String latitudenew) {
            this.latitudenew = latitudenew;
        }
    }

    @Override
    public String toString() {
        return "CarListBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
