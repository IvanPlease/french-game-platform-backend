package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "_quests")
public class Quest {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String content;
    @NotNull
    private String answer;
    @NotNull
    private int posX;
    @NotNull
    private int posY;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Route route;
    @ManyToMany(
            targetEntity = Board.class,
            mappedBy = "quests",
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    private List<Board> boards;
}
