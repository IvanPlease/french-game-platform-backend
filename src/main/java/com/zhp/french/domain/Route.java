package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


@Entity(name = "_routes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Route {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long posXF;
    @NotNull
    private Long posYF;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Quest quest;
    @NotNull
    private Boolean picture;
    private Long posXP;
    private Long posYP;
}
