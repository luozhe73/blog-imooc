package com.demo.blog.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private String email;
}
