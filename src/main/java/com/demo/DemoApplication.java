package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String home() {
        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>STAGING Environment</title>
            <style>
                body {
                    background: linear-gradient(135deg, #f7971e, #ffd200);
                    font-family: Arial, sans-serif;
                    color: #2c2c2c;
                    text-align: center;
                    padding-top: 15%;
                }
                h1 { font-size: 48px; }
                p { font-size: 20px; }
                .badge {
                    background: #fff;
                    padding: 10px 20px;
                    border-radius: 20px;
                    display: inline-block;
                    margin-top: 20px;
                    font-weight: bold;
                }
            </style>
        </head>
        <body>
            <h1>🧪 STAGING ENVIRONMENT</h1>
            <p>Pre-production validation in progress</p>
            <div class="badge">Branch: STAGING</div>
        </body>
        </html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
