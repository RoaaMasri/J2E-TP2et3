package tsi.ensg.jee.tp3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class QuestionService {

    Questions questions;


    // Constructor
    public QuestionService(){

        this.questions = null;
    }
    
    public QuestionService(Questions questions){
        this.questions = questions;
    }

    // Getters
    public String getQuestion(){
        int index = (int)(Math.random() * this.questions.questions().size());
        return this.questions.questions().get(index);
    }


    // Setters
    public void setQuestions(Questions questions){
        this.questions = questions;
    }
}
