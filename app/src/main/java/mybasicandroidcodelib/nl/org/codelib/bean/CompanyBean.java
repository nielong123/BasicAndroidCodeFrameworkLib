package mybasicandroidcodelib.nl.org.codelib.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/11/2.
 */

public class CompanyBean implements Serializable {

    /**
     * code : 1
     * msg : 获取成功
     * data : [{"id":"YY_1","key":1,"parentid":-1,"text":"娄底市驾驶员培训系统","carstatus":null,"StuId":null,"children":[{"id":"TM_2","key":2,"parentid":1,"text":"娄底运管","carstatus":null,"StuId":null,"children":[{"id":"TM_4","key":4,"parentid":2,"text":"娄星区","carstatus":null,"StuId":null,"children":[{"id":"DS_201","key":201,"parentid":4,"text":"畅安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_262","key":262,"parentid":201,"text":"畅安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_202","key":202,"parentid":4,"text":"湘安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_263","key":263,"parentid":202,"text":"湘安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_203","key":203,"parentid":4,"text":"佳程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_265","key":265,"parentid":203,"text":"佳程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_204","key":204,"parentid":4,"text":"鑫鹏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_266","key":266,"parentid":204,"text":"鑫鹏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_205","key":205,"parentid":4,"text":"阳光驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_268","key":268,"parentid":205,"text":"阳光驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_208","key":208,"parentid":4,"text":"翔鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_275","key":275,"parentid":208,"text":"翔鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_213","key":213,"parentid":4,"text":"城中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_283","key":283,"parentid":213,"text":"城中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_214","key":214,"parentid":4,"text":"华通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_285","key":285,"parentid":214,"text":"华通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_215","key":215,"parentid":4,"text":"湘中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_287","key":287,"parentid":215,"text":"湘中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_216","key":216,"parentid":4,"text":"锦程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_290","key":290,"parentid":216,"text":"锦程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_217","key":217,"parentid":4,"text":"朝阳驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_292","key":292,"parentid":217,"text":"朝阳驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":32}}],"attributes":{"cars":32}},{"id":"DS_218","key":218,"parentid":4,"text":"科技驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_294","key":294,"parentid":218,"text":"科技驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_219","key":219,"parentid":4,"text":"潇湘驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_296","key":296,"parentid":219,"text":"潇湘驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_220","key":220,"parentid":4,"text":"诚信驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_298","key":298,"parentid":220,"text":"诚信驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_221","key":221,"parentid":4,"text":"湘运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_300","key":300,"parentid":221,"text":"湘运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_222","key":222,"parentid":4,"text":"钢城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_302","key":302,"parentid":222,"text":"钢城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_223","key":223,"parentid":4,"text":"兴旺驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_304","key":304,"parentid":223,"text":"兴旺驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_224","key":224,"parentid":4,"text":"人文驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_306","key":306,"parentid":224,"text":"人文驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_225","key":225,"parentid":4,"text":"顺达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_307","key":307,"parentid":225,"text":"顺达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":42}}],"attributes":{"cars":42}},{"id":"DS_251","key":251,"parentid":4,"text":"鼎鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_274","key":274,"parentid":251,"text":"鼎鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":29}}],"attributes":{"cars":29}},{"id":"DS_253","key":253,"parentid":4,"text":"非凡驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_271","key":271,"parentid":253,"text":"非凡驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_254","key":254,"parentid":4,"text":"银河驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_270","key":270,"parentid":254,"text":"银河驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_319","key":319,"parentid":4,"text":"顺通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_320","key":320,"parentid":319,"text":"顺通驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_328","key":328,"parentid":4,"text":"远大驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_330","key":330,"parentid":328,"text":"远大驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_329","key":329,"parentid":4,"text":"友谊驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_332","key":332,"parentid":329,"text":"友谊驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_355","key":355,"parentid":4,"text":"飞悦驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_356","key":356,"parentid":355,"text":"飞悦驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":6}}],"attributes":{"cars":6}}],"attributes":{"cars":726}},{"id":"TM_5","key":5,"parentid":2,"text":"双峰县","carstatus":null,"StuId":null,"children":[{"id":"DS_211","key":211,"parentid":5,"text":"中兴驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_282","key":282,"parentid":211,"text":"中兴驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":53}}],"attributes":{"cars":53}},{"id":"DS_230","key":230,"parentid":5,"text":"创业驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_316","key":316,"parentid":230,"text":"创业驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_231","key":231,"parentid":5,"text":"双龙驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_315","key":315,"parentid":231,"text":"双龙驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_232","key":232,"parentid":5,"text":"希望驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_313","key":313,"parentid":232,"text":"希望驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_233","key":233,"parentid":5,"text":"鸿运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_310","key":310,"parentid":233,"text":"鸿运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_234","key":234,"parentid":5,"text":"职中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_308","key":308,"parentid":234,"text":"职中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_235","key":235,"parentid":5,"text":"大众驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_305","key":305,"parentid":235,"text":"大众驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_249","key":249,"parentid":5,"text":"丰杏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_277","key":277,"parentid":249,"text":"丰杏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_250","key":250,"parentid":5,"text":"东方红驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_276","key":276,"parentid":250,"text":"东方红驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_252","key":252,"parentid":5,"text":"鑫达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_272","key":272,"parentid":252,"text":"鑫达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_333","key":333,"parentid":5,"text":"辉煌驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_334","key":334,"parentid":333,"text":"辉煌驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}}],"attributes":{"cars":346}},{"id":"TM_6","key":6,"parentid":2,"text":"新化县","carstatus":null,"StuId":null,"children":[{"id":"DS_210","key":210,"parentid":6,"text":"平安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_280","key":280,"parentid":210,"text":"平安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":58}}],"attributes":{"cars":58}},{"id":"DS_240","key":240,"parentid":6,"text":"新世纪驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_295","key":295,"parentid":240,"text":"新世纪驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_243","key":243,"parentid":6,"text":"环球驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_289","key":289,"parentid":243,"text":"环球驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_244","key":244,"parentid":6,"text":"新洋驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_288","key":288,"parentid":244,"text":"新洋驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_245","key":245,"parentid":6,"text":"奔驰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_286","key":286,"parentid":245,"text":"奔驰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_246","key":246,"parentid":6,"text":"航程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_284","key":284,"parentid":246,"text":"航程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":61}}],"attributes":{"cars":61}},{"id":"DS_247","key":247,"parentid":6,"text":"永通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_281","key":281,"parentid":247,"text":"永通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":75}}],"attributes":{"cars":75}},{"id":"DS_255","key":255,"parentid":6,"text":"熊峰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_264","key":264,"parentid":255,"text":"熊峰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_256","key":256,"parentid":6,"text":"康安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_267","key":267,"parentid":256,"text":"康安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":56}}],"attributes":{"cars":56}},{"id":"DS_258","key":258,"parentid":6,"text":"飞翔驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_261","key":261,"parentid":258,"text":"飞翔驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":30}}],"attributes":{"cars":30}},{"id":"DS_259","key":259,"parentid":6,"text":"凯旋驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_260","key":260,"parentid":259,"text":"凯旋驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":30}}],"attributes":{"cars":30}},{"id":"DS_321","key":321,"parentid":6,"text":"龙源驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_322","key":322,"parentid":321,"text":"龙源驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_344","key":344,"parentid":6,"text":"博众驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_345","key":345,"parentid":344,"text":"博众驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":33}}],"attributes":{"cars":33}},{"id":"DS_351","key":351,"parentid":6,"text":"吉星驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_352","key":352,"parentid":351,"text":"吉星驾校分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":17}}],"attributes":{"cars":17}},{"id":"DS_353","key":353,"parentid":6,"text":"鹏程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_354","key":354,"parentid":353,"text":"鹏程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":17}}],"attributes":{"cars":17}}],"attributes":{"cars":544}},{"id":"TM_7","key":7,"parentid":2,"text":"冷水江市","carstatus":null,"StuId":null,"children":[{"id":"DS_209","key":209,"parentid":7,"text":"锑都驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_278","key":278,"parentid":209,"text":"锑都驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_226","key":226,"parentid":7,"text":"兴学驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_309","key":309,"parentid":226,"text":"兴学驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}},{"id":"DS_227","key":227,"parentid":7,"text":"红日驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_311","key":311,"parentid":227,"text":"红日驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":38}}],"attributes":{"cars":38}},{"id":"DS_228","key":228,"parentid":7,"text":"经纬驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_312","key":312,"parentid":228,"text":"经纬驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_229","key":229,"parentid":7,"text":"安达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_314","key":314,"parentid":229,"text":"安达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_331","key":331,"parentid":7,"text":"金港城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_335","key":335,"parentid":331,"text":"金港城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}}],"attributes":{"cars":178}},{"id":"TM_8","key":8,"parentid":2,"text":"涟源市","carstatus":null,"StuId":null,"children":[{"id":"DS_206","key":206,"parentid":8,"text":"交通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_269","key":269,"parentid":206,"text":"交通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_207","key":207,"parentid":8,"text":"飞鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_273","key":273,"parentid":207,"text":"飞鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":64}}],"attributes":{"cars":64}},{"id":"DS_236","key":236,"parentid":8,"text":"铭鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_303","key":303,"parentid":236,"text":"铭鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}},{"id":"DS_237","key":237,"parentid":8,"text":"龙腾驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_301","key":301,"parentid":237,"text":"龙腾驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":28}}],"attributes":{"cars":28}},{"id":"DS_238","key":238,"parentid":8,"text":"蓝天驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_299","key":299,"parentid":238,"text":"蓝天驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_239","key":239,"parentid":8,"text":"鸿程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_297","key":297,"parentid":239,"text":"鸿程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_241","key":241,"parentid":8,"text":"金鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_293","key":293,"parentid":241,"text":"金鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":19}}],"attributes":{"cars":19}},{"id":"DS_242","key":242,"parentid":8,"text":"东方驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_291","key":291,"parentid":242,"text":"东方驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_248","key":248,"parentid":8,"text":"东鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_279","key":279,"parentid":248,"text":"东鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_346","key":346,"parentid":8,"text":"蓝天分校","carstatus":null,"StuId":null,"children":[{"id":"DS_347","key":347,"parentid":346,"text":"蓝天分校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":0}}],"attributes":{"cars":0}},{"id":"DS_349","key":349,"parentid":8,"text":"飞龙驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_350","key":350,"parentid":349,"text":"飞龙驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}}],"attributes":{"cars":276}}],"attributes":{"cars":2070}},{"id":"TM_3","key":3,"parentid":1,"text":"枝江市","carstatus":null,"StuId":null,"children":[{"id":"DS_317","key":317,"parentid":3,"text":"娄底依迅","carstatus":null,"StuId":null,"children":[{"id":"DS_318","key":318,"parentid":317,"text":"枝农分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}},{"id":"DS_348","key":348,"parentid":317,"text":"娄底依迅分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":206}}],"attributes":{"cars":227}}],"attributes":{"cars":227}}],"attributes":{"cars":2297}}]
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

    public static class AttributesBean {
        /**
         * cars : 2070
         */

