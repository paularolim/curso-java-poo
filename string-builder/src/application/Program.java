package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(
            sdf.parse("18/02/2021 21:38:03"),
            "Traveling to New Zealand",
            "I'm going to visit this wonderful country!",
            12);
        post1.addComment(comment1);
        post1.addComment(comment2);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May be the force with you");

        Post post2 = new Post(
                sdf.parse("26/02/2021 11:23:45"),
                "Good night guys",
                "See you tomorrow",
                5);
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println();
        System.out.println(post2);
    }
}
