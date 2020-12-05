package com.zhp.french.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class QuestDto {
    private Long id;
    private String content;
    private String answer;
    private Long posX;
    private Long posY;
    private RouteDto route;
    private Set<BoardQuestDto> boards;
}
