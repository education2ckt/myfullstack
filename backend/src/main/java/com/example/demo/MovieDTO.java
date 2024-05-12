package com.example.demo;


import lombok.*;


@AllArgsConstructor  @NoArgsConstructor
@Getter @Setter @ToString
public class MovieDto {
    private long idx;
    private String title;
    private String image;
    private String content;
    
    public MovieDto(Movie movie) {
        idx = movie.getIdx();
        title = movie.getTitle();
        image = movie.getImage();
        content = movie.getContent();
    }
}
