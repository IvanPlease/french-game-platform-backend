package com.zhp.french.domain;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "_boards")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Board {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Game game;
}
