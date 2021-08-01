package ru.podlubnyy.chat.domain;

import javax.persistence.*;

/**
 * Created by Alexey Podlubnyy on 01.08.2021
 */

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text;

    public Message() {}

    public Message(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
