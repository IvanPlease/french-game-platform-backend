package com.zhp.french.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class QuestBGDto {
    private Long id;
    private String content;
    private String answer;
    private Long posX;
    private Long posY;
    private RouteDto route;
}
