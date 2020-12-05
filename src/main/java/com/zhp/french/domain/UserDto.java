package com.zhp.french.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDto {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private Set<GameUserDto> games;
}
