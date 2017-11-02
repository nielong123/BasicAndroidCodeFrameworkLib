package mybasicandroidcodelib.nl.org.codelib.api.webServices.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Administrator on 2017/10/27.
 */

@Root(name = "soap12:Header",strict = false)
public class Header {
    @Element(name = "Identify",required = false)
    public Identify identify;

    public Identify getIdentify() {
        return identify;
    }

    public void setIdentify(Identify identify) {
        this.identify = identify;
    }
}
