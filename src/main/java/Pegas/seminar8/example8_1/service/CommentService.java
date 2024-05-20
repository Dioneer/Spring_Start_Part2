package Pegas.seminar8.example8_1.service;

import Pegas.seminar8.example8_1.module.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    public String publicComment(Comment comment){
        System.out.println(comment.getText()+": "+comment.getAuthor());
        return "success";
    }
}
