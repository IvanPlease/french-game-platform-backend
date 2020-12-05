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
    private Long id;
    private Long posXF;
    private Long posYF;
    private Boolean picture;
    private Long posXP;
    private Long posYP;
}
