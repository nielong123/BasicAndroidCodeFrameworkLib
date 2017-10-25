package mybasicandroidcodelib.nl.org.codelib.api;

import com.exsum.exsuncompany_postoffice.requestBean.AddNewSchedulingRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.GetCarInfoRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.IllegalDetailRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.KpiRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.LoginRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.ShowDateBean;
import com.exsum.exsuncompany_postoffice.requestBean.ShowStartinfoRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.ShowYlfldRequestBean;
import com.exsum.exsuncompany_postoffice.requestBean.ShowYljbRequestBean;
import com.jaydenxiao.common.basebean.BaseRespose;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * des:ApiService
 * Created by xsf
 * on 2016.06.15:47
 */
public interface ApiService {

    @GET("hbgps/app/login")
    Observable<BaseRespose<LoginRequestBean.DataBean>> loginApiService(@Query("username") String username, @Query("password") String password);

    @GET("hbgps/app/showStartinfo")
    Observable<BaseRespose<ShowStartinfoRequestBean.DataBean>> showStartInfoApiService(@Query("username") String username,
                                                                                       @Query("begintm") String begintm,
                                                                                       @Query("endtm") String endtm);

    @GET("hbgps/app/deleteStartinfo")
    Observable<BaseRespose<ShowStartinfoRequestBean.DataBean>> deleteStartInfoApiService(@Query("startinfo") String startinfo);

    @GET("hbgps/app/editSaveStartinfo")
    Observable<BaseRespose<AddNewSchedulingRequestBean.DataBean>> addStartInfoApiService(@Query("username") String username,
                                                                                         @Query("yldm") String yldm,
                                                                                         @Query("schkindinfo") String schkindinfo,
                                                                                         @Query("lienceid") String lienceid,
                                                                                         @Query("begintm") String begintm,
                                                                                         @Query("firstid") String firstid,
                                                                                         @Query("secid") String secid,
                                                                                         @Query("thrid") String thrid);

    //kpi报表
    @GET("hbgps/app/kpi")
    Observable<BaseRespose<KpiRequestBean.DataBean>> showKPIApiService(@Query("begin") String begin,
                                                                       @Query("end") String end,
                                                                       @Query("username") String username);

    //    邮路分路段正常运行分析表
    @GET("hbgps/app/showYlfld")
    Observable<BaseRespose<ShowYlfldRequestBean.DataBean>> showYlfldApiService(@Query("begin") String begin,
                                                                               @Query("end") String end,
                                                                               @Query("js") String js,
                                                                               @Query("lc") String lc,
                                                                               @Query("sc") String sc,
                                                                               @Query("yldm") String yldm);


//    http://192.168.1.125:8080/hbgps/app/showDate?begintm=1490630400000&endtm=1490716800000&yldm=2343000046

    @GET("hbgps/app/showDate")
    Observable<BaseRespose<ShowDateBean.DataBean>> showDateApiService(@Query("begintm") String begintm,
                                                                      @Query("endtm") String endtm,
                                                                      @Query("yldm") String yldm);


    //    http://192.168.1.125:8080/hbgps/app/showYljb?begin=1490716800000&grpid=1&username=admin
    @GET("hbgps/app/showYljb")
    Observable<BaseRespose<ShowYljbRequestBean.DataBean>> showYljbApiService(@Query("begin") String begin,
                                                                             @Query("grpid") String grpid,
                                                                             @Query("username") String username);

//        http://192.168.1.125:8080/hbgps/app/showZlb?begin=1490630400000&end=1490716800000&js(级数)=2&lc(里程范围)=5&sc(时长范围)=10	邮路分路段运行资料表


    //	邮路分路段运行资料表
    @GET("hbgps/app/showZlb")
    Observable<BaseRespose<ShowYljbRequestBean.DataBean>> showZlbApiService(@Query("begin") String begin,
                                                                            @Query("end") String end,
                                                                            @Query("js") String js,
                                                                            @Query("ls") String lc,
                                                                            @Query("sc") String sc);


    //	查询车辆状态,不传查所有
    @GET("hbgps/app/curtraceinfo")
    Observable<BaseRespose<GetCarInfoRequestBean.DataBean>> getCarInfoService(@Query("lienceid") String lienceid);


    //	违规详情
    @GET("hbgps/app/out")
    Observable<BaseRespose<IllegalDetailRequestBean.DataBean>> getIllegalDetailService(@Query("username") String username,
                                                                                       @Query("begin") String begin,
                                                                                       @Query("end") String end,
                                                                                       @Query("grpid") String grpid,
                                                                                       @Query("alamtype") String alamtype);


// @GET("login")
//    Observable<BaseRespose<User>> login(@Query("username") String username, @Query("password") String password);
//
//    @GET("nc/article/{postId}/full.html")
//    Observable<Map<String, NewsDetail>> getNewDetail(
//            @Header("Cache-Control") String cacheControl,
//            @Path("postId") String postId);
//
//    @GET("nc/article/{type}/{id}/{startPage}-20.html")
//    Observable<Map<String, List<NewsSummary>>> getNewsList(
//            @Header("Cache-Control") String cacheControl,
//            @Path("type") String type, @Path("id") String id,
//            @Path("startPage") int startPage);
//
//    @GET
//    Observable<ResponseBody> getNewsBodyHtmlPhoto(
//            @Header("Cache-Control") String cacheControl,
//            @Url String photoPath);
//    //@Url，它允许我们直接传入一个请求的URL。这样以来我们可以将上一个请求的获得的url直接传入进来，baseUrl将被无视
//    // baseUrl 需要符合标准，为空、""、或不合法将会报错
//
//    @GET("data/福利/{size}/{page}")
//    Observable<GirlData> getPhotoList(
//            @Header("Cache-Control") String cacheControl,
//            @Path("size") int size,
//            @Path("page") int page);
//
//    @GET("nc/video/list/{type}/n/{startPage}-10.html")
//    Observable<Map<String, List<VideoData>>> getVideoList(
//            @Header("Cache-Control") String cacheControl,
//            @Path("type") String type,
//            @Path("startPage") int startPage);
}
