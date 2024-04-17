package com.mail.server.service;

import jakarta.mail.MessagingException;

public interface Emailservice {
    public void SendEmail(String to,String subject, String message);

    public void SendBulkEmails(String[] tos,String subject,String message);

    public void SendHtmlEmail(String to,String subject, String message) throws MessagingException;

}
