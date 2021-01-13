package com.example.demo.api;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import com.github.codeinghelper.request.SearchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity getUser(@RequestBody SearchModel<UserModel> searchModel) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.list(searchModel));
    }
}                                                                                                                                                                                                                                                                                                                                                    