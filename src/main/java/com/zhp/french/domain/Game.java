package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity(name = "_games")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Game {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private Date startDate;
    @NotNull
    private Date endDate;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Board board;
    @NotNull
    @ManyToMany(
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @Builder.Default
    private Map<Long, User> users = new HashMap<>();
    @NotNull
    @ManyToMany(
            targetEntity = Quest.class,
            mappedBy = "boards",
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @Builder.Default
    private Set<Quest> quests = new HashSet<>();
}
