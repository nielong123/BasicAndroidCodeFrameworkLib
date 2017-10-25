package mybasicandroidcodelib.nl.org.codelib.config;

import com.amap.api.maps.model.LatLng;

/**
 * Created by nl on 2017/2/8.
 */

public final class Config {

    public static String userName;

    public static class RxKey {
        public static final String deleteWork = "deleteWORK";
    }


    public static class BundleKey {
        static public final String QUERY_KEY = "query_key";
        static public final String QUERY_VALUE = "query_value";
        static public final String ALAMTYPE = "alamtype";
        static public final String ALAMTYPE_GRPID = "ALAMTYPE_GRPID";
        static public final String START_TIME = "START_TIME";
        static public final String END_TIME = "END_TIME";
    }

    public enum ReportType {
        type1, type2, type3, type4, type5
    }

    public final static int DEF_ZoomLevel = 13;

    /**
     * lat/lng: (30.56026164846333,114.29845734868167)
     */
    final public static class WuHanLocation {
        final public static double Lat = 30.56026164846333;
        final public static double Lon = 114.29845734868167;
        final public static LatLng latLng = new LatLng(Lat, Lon);
    }

    public static final String BuglyID = "a16e080f42";
}
