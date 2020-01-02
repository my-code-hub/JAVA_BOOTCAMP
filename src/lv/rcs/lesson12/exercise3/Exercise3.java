package lv.rcs.lesson12.exercise3;

//3. create class "Rectangle" with properties "width" and "height" (whole numbers).
//    * create default constructor which sets "height" to 5 and "width" to 10
//    * create a constructor with parameters "width" and "height" which sets the corresponding property values
//    * create methods "getHeight" and "getWidth" which return the corresponding properties
//    * create a method "getPerimeter" (sum all sides) which calculates and returns the perimeter of the rectangle
//    * create a method "getArea" (multiply with with height) which calculates and returns the area of rectangle
//    * create a method "incrementHeight" with no parameters, which increments height by one
//    * create a method "incrementWidth" with no parameters, which increments width by one
public class Exercise3 {

    public static void main(String[] args) {
        Rectangle figure1 = new Rectangle(1, 2);
        Rectangle figure2; // is not defined
        Rectangle figure3 = null; //points to null address
        Rectangle figure4 = new Rectangle();

        int figure1Height = figure1.getHeight();
        System.out.println(figure1Height);

        new Rectangle(1, 2);


    }
}
