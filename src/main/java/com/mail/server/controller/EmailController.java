package com.mail.server.controller;

import com.mail.server.entity.Email;
import com.mail.server.service.impl.EmailServiceImpl;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class EmailController {
    @Autowired
    EmailServiceImpl emailServiceimpl;
    @PostMapping("/sendemail")
    public void sendEmail(@RequestBody Email email)
    {
        emailServiceimpl.SendEmail(email.getTo(),email.getSubject(),email.getMessage());
    }

    @PostMapping("/sendemailb")
    public void sendEmailb(@RequestBody Email email)
    {
        emailServiceimpl.SendBulkEmails(email.getTos(), email.getSubject(),email.getMessage());
    }

    @PostMapping("/sendemailhtml")
    public void sendhtmlEmailb(@RequestBody Email email) throws MessagingException {
        emailServiceimpl.SendHtmlEmail(email.getTo(), email.getSubject(),email.getMessage());
    }
}
