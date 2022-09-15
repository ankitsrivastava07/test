package test.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class WebController {

    @GetMapping
    public ResponseEntity<?> index(){
        return new ResponseEntity<>("index method called ", HttpStatus.OK);
    }
}
