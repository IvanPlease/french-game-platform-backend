package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "_routes")
public class Route {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private int posXF;
    @NotNull
    private int posYF;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Quest quest;
    @NotNull
    private boolean picture;
    private int posXP;
    private int posYP;
}
