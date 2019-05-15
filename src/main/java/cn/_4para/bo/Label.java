package cn._4para.bo;

public class Label {

//    // 样本全局唯一id，建议用业务数据中的自增主键
//      "id": "53412341",
//      // 标签 0 不通过，1 通过
//     “label": 0
    private String id;
    private int label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id='" + id + '\'' +
                ", label=" + label +
                '}';
    }
}
