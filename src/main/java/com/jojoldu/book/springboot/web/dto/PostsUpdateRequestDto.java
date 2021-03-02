package com.jojoldu.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private Long price;
    private Long count;
    private String buyDate;
    @Builder
    public PostsUpdateRequestDto(String title, String content, Long price, Long count, String buyDate) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.count = count;
        this.buyDate = buyDate;
    }
}
