package com.zhp.french.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BoardQuestDto {
    private Long id;
    private Long currentQId;
    private GameBQDto game;
}
