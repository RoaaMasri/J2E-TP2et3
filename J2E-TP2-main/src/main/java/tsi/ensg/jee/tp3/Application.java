package tsi.ensg.jee.tp3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main (String[] args){
        // Create Spring Context
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        QuestionService QuestionBean = context.getBean( QuestionService.class);
        QuestionBean.getQuestion();
        System.out.println(QuestionBean.getQuestion());

    }
}
