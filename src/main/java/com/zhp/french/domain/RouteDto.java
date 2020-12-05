package com.zhp.french.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RouteDto {
    private long id;
    private int posXF;
    private int posYF;
    private boolean picture;
    private int posXP;
    private int posYP;
}
