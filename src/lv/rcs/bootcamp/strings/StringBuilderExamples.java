package lv.rcs.bootcamp.strings;

public class StringBuilderExamples {

    public static void main(String[] args) {
        String text = "numbers: ";
        for (int i = 0; i < 5; i ++) {
            text += i + " ";
        }
        System.out.println(text);

        //more effective
        StringBuilder textBuilder = new StringBuilder("numbers: ");
        for (int i = 0; i < 5; i ++) {
            textBuilder.append(i).append(" ");
        }
        System.out.println(textBuilder.toString());

        //thread safe
        StringBuffer textBuffer = new StringBuffer("numbers: ");
        for (int i = 0; i < 5; i ++) {
            textBuffer.append(i).append(" ");
        }
        System.out.println(textBuffer.toString());


    }
}
