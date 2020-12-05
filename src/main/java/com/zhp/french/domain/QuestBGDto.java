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
    private long id;
    private String content;
    private String answer;
    private int posX;
    private int posY;
    private RouteDto route;
}
