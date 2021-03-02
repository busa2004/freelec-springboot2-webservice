package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    private Long price;
    private Long count;
    private String buyDate;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, Long price, Long count, String buyDate) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.price = price;
        this.count = count;
        this.buyDate = buyDate;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .price(price)
                .count(count)
                .buyDate(buyDate)
                .build();
    }

}
