package tsi.ensg.jee.tp3;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJavaAvance implements Questions {

    // Constructor
    public QuestionsJavaAvance(){

    }

    public List<String> questions() {
        List<String> list = new ArrayList<>();

        list.add("Question advance 1 ?");
        list.add("Question advance 2 ?");
        list.add("Question advance 3 ?");

        return list;
    }
    
}
