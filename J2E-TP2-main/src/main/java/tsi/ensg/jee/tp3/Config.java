package tsi.ensg.jee.tp3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public QuestionsJava beanQJava() {
        return new QuestionsJava();
    }

    @Bean
    public QuestionsJavaAvance beanQJavaAv() {
        return new QuestionsJavaAvance();
    }

    /*
    @Bean
    public QuestionService beanQuestion() {
        return new QuestionService(beanQJava());
    }*/

    @Bean
    public QuestionService beanQuestion() {
        return new QuestionService(beanQJavaAv());
    }
}
