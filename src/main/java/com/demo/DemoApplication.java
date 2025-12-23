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
            <title>TEST Environment</title>
            <style>
                body {
                    background: linear-gradient(135deg, #2193b0, #6dd5ed);
                    font-family: Arial, sans-serif;
                    color: #ffffff;
                    text-align: center;
                    padding-top: 15%;
                }
                h1 { font-size: 48px; }
                p { font-size: 20px; }
                .badge {
                    background: rgba(255,255,255,0.2);
                    padding: 10px 20px;
                    border-radius: 20px;
                    display: inline-block;
                    margin-top: 20px;
                    font-weight: bold;
                }
            </style>
        </head>
        <body>
            <h1>🔬 TEST ENVIRONMENT</h1>
            <p>Quality assurance & automation testing</p>
            <div class="badge">Branch: TEST</div>
        </body>
        </html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
