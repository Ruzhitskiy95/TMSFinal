package com.example.tmsfinal.dao;


import com.example.tmsfinal.model.EmailContext;
import jakarta.mail.MessagingException;

public interface EmailService {
    void sendMail(EmailContext email) throws MessagingException;
}