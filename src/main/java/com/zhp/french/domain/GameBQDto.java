package com.zhp.french.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class GameBQDto {
    private long id;
    private String name;
    private String desc;
    private Date startDate;
    private Date endDate;
    private Set<UserBGDto> users;
}
