// package com.bakht.demoapp;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.*;

// @SpringBootApplication
// @RestController
// public class DemoappApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(DemoappApplication.class, args);
//     }

//     @GetMapping("/")
//     public String home() {
//         int a = 5, b = 10;
//         return "👋 Welcome to Java CI/CD Web App!<br>" +
//                "Today's date: " + java.time.LocalDate.now() + "<br>" +
//                "Sum of " + a + " + " + b + " = " + (a + b);
//     }
// }
// package com.bakht.demoapp;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.*;

// @SpringBootApplication
// @RestController
// public class DemoappApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(DemoappApplication.class, args);
//     }

//     @GetMapping("/")
//     public String home() {
//         int a = 7, b = 8;
//         return "<h1>✅ Auto Deployment Successful!</h1>" +
//                "<p>This content was updated and pushed via GitHub.</p>" +
//                "<p>Today's date: <strong>" + java.time.LocalDate.now() + "</strong></p>" +
//                "<p>Sum of " + a + " + " + b + " = <strong>" + (a + b) + "</strong></p>";
//     }
// }
package com.bakht.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoappApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        int a = 12, b = 3;
        return """
            <html>
                <head><title>CI/CD Deployed App</title></head>
                <body style='font-family: Arial; padding: 20px;'>
                    <h1 style='color: green;'>🚀 Deployment Confirmed!</h1>
                    <p>This application was deployed via GitHub Actions CI/CD pipeline.</p>
                    <ul>
                        <li><strong>Current Date:</strong> """ + java.time.LocalDate.now() + """</li>
                        <li><strong>Sum of """ + a + """ + """ + b + """ = """ + (a + b) + """</strong></li>
                        <li><strong>Java Version:</strong> """ + System.getProperty("java.version") + """</li>
                    </ul>
                    <p>🔁 Refresh this page after your next commit to see live updates.</p>
                </body>
            </html>
        """;
    }

    @GetMapping("/health")
    public String health() {
        return "✅ Application is running healthy as of " + java.time.LocalTime.now();
    }
}
