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
    public String home() {
        int a = 7, b = 8;
        return "<h1>✅ Auto Deployment Successful!</h1>" +
               "<p>This content was updated and pushed via GitHub.</p>" +
               "<p>Today's date: <strong>" + java.time.LocalDate.now() + "</strong></p>" +
               "<p>Sum of " + a + " + " + b + " = <strong>" + (a + b) + "</strong></p>";
    }
}
