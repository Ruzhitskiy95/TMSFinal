package com.example.tmsfinal.service;

//import javax.mail.MessagingException;
import com.example.tmsfinal.model.EmailContext;
import jakarta.mail.MessagingException;

import java.io.FileNotFoundException;

public interface EmailService {

//    void sendSimpleEmail(final String toAddress, final String subject, final String message);
//    void sendEmailWithAttachment(final String toAddress, final String subject, final String message, final String attachment) throws MessagingException, FileNotFoundException;

    void sendMail(EmailContext email) throws MessagingException;
}