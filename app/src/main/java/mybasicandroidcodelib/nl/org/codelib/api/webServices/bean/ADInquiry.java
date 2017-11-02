package mybasicandroidcodelib.nl.org.codelib.api.webServices.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Administrator on 2017/10/27.
 */

@Root(name = "ADInquiry",strict = false)
public class ADInquiry {
    @Element(name = "str",required = false)
    public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
