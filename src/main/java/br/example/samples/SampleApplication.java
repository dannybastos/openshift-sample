package br.example.samples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Server11;

/**
 * Created by dannybastos on 10/12/18.
 */


@SpringBootApplication
@RestController
public class SampleApplication extends SpringBootServletInitializer {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class);
    }
    
    @GetMapping("hello")
    public ResponseEntity<String> sayHello(@RequestParam("name") String name) {
        Server11 server11 = new Server11();
        server11.setName(name);
        log.info(server11.toString());
        return ResponseEntity.ok(server11.getName()+"\n");
    }

}