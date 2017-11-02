package mybasicandroidcodelib.nl.org.codelib.api.webServices.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Administrator on 2017/10/27.
 */

@Root(name = "Identify",strict = false)
public class Identify {

    @Element(name = "Username",required = false)
    public String UserName;
    @Element(name = "PassWord",required = false)
    public String PassWord;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
