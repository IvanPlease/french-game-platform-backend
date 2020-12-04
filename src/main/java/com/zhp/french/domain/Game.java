package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "_games")
public class Game {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String name;
    @NotNull
    private String desc;
    @NotNull
    private Date startDate;
    @NotNull
    private Date endDate;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Board board;
    @NotNull
    @ManyToMany(
            targetEntity = User.class,
            mappedBy = "games",
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    private List<User> users;
}
