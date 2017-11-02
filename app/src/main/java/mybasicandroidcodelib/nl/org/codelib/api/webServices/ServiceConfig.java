package mybasicandroidcodelib.nl.org.codelib.api.webServices;

/**
 * Created by Administrator on 2017/11/1.
 */

public class ServiceConfig {

    public static String nameSpace = "http://221.235.53.37";
    public static String rootUrl = "http://221.235.53.37:8066/";// 请更换成你要访问的服务器地址
    public static String webService = "TcDataChange.asmx";           //webService目录
    public static String methodName = "LouDiJp";          //要调用的webService方法
    public static String soapAction = "http://221.235.53.37/LouDiJp";
    public static String url = rootUrl + webService;

}
