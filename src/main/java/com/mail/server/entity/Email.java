package com.mail.server.entity;

import lombok.Data;

@Data
public class Email {
    private String to;
    private String message;
    private String subject;
    private String[] tos;
}
