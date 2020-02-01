package lv.rcs.finalpractice.calendartodonotemanager;

class ToDoApp {

    private int id; // the number of a record, for being able to identify specific rec

    private String title; // or short description
    private String text; // long description
    private String tag; // descriptive tags for easy searching

    private String dateOfCreation; // creation date


    ToDoApp(int id, String title, String text, String tag, String dateOfCreation) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.tag = tag;
        this.dateOfCreation = dateOfCreation;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getText() {
        return text;
    }

    String getTag() {
        return tag;
    }

    String getDateOfCreation() {
        return dateOfCreation;
    }

    //    void setId(int id) { this.id = id; }
    void setTitle(String title) {
        this.title = title;
    }

    void setText(String text) {
        this.text = text;
    }

    void setTag(String tag) {
        this.tag = tag;
    }

    void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
