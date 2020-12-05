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
public class QuestDto {
    private long id;
    private String content;
    private String answer;
    private int posX;
    private int posY;
    private RouteDto route;
    private Set<BoardQuestDto> boards;
}
