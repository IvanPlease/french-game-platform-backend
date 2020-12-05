package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "_quests")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Quest {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String content;
    @NotNull
    private String answer;
    @NotNull
    private Long posX;
    @NotNull
    private Long posY;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Route route;
    @ManyToMany(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @Builder.Default
    private Set<Board> boards = new HashSet<>();
}
