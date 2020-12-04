package com.zhp.french.domain;

import java.util.ArrayList;
import java.util.Date;

public class Game {
    private long id;
    private String name;
    private String desc;
    private Date startDate;
    private Date endDate;
    private Board board;
    private ArrayList<User> users;
}
