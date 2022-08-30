package Builder;

import java.util.Objects;

public class MyClass {

    private String attr1;
    private Boolean attr2;
    private Long attr3;

    public MyClass() {

    }

    public String getAttr1(){
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public Boolean getAttr2(Boolean attr2) {
        this.attr2 = attr2;
    }

    public void setAttr2 (Boolean attr2) {
        this.attr2 = attr2;
    }

    public Long getAttr3() {
        return attr3;
    }

    public void setAttr3 (Long attr3) {
        this.attr3 = attr3;
    }

    public MyClass(String attr1, Boolean attr2, Long attr3) {
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Object.equals(attr1, myClass.attr1) && Object.equals(attr2, myClass.attr2) && Object.equals(attr3, myClass.attr3);
    }

    @Override
    public int hashCode() {
        return Object.hash(attr1, attr2, attr3);
    }

}
