package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Column
    private Long price;

    @Column
    private Long count;

    @Column
    private String buyDate;


    @Builder
    public Posts(String title, String content, String author,Long price,Long count,String buyDate ) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.price = price;
        this.count = count;
        this.buyDate = buyDate;
    }

    public void update(String title, String content,Long price,Long count,String buyDate) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.count = count;
        this.buyDate = buyDate;
    }
}
