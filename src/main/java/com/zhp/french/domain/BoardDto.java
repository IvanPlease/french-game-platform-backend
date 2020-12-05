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
public class BoardDto {
    private Long id;
    private Long currentQId;
    private GameBQDto game;
    private Set<QuestBGDto> quests;
}
