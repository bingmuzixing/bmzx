package com.bmzx.core.delivery;

/**
 * 定义系统的全部状态
 * 1000：运输箱暂停
 */
public enum PlatformStatusEnums {
    TRANSPORT_BOX_START(1997,"运输箱开始传送"),
    TRANSPORT_BOX_RUN(1998,"运输箱运行中"),
   TRANSPORT_BOX_STOP(1999,"运输箱暂停传送"),

    ;

    private int key;
    private String   value;
    private PlatformStatusEnums(int  key,String value){
        this.key=key;
        this.value=value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
