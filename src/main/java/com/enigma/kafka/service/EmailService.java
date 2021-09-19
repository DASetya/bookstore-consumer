package com.enigma.kafka.service;

import com.enigma.kafka.model.Email;

public interface EmailService {
    void sendMail(Email email);
}
