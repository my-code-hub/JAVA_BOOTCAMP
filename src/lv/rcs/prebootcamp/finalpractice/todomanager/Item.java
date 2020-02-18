package lv.rcs.prebootcamp.finalpractice.todomanager;

public class Item {

    private boolean isDone = false;
    private String category;
    private String description;
    private int priority;

    public Item(String itemName, String itemDescription, int priority) {
        category = itemName;
        description = itemDescription;
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return category;
    }

    public void setName(String name) {
        this.category = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean getDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String toString() {
        String statusText;
        if (isDone) {
            statusText = "done";
        } else {
            statusText = "not done yet";
        }
        return category + " | " + description + " | " + priority + " | " + statusText;
    }
}
