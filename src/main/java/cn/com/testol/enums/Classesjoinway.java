package cn.com.testol.enums;

public enum  Classesjoinway {
    NO("不允许加入","no"),
    ALL("允许任何人加入","all"),
    APPLY("需要管理员同意申请","apply")
    ;

    private String name;
    private String value;
    Classesjoinway(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
