package de.petermeissner.learnjeerest.jessym.store.model;

import lombok.Data;

@Data
public class Account {
    private Long   id;
    private String name;
    private String email;
}
