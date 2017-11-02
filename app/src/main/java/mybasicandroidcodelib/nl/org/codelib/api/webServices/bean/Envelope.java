package mybasicandroidcodelib.nl.org.codelib.api.webServices.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;


/**
 * Created by Administrator on 2017/10/27.
 */


@Root(name = "soap12:Envelop", strict = false)
@NamespaceList({
        @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
        @Namespace(reference = "http://www.w3.org/2001/XMLSchema", prefix = "xsi"),
        @Namespace(reference = "soap12", prefix = "http://www.w3.org/2003/05/soap-envelopee"),
})

public class Envelope {
    @Element(name = "soap12:Header", required = false)
    public Header header;

    @Element(name = "soap12:Body", required = false)
    public Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
