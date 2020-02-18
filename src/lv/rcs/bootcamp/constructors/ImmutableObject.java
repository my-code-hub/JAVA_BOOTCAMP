package lv.rcs.bootcamp.constructors;

public class ImmutableObject {
    private String text;
    private int number;

    public ImmutableObject(String text) {
        this.text = text;
        this.number = 123;
    }

    public String getText() {
        return text;
    }
}
