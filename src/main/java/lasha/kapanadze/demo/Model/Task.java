package lasha.kapanadze.demo.Model;

import java.util.Date;

import jdk.jfr.Category;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    String description;
    Date startDate;
    Date endDate;

    @ToString.Exclude
    @OneToMany( mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //
    private List<Comment> comments = new ArrayList<>();

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Category> categories = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Attachment attachment;

}
