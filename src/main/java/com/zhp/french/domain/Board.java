package com.zhp.french.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "_boards")
public class Board {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private long currentQId;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Game game;
    @NotNull
    @ManyToMany(
            targetEntity = Quest.class,
            mappedBy = "boards",
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    private Set<Quest> quests;
}
