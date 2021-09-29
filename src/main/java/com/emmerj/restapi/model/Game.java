package com.emmerj.restapi.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Game {

    @Id
    private int id;

    private String title;

    private String developer;

    private String publisher;

    private String genre;

    private Date releaseDate;

    private boolean multiplayer;

}
