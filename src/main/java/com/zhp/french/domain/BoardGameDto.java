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
public class BoardGameDto {
    private long id;
    private long currentQId;
    private Set<QuestBGDto> quests;
}
