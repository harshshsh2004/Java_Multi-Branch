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
            <title>PRODUCTION Environment</title>
            <style>
                body {
                    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
                    font-family: 'Segoe UI', Arial, sans-serif;
                    color: #ffffff;
                    text-align: center;
                    padding-top: 15%;
                }
                h1 {
                    font-size: 50px;
                    letter-spacing: 2px;
                }
                p {
                    font-size: 20px;
                    opacity: 0.9;
                }
                .badge {
                    background: #00c853;
                    padding: 12px 26px;
                    border-radius: 30px;
                    display: inline-block;
                    margin-top: 25px;
                    font-weight: bold;
                    box-shadow: 0 4px 15px rgba(0,0,0,0.4);
                }
                .footer {
                    margin-top: 40px;
                    font-size: 14px;
                    opacity: 0.7;
                }
            </style>
        </head>
        <body>
            <h1>🚀 PRODUCTION ENVIRONMENT</h1>
            <p>Live system serving real users</p>
            <div class="badge">Branch: MAIN</div>
            <div class="footer">© 2025 • Production Deployment</div>
        </body>
        </html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
