package com.aaronr92.accountservice.controllers;

import com.aaronr92.accountservice.entities.Event;
import com.aaronr92.accountservice.services.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/security")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @GetMapping("/events")
    ResponseEntity<List<Event>> getEvents() {
        return ResponseEntity.ok(auditService.getSecurityEvents());
    }
}
