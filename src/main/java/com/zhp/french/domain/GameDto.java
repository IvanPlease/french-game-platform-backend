package com.zhp.french.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GameDto {
    private Long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private BoardGameDto board;
    private Set<UserBGDto> users;
}
