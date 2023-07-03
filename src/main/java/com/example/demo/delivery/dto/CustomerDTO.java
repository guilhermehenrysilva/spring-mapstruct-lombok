package com.example.demo.delivery.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CustomerDTO {

    private Long id;

    private String name;

    private String sobrenome;

    private String login;

    private String password;

}
