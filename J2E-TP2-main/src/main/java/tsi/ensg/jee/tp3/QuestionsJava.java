package tsi.ensg.jee.tp3;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions {

    // Constructor
    public QuestionsJava(){

    }

    // Method
    public List<String> questions() {
        List<String> list = new ArrayList<>();

        list.add("Question 1 ?");
        list.add("Question2 ?");
        list.add("Question 3 ?");

        return list;
    }
    
}
