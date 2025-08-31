package com.organizedin.organize_din.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "http://localhost:63342") // Use a porta do seu Live Server
public class DashboardController {

    @GetMapping("/summary")
    public ResponseEntity<Map<String, Object>> getDashboardSummary() {
        Map<String, Object> summary = new HashMap<>();
        summary.put("totalBalance", 5432.10);
        summary.put("monthlyIncome", 1500.00);
        summary.put("monthlyExpenses", 750.00);

        return ResponseEntity.ok(summary);
    }
}