        private int cars;

        public void setCars(int cars) {
            this.cars = cars;
        }

        public int getCars() {
            return cars;
        }
    }

    public static class DataBean {
        /**
         * id : YY_1
         * key : 1
         * parentid : -1
         * text : 娄底市驾驶员培训系统
         * carstatus : null
         * StuId : null
         * children : [{"id":"TM_2","key":2,"parentid":1,"text":"娄底运管","carstatus":null,"StuId":null,"children":[{"id":"TM_4","key":4,"parentid":2,"text":"娄星区","carstatus":null,"StuId":null,"children":[{"id":"DS_201","key":201,"parentid":4,"text":"畅安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_262","key":262,"parentid":201,"text":"畅安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_202","key":202,"parentid":4,"text":"湘安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_263","key":263,"parentid":202,"text":"湘安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_203","key":203,"parentid":4,"text":"佳程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_265","key":265,"parentid":203,"text":"佳程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_204","key":204,"parentid":4,"text":"鑫鹏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_266","key":266,"parentid":204,"text":"鑫鹏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_205","key":205,"parentid":4,"text":"阳光驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_268","key":268,"parentid":205,"text":"阳光驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_208","key":208,"parentid":4,"text":"翔鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_275","key":275,"parentid":208,"text":"翔鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_213","key":213,"parentid":4,"text":"城中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_283","key":283,"parentid":213,"text":"城中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_214","key":214,"parentid":4,"text":"华通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_285","key":285,"parentid":214,"text":"华通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_215","key":215,"parentid":4,"text":"湘中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_287","key":287,"parentid":215,"text":"湘中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_216","key":216,"parentid":4,"text":"锦程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_290","key":290,"parentid":216,"text":"锦程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_217","key":217,"parentid":4,"text":"朝阳驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_292","key":292,"parentid":217,"text":"朝阳驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":32}}],"attributes":{"cars":32}},{"id":"DS_218","key":218,"parentid":4,"text":"科技驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_294","key":294,"parentid":218,"text":"科技驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_219","key":219,"parentid":4,"text":"潇湘驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_296","key":296,"parentid":219,"text":"潇湘驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_220","key":220,"parentid":4,"text":"诚信驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_298","key":298,"parentid":220,"text":"诚信驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_221","key":221,"parentid":4,"text":"湘运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_300","key":300,"parentid":221,"text":"湘运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_222","key":222,"parentid":4,"text":"钢城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_302","key":302,"parentid":222,"text":"钢城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_223","key":223,"parentid":4,"text":"兴旺驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_304","key":304,"parentid":223,"text":"兴旺驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_224","key":224,"parentid":4,"text":"人文驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_306","key":306,"parentid":224,"text":"人文驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_225","key":225,"parentid":4,"text":"顺达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_307","key":307,"parentid":225,"text":"顺达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":42}}],"attributes":{"cars":42}},{"id":"DS_251","key":251,"parentid":4,"text":"鼎鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_274","key":274,"parentid":251,"text":"鼎鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":29}}],"attributes":{"cars":29}},{"id":"DS_253","key":253,"parentid":4,"text":"非凡驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_271","key":271,"parentid":253,"text":"非凡驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_254","key":254,"parentid":4,"text":"银河驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_270","key":270,"parentid":254,"text":"银河驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_319","key":319,"parentid":4,"text":"顺通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_320","key":320,"parentid":319,"text":"顺通驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_328","key":328,"parentid":4,"text":"远大驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_330","key":330,"parentid":328,"text":"远大驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_329","key":329,"parentid":4,"text":"友谊驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_332","key":332,"parentid":329,"text":"友谊驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_355","key":355,"parentid":4,"text":"飞悦驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_356","key":356,"parentid":355,"text":"飞悦驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":6}}],"attributes":{"cars":6}}],"attributes":{"cars":726}},{"id":"TM_5","key":5,"parentid":2,"text":"双峰县","carstatus":null,"StuId":null,"children":[{"id":"DS_211","key":211,"parentid":5,"text":"中兴驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_282","key":282,"parentid":211,"text":"中兴驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":53}}],"attributes":{"cars":53}},{"id":"DS_230","key":230,"parentid":5,"text":"创业驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_316","key":316,"parentid":230,"text":"创业驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_231","key":231,"parentid":5,"text":"双龙驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_315","key":315,"parentid":231,"text":"双龙驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_232","key":232,"parentid":5,"text":"希望驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_313","key":313,"parentid":232,"text":"希望驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_233","key":233,"parentid":5,"text":"鸿运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_310","key":310,"parentid":233,"text":"鸿运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_234","key":234,"parentid":5,"text":"职中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_308","key":308,"parentid":234,"text":"职中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_235","key":235,"parentid":5,"text":"大众驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_305","key":305,"parentid":235,"text":"大众驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_249","key":249,"parentid":5,"text":"丰杏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_277","key":277,"parentid":249,"text":"丰杏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_250","key":250,"parentid":5,"text":"东方红驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_276","key":276,"parentid":250,"text":"东方红驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_252","key":252,"parentid":5,"text":"鑫达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_272","key":272,"parentid":252,"text":"鑫达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_333","key":333,"parentid":5,"text":"辉煌驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_334","key":334,"parentid":333,"text":"辉煌驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}}],"attributes":{"cars":346}},{"id":"TM_6","key":6,"parentid":2,"text":"新化县","carstatus":null,"StuId":null,"children":[{"id":"DS_210","key":210,"parentid":6,"text":"平安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_280","key":280,"parentid":210,"text":"平安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":58}}],"attributes":{"cars":58}},{"id":"DS_240","key":240,"parentid":6,"text":"新世纪驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_295","key":295,"parentid":240,"text":"新世纪驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_243","key":243,"parentid":6,"text":"环球驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_289","key":289,"parentid":243,"text":"环球驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_244","key":244,"parentid":6,"text":"新洋驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_288","key":288,"parentid":244,"text":"新洋驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_245","key":245,"parentid":6,"text":"奔驰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_286","key":286,"parentid":245,"text":"奔驰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_246","key":246,"parentid":6,"text":"航程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_284","key":284,"parentid":246,"text":"航程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":61}}],"attributes":{"cars":61}},{"id":"DS_247","key":247,"parentid":6,"text":"永通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_281","key":281,"parentid":247,"text":"永通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":75}}],"attributes":{"cars":75}},{"id":"DS_255","key":255,"parentid":6,"text":"熊峰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_264","key":264,"parentid":255,"text":"熊峰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_256","key":256,"parentid":6,"text":"康安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_267","key":267,"parentid":256,"text":"康安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":56}}],"attributes":{"cars":56}},{"id":"DS_258","key":258,"parentid":6,"text":"飞翔驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_261","key":261,"parentid":258,"text":"飞翔驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":30}}],"attributes":{"cars":30}},{"id":"DS_259","key":259,"parentid":6,"text":"凯旋驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_260","key":260,"parentid":259,"text":"凯旋驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":30}}],"attributes":{"cars":30}},{"id":"DS_321","key":321,"parentid":6,"text":"龙源驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_322","key":322,"parentid":321,"text":"龙源驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_344","key":344,"parentid":6,"text":"博众驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_345","key":345,"parentid":344,"text":"博众驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":33}}],"attributes":{"cars":33}},{"id":"DS_351","key":351,"parentid":6,"text":"吉星驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_352","key":352,"parentid":351,"text":"吉星驾校分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":17}}],"attributes":{"cars":17}},{"id":"DS_353","key":353,"parentid":6,"text":"鹏程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_354","key":354,"parentid":353,"text":"鹏程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":17}}],"attributes":{"cars":17}}],"attributes":{"cars":544}},{"id":"TM_7","key":7,"parentid":2,"text":"冷水江市","carstatus":null,"StuId":null,"children":[{"id":"DS_209","key":209,"parentid":7,"text":"锑都驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_278","key":278,"parentid":209,"text":"锑都驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_226","key":226,"parentid":7,"text":"兴学驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_309","key":309,"parentid":226,"text":"兴学驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}},{"id":"DS_227","key":227,"parentid":7,"text":"红日驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_311","key":311,"parentid":227,"text":"红日驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":38}}],"attributes":{"cars":38}},{"id":"DS_228","key":228,"parentid":7,"text":"经纬驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_312","key":312,"parentid":228,"text":"经纬驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_229","key":229,"parentid":7,"text":"安达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_314","key":314,"parentid":229,"text":"安达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_331","key":331,"parentid":7,"text":"金港城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_335","key":335,"parentid":331,"text":"金港城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}}],"attributes":{"cars":178}},{"id":"TM_8","key":8,"parentid":2,"text":"涟源市","carstatus":null,"StuId":null,"children":[{"id":"DS_206","key":206,"parentid":8,"text":"交通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_269","key":269,"parentid":206,"text":"交通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_207","key":207,"parentid":8,"text":"飞鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_273","key":273,"parentid":207,"text":"飞鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":64}}],"attributes":{"cars":64}},{"id":"DS_236","key":236,"parentid":8,"text":"铭鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_303","key":303,"parentid":236,"text":"铭鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}},{"id":"DS_237","key":237,"parentid":8,"text":"龙腾驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_301","key":301,"parentid":237,"text":"龙腾驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":28}}],"attributes":{"cars":28}},{"id":"DS_238","key":238,"parentid":8,"text":"蓝天驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_299","key":299,"parentid":238,"text":"蓝天驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_239","key":239,"parentid":8,"text":"鸿程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_297","key":297,"parentid":239,"text":"鸿程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_241","key":241,"parentid":8,"text":"金鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_293","key":293,"parentid":241,"text":"金鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":19}}],"attributes":{"cars":19}},{"id":"DS_242","key":242,"parentid":8,"text":"东方驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_291","key":291,"parentid":242,"text":"东方驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_248","key":248,"parentid":8,"text":"东鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_279","key":279,"parentid":248,"text":"东鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_346","key":346,"parentid":8,"text":"蓝天分校","carstatus":null,"StuId":null,"children":[{"id":"DS_347","key":347,"parentid":346,"text":"蓝天分校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":0}}],"attributes":{"cars":0}},{"id":"DS_349","key":349,"parentid":8,"text":"飞龙驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_350","key":350,"parentid":349,"text":"飞龙驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}}],"attributes":{"cars":276}}],"attributes":{"cars":2070}},{"id":"TM_3","key":3,"parentid":1,"text":"枝江市","carstatus":null,"StuId":null,"children":[{"id":"DS_317","key":317,"parentid":3,"text":"娄底依迅","carstatus":null,"StuId":null,"children":[{"id":"DS_318","key":318,"parentid":317,"text":"枝农分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}},{"id":"DS_348","key":348,"parentid":317,"text":"娄底依迅分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":206}}],"attributes":{"cars":227}}],"attributes":{"cars":227}}]
         * attributes : {"cars":2297}
         */

        private String id;
        private int key;
        private int parentid;
        private String text;
        private Object carstatus;
        private Object StuId;
        private AttributesBean attributes;
        private List<ChildrenBean1> children;

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

        public void setCarstatus(Object carstatus) {
            this.carstatus = carstatus;
        }

        public void setStuId(Object StuId) {
            this.StuId = StuId;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public void setChildren(List<ChildrenBean1> children) {
            this.children = children;
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

        public Object getCarstatus() {
            return carstatus;
        }

        public Object getStuId() {
            return StuId;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public List<ChildrenBean1> getChildren() {
            return children;
        }

        public static class ChildrenBean1 implements Serializable {
            /**
             * id : TM_2
             * key : 2
             * parentid : 1
             * text : 娄底运管
             * carstatus : null
             * StuId : null
             * children : [{"id":"TM_4","key":4,"parentid":2,"text":"娄星区","carstatus":null,"StuId":null,"children":[{"id":"DS_201","key":201,"parentid":4,"text":"畅安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_262","key":262,"parentid":201,"text":"畅安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_202","key":202,"parentid":4,"text":"湘安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_263","key":263,"parentid":202,"text":"湘安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_203","key":203,"parentid":4,"text":"佳程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_265","key":265,"parentid":203,"text":"佳程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_204","key":204,"parentid":4,"text":"鑫鹏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_266","key":266,"parentid":204,"text":"鑫鹏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_205","key":205,"parentid":4,"text":"阳光驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_268","key":268,"parentid":205,"text":"阳光驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_208","key":208,"parentid":4,"text":"翔鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_275","key":275,"parentid":208,"text":"翔鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_213","key":213,"parentid":4,"text":"城中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_283","key":283,"parentid":213,"text":"城中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_214","key":214,"parentid":4,"text":"华通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_285","key":285,"parentid":214,"text":"华通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_215","key":215,"parentid":4,"text":"湘中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_287","key":287,"parentid":215,"text":"湘中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_216","key":216,"parentid":4,"text":"锦程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_290","key":290,"parentid":216,"text":"锦程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_217","key":217,"parentid":4,"text":"朝阳驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_292","key":292,"parentid":217,"text":"朝阳驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":32}}],"attributes":{"cars":32}},{"id":"DS_218","key":218,"parentid":4,"text":"科技驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_294","key":294,"parentid":218,"text":"科技驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_219","key":219,"parentid":4,"text":"潇湘驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_296","key":296,"parentid":219,"text":"潇湘驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_220","key":220,"parentid":4,"text":"诚信驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_298","key":298,"parentid":220,"text":"诚信驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_221","key":221,"parentid":4,"text":"湘运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_300","key":300,"parentid":221,"text":"湘运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_222","key":222,"parentid":4,"text":"钢城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_302","key":302,"parentid":222,"text":"钢城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_223","key":223,"parentid":4,"text":"兴旺驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_304","key":304,"parentid":223,"text":"兴旺驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_224","key":224,"parentid":4,"text":"人文驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_306","key":306,"parentid":224,"text":"人文驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_225","key":225,"parentid":4,"text":"顺达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_307","key":307,"parentid":225,"text":"顺达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":42}}],"attributes":{"cars":42}},{"id":"DS_251","key":251,"parentid":4,"text":"鼎鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_274","key":274,"parentid":251,"text":"鼎鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":29}}],"attributes":{"cars":29}},{"id":"DS_253","key":253,"parentid":4,"text":"非凡驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_271","key":271,"parentid":253,"text":"非凡驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_254","key":254,"parentid":4,"text":"银河驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_270","key":270,"parentid":254,"text":"银河驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_319","key":319,"parentid":4,"text":"顺通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_320","key":320,"parentid":319,"text":"顺通驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_328","key":328,"parentid":4,"text":"远大驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_330","key":330,"parentid":328,"text":"远大驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_329","key":329,"parentid":4,"text":"友谊驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_332","key":332,"parentid":329,"text":"友谊驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_355","key":355,"parentid":4,"text":"飞悦驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_356","key":356,"parentid":355,"text":"飞悦驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":6}}],"attributes":{"cars":6}}],"attributes":{"cars":726}},{"id":"TM_5","key":5,"parentid":2,"text":"双峰县","carstatus":null,"StuId":null,"children":[{"id":"DS_211","key":211,"parentid":5,"text":"中兴驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_282","key":282,"parentid":211,"text":"中兴驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":53}}],"attributes":{"cars":53}},{"id":"DS_230","key":230,"parentid":5,"text":"创业驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_316","key":316,"parentid":230,"text":"创业驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_231","key":231,"parentid":5,"text":"双龙驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_315","key":315,"parentid":231,"text":"双龙驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_232","key":232,"parentid":5,"text":"希望驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_313","key":313,"parentid":232,"text":"希望驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_233","key":233,"parentid":5,"text":"鸿运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_310","key":310,"parentid":233,"text":"鸿运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_234","key":234,"parentid":5,"text":"职中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_308","key":308,"parentid":234,"text":"职中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_235","key":235,"parentid":5,"text":"大众驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_305","key":305,"parentid":235,"text":"大众驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_249","key":249,"parentid":5,"text":"丰杏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_277","key":277,"parentid":249,"text":"丰杏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_250","key":250,"parentid":5,"text":"东方红驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_276","key":276,"parentid":250,"text":"东方红驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_252","key":252,"parentid":5,"text":"鑫达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_272","key":272,"parentid":252,"text":"鑫达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_333","key":333,"parentid":5,"text":"辉煌驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_334","key":334,"parentid":333,"text":"辉煌驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}}],"attributes":{"cars":346}},{"id":"TM_6","key":6,"parentid":2,"text":"新化县","carstatus":null,"StuId":null,"children":[{"id":"DS_210","key":210,"parentid":6,"text":"平安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_280","key":280,"parentid":210,"text":"平安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":58}}],"attributes":{"cars":58}},{"id":"DS_240","key":240,"parentid":6,"text":"新世纪驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_295","key":295,"parentid":240,"text":"新世纪驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_243","key":243,"parentid":6,"text":"环球驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_289","key":289,"parentid":243,"text":"环球驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_244","key":244,"parentid":6,"text":"新洋驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_288","key":288,"parentid":244,"text":"新洋驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_245","key":245,"parentid":6,"text":"奔驰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_286","key":286,"parentid":245,"text":"奔驰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_246","key":246,"parentid":6,"text":"航程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_284","key":284,"parentid":246,"text":"航程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":61}}],"attributes":{"cars":61}},{"id":"DS_247","key":247,"parentid":6,"text":"永通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_281","key":281,"parentid":247,"text":"永通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":75}}],"attributes":{"cars":75}},{"id":"DS_255","key":255,"parentid":6,"text":"熊峰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_264","key":264,"parentid":255,"text":"熊峰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_256","key":256,"parentid":6,"text":"康安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_267","key":267,"parentid":256,"text":"康安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":56}}],"attributes":{"cars":56}},{"id":"DS_258","key":258,"parentid":6,"text":"飞翔驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_261","key":261,"parentid":258,"text":"飞翔驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":30}}],"attributes":{"cars":30}},{"id":"DS_259","key":259,"parentid":6,"text":"凯旋驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_260","key":260,"parentid":259,"text":"凯旋驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":30}}],"attributes":{"cars":30}},{"id":"DS_321","key":321,"parentid":6,"text":"龙源驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_322","key":322,"parentid":321,"text":"龙源驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_344","key":344,"parentid":6,"text":"博众驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_345","key":345,"parentid":344,"text":"博众驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":33}}],"attributes":{"cars":33}},{"id":"DS_351","key":351,"parentid":6,"text":"吉星驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_352","key":352,"parentid":351,"text":"吉星驾校分校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":17}}],"attributes":{"cars":17}},{"id":"DS_353","key":353,"parentid":6,"text":"鹏程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_354","key":354,"parentid":353,"text":"鹏程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":17}}],"attributes":{"cars":17}}],"attributes":{"cars":544}},{"id":"TM_7","key":7,"parentid":2,"text":"冷水江市","carstatus":null,"StuId":null,"children":[{"id":"DS_209","key":209,"parentid":7,"text":"锑都驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_278","key":278,"parentid":209,"text":"锑都驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":34}}],"attributes":{"cars":34}},{"id":"DS_226","key":226,"parentid":7,"text":"兴学驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_309","key":309,"parentid":226,"text":"兴学驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}},{"id":"DS_227","key":227,"parentid":7,"text":"红日驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_311","key":311,"parentid":227,"text":"红日驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":38}}],"attributes":{"cars":38}},{"id":"DS_228","key":228,"parentid":7,"text":"经纬驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_312","key":312,"parentid":228,"text":"经纬驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_229","key":229,"parentid":7,"text":"安达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_314","key":314,"parentid":229,"text":"安达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_331","key":331,"parentid":7,"text":"金港城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_335","key":335,"parentid":331,"text":"金港城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}}],"attributes":{"cars":178}},{"id":"TM_8","key":8,"parentid":2,"text":"涟源市","carstatus":null,"StuId":null,"children":[{"id":"DS_206","key":206,"parentid":8,"text":"交通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_269","key":269,"parentid":206,"text":"交通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_207","key":207,"parentid":8,"text":"飞鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_273","key":273,"parentid":207,"text":"飞鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":64}}],"attributes":{"cars":64}},{"id":"DS_236","key":236,"parentid":8,"text":"铭鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_303","key":303,"parentid":236,"text":"铭鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":20}}],"attributes":{"cars":20}},{"id":"DS_237","key":237,"parentid":8,"text":"龙腾驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_301","key":301,"parentid":237,"text":"龙腾驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":28}}],"attributes":{"cars":28}},{"id":"DS_238","key":238,"parentid":8,"text":"蓝天驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_299","key":299,"parentid":238,"text":"蓝天驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":22}}],"attributes":{"cars":22}},{"id":"DS_239","key":239,"parentid":8,"text":"鸿程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_297","key":297,"parentid":239,"text":"鸿程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_241","key":241,"parentid":8,"text":"金鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_293","key":293,"parentid":241,"text":"金鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":19}}],"attributes":{"cars":19}},{"id":"DS_242","key":242,"parentid":8,"text":"东方驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_291","key":291,"parentid":242,"text":"东方驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_248","key":248,"parentid":8,"text":"东鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_279","key":279,"parentid":248,"text":"东鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_346","key":346,"parentid":8,"text":"蓝天分校","carstatus":null,"StuId":null,"children":[{"id":"DS_347","key":347,"parentid":346,"text":"蓝天分校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":0}}],"attributes":{"cars":0}},{"id":"DS_349","key":349,"parentid":8,"text":"飞龙驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_350","key":350,"parentid":349,"text":"飞龙驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}}],"attributes":{"cars":276}}]
             * attributes : {"cars":2070}
             */

            private String id;
            private int key;
            private int parentid;
            private String text;
            private String carstatus;
            private String StuId;
            private AttributesBean attributes;
            private List<ChildrenBean2> children;

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

            public void setAttributes(AttributesBean attributes) {
                this.attributes = attributes;
            }

            public void setChildren(List<ChildrenBean2> children) {
                this.children = children;
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

            public AttributesBean getAttributes() {
                return attributes;
            }

            public List<ChildrenBean2> getChildren() {
                return children;
            }

            public static class ChildrenBean2 implements Serializable {
                /**
                 * id : TM_4
                 * key : 4
                 * parentid : 2
                 * text : 娄星区
                 * carstatus : null
                 * StuId : null
                 * children : [{"id":"DS_201","key":201,"parentid":4,"text":"畅安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_262","key":262,"parentid":201,"text":"畅安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_202","key":202,"parentid":4,"text":"湘安驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_263","key":263,"parentid":202,"text":"湘安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":47}}],"attributes":{"cars":47}},{"id":"DS_203","key":203,"parentid":4,"text":"佳程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_265","key":265,"parentid":203,"text":"佳程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_204","key":204,"parentid":4,"text":"鑫鹏驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_266","key":266,"parentid":204,"text":"鑫鹏驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":26}}],"attributes":{"cars":26}},{"id":"DS_205","key":205,"parentid":4,"text":"阳光驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_268","key":268,"parentid":205,"text":"阳光驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":37}}],"attributes":{"cars":37}},{"id":"DS_208","key":208,"parentid":4,"text":"翔鹰驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_275","key":275,"parentid":208,"text":"翔鹰驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_213","key":213,"parentid":4,"text":"城中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_283","key":283,"parentid":213,"text":"城中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":45}}],"attributes":{"cars":45}},{"id":"DS_214","key":214,"parentid":4,"text":"华通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_285","key":285,"parentid":214,"text":"华通驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":24}}],"attributes":{"cars":24}},{"id":"DS_215","key":215,"parentid":4,"text":"湘中驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_287","key":287,"parentid":215,"text":"湘中驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_216","key":216,"parentid":4,"text":"锦程驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_290","key":290,"parentid":216,"text":"锦程驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":35}}],"attributes":{"cars":35}},{"id":"DS_217","key":217,"parentid":4,"text":"朝阳驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_292","key":292,"parentid":217,"text":"朝阳驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":32}}],"attributes":{"cars":32}},{"id":"DS_218","key":218,"parentid":4,"text":"科技驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_294","key":294,"parentid":218,"text":"科技驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":18}}],"attributes":{"cars":18}},{"id":"DS_219","key":219,"parentid":4,"text":"潇湘驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_296","key":296,"parentid":219,"text":"潇湘驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_220","key":220,"parentid":4,"text":"诚信驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_298","key":298,"parentid":220,"text":"诚信驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":36}}],"attributes":{"cars":36}},{"id":"DS_221","key":221,"parentid":4,"text":"湘运驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_300","key":300,"parentid":221,"text":"湘运驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":25}}],"attributes":{"cars":25}},{"id":"DS_222","key":222,"parentid":4,"text":"钢城驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_302","key":302,"parentid":222,"text":"钢城驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_223","key":223,"parentid":4,"text":"兴旺驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_304","key":304,"parentid":223,"text":"兴旺驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":16}}],"attributes":{"cars":16}},{"id":"DS_224","key":224,"parentid":4,"text":"人文驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_306","key":306,"parentid":224,"text":"人文驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_225","key":225,"parentid":4,"text":"顺达驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_307","key":307,"parentid":225,"text":"顺达驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":42}}],"attributes":{"cars":42}},{"id":"DS_251","key":251,"parentid":4,"text":"鼎鑫驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_274","key":274,"parentid":251,"text":"鼎鑫驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":29}}],"attributes":{"cars":29}},{"id":"DS_253","key":253,"parentid":4,"text":"非凡驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_271","key":271,"parentid":253,"text":"非凡驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}],"attributes":{"cars":23}},{"id":"DS_254","key":254,"parentid":4,"text":"银河驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_270","key":270,"parentid":254,"text":"银河驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":27}}],"attributes":{"cars":27}},{"id":"DS_319","key":319,"parentid":4,"text":"顺通驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_320","key":320,"parentid":319,"text":"顺通驾校总校","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_328","key":328,"parentid":4,"text":"远大驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_330","key":330,"parentid":328,"text":"远大驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":21}}],"attributes":{"cars":21}},{"id":"DS_329","key":329,"parentid":4,"text":"友谊驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_332","key":332,"parentid":329,"text":"友谊驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":40}}],"attributes":{"cars":40}},{"id":"DS_355","key":355,"parentid":4,"text":"飞悦驾校","carstatus":null,"StuId":null,"children":[{"id":"DS_356","key":356,"parentid":355,"text":"飞悦驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":6}}],"attributes":{"cars":6}}]
                 * attributes : {"cars":726}
                 */

                private String id;
                private int key;
                private int parentid;
                private String text;
                private String carstatus;
                private String StuId;
                private AttributesBean attributes;
                private List<ChildrenBean3> children;

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

                public void setAttributes(AttributesBean attributes) {
                    this.attributes = attributes;
                }

                public void setChildren(List<ChildrenBean3> children) {
                    this.children = children;
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

                public AttributesBean getAttributes() {
                    return attributes;
                }

                public List<ChildrenBean3> getChildren() {
                    return children;
                }

                public static class ChildrenBean3 implements Serializable {
                    /**
                     * id : DS_201
                     * key : 201
                     * parentid : 4
                     * text : 畅安驾校
                     * carstatus : null
                     * StuId : null
                     * children : [{"id":"DS_262","key":262,"parentid":201,"text":"畅安驾校总部","carstatus":null,"StuId":null,"children":null,"attributes":{"cars":23}}]
                     * attributes : {"cars":23}
                     */

                    private String id;
                    private int key;
                    private int parentid;
                    private String text;
                    private String carstatus;
                    private String StuId;
                    private AttributesBean attributes;
                    private List<ChildrenBean4> children;

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

                    public void setAttributes(AttributesBean attributes) {
                        this.attributes = attributes;
                    }

                    public void setChildren(List<ChildrenBean4> children) {
                        this.children = children;
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

                    public AttributesBean getAttributes() {
                        return attributes;
                    }

                    public List<ChildrenBean4> getChildren() {
                        return children;
                    }


                    public static class ChildrenBean4 implements Serializable {
                        /**
                         * id : DS_262
                         * key : 262
                         * parentid : 201
                         * text : 畅安驾校总部
                         * carstatus : null
                         * StuId : null
                         * children : null
                         * attributes : {"cars":23}
                         */

                        private String id;
                        private int key;
                        private int parentid;
                        private String text;
                        private String carstatus;
                        private String StuId;
                        private Object children;
                        private AttributesBean attributes;

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

                        public void setChildren(Object children) {
                            this.children = children;
                        }

                        public void setAttributes(AttributesBean attributes) {
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

                        public Object getChildren() {
                            return children;
                        }

                        public AttributesBean getAttributes() {
                            return attributes;
                        }

                    }
                }
            }
        }
    }
}
