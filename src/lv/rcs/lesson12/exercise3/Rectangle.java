package lv.rcs.lesson12.exercise3;

class Rectangle {

    int width;
    int height;

    //* create default constructor which sets "height" to 5 and "width" to 10
    Rectangle() {
        height = 5;
        width = 10;
    }

    // * create a constructor with parameters "width"
    // and "height" which sets the corresponding property values
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getHeight() {
        return height;
    }
}
