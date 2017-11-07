package mybasicandroidcodelib.nl.org.codelib.bean.my;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mybasicandroidcodelib.nl.org.codelib.bean.CompanyBean;
import mybasicandroidcodelib.nl.org.codelib.widget.BaseParentNode;

/**
 * Created by Administrator on 2017/11/6.
 */

public class RootNode extends BaseParentNode {

    public RootNode(String name) {
        super(name);
    }


    public static class DataBean extends BaseParentNode {

        public DataBean(String name) {
            super(name);
        }
    }

    public static class ChildNode1 extends BaseParentNode {
        private String id;
        private int key;
        private int parentid;
        private String text;
        private String carstatus;
        private String StuId;
        private AttributesBean attributes;

        public ChildNode1(String name) {
            super(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getParentid() {
            return parentid;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCarstatus() {
            return carstatus;
        }

        public void setCarstatus(String carstatus) {
            this.carstatus = carstatus;
        }

        public String getStuId() {
            return StuId;
        }

        public void setStuId(String stuId) {
            StuId = stuId;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

    }

    public static class ChildNode2 extends BaseParentNode {
        private String id;
        private int key;
        private int parentid;
        private String text;
        private String carstatus;
        private String StuId;
        private AttributesBean attributes;

        public ChildNode2(String name) {
            super(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getParentid() {
            return parentid;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCarstatus() {
            return carstatus;
        }

        public void setCarstatus(String carstatus) {
            this.carstatus = carstatus;
        }

        public String getStuId() {
            return StuId;
        }

        public void setStuId(String stuId) {
            StuId = stuId;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

    }

    public static class ChildNode3 extends BaseParentNode {
        private String id;
        private int key;
        private int parentid;
        private String text;
        private String carstatus;
        private String StuId;
        private AttributesBean attributes;

        public ChildNode3(String name) {
            super(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getParentid() {
            return parentid;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCarstatus() {
            return carstatus;
        }

        public void setCarstatus(String carstatus) {
            this.carstatus = carstatus;
        }

        public String getStuId() {
            return StuId;
        }

        public void setStuId(String stuId) {
            StuId = stuId;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

    }

    public static class ChildNode4 extends BaseParentNode {
        private String id;
        private int key;
        private int parentid;
        private String text;
        private String carstatus;
        private String StuId;
        private AttributesBean attributes;

        public ChildNode4(String name) {
            super(name);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getParentid() {
            return parentid;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCarstatus() {
            return carstatus;
        }

        public void setCarstatus(String carstatus) {
            this.carstatus = carstatus;
        }

        public String getStuId() {
            return StuId;
        }

        public void setStuId(String stuId) {
            StuId = stuId;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

    }

    /**
     * cars : 2296
     */
    public static class AttributesBean implements Serializable {

        private int cars;

        public void setCars(int cars) {
            this.cars = cars;
        }

        public int getCars() {
            return cars;
        }
    }


    public static ChildNode1 ChildBean1ToChildNode1(CompanyBean.DataBean.ChildrenBean1 bean) {
        ChildNode1 node = new ChildNode1(bean.getText());
        node.setText(bean.getText());
        node.setCarstatus(bean.getCarstatus());
        node.setId(bean.getId());
        node.setKey(bean.getKey());
        node.setParentid(bean.getParentid());
        node.setStuId(bean.getStuId());
        node.setAttributes(attributes2Attributes(bean.getAttributes()));
        return node;
    }

    public static ChildNode2 ChildBean2ToChildNode2(CompanyBean.DataBean.ChildrenBean1.ChildrenBean2 bean) {
        ChildNode2 node = new ChildNode2(bean.getText());
        node.setText(bean.getText());
        node.setCarstatus(bean.getCarstatus());
        node.setId(bean.getId());
        node.setKey(bean.getKey());
        node.setParentid(bean.getParentid());
        node.setStuId(bean.getStuId());
        node.setAttributes(attributes2Attributes(bean.getAttributes()));
        return node;
    }

    public static ChildNode3 ChildBean3ToChildNode3(CompanyBean.DataBean.ChildrenBean1.ChildrenBean2.ChildrenBean3 bean) {
        ChildNode3 node = new ChildNode3(bean.getText());
        node.setText(bean.getText());
        node.setCarstatus(bean.getCarstatus());
        node.setId(bean.getId());
        node.setKey(bean.getKey());
        node.setParentid(bean.getParentid());
        node.setStuId(bean.getStuId());
        node.setAttributes(attributes2Attributes(bean.getAttributes()));
        return node;
    }

    public static ChildNode4 ChildBean4ToChildNode4(CompanyBean.DataBean.ChildrenBean1.ChildrenBean2.ChildrenBean3.ChildrenBean4 bean) {
        ChildNode4 node = new ChildNode4(bean.getText());
        node.setText(bean.getText());
        node.setCarstatus(bean.getCarstatus());
        node.setId(bean.getId());
        node.setKey(bean.getKey());
        node.setParentid(bean.getParentid());
        node.setStuId(bean.getStuId());
        node.setAttributes(attributes2Attributes(bean.getAttributes()));
        return node;
    }

    public static DataBean DataBean2ChildNode(CompanyBean.DataBean bean) {
        DataBean node = new DataBean(bean.getText());
        return node;
    }

    private static AttributesBean attributes2Attributes(CompanyBean.AttributesBean bean) {
        if (bean != null) {
            AttributesBean attributesBean = new AttributesBean();
            attributesBean.cars = bean.getCars();
            return attributesBean;
        }
        return null;
    }
}
