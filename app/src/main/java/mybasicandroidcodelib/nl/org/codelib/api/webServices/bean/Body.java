package mybasicandroidcodelib.nl.org.codelib.api.webServices.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Administrator on 2017/10/27.
 */

@Root(name = "soap12:Body",strict = false)
public class Body {
    @Element(name = "ADInquiry",required = false)
    public ADInquiry adInquiry;

    public ADInquiry getAdInquiry() {
        return adInquiry;
    }

    public void setAdInquiry(ADInquiry adInquiry) {
        this.adInquiry = adInquiry;
    }
}
