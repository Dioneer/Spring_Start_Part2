package Pegas.seminar8.example8_1;

import Pegas.seminar8.example8_1.configuration.ProjectConfig;
import Pegas.seminar8.example8_1.module.Comment;
import Pegas.seminar8.example8_1.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Igor");
        comment.setText("Hello my friends");

        String value = service.publicComment(comment);
        System.out.println(value);
    }
}
