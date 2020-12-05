package com.zhp.french.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity(name = "_users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
    private String email;
    @NotNull
    @ManyToMany(
            targetEntity = Game.class,
            mappedBy = "users",
            cascade = CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @Builder.Default
    private Map<Long, Game> games = new HashMap<>();
}
