package com.example.demo;


import jakarta.persistence.*;
import lombok.*;


@Getter @Setter  @ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;
    private String title;
    private String image;
    private String content;
}
