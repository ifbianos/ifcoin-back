package com.ifba.application.controller.login;


import com.ifba.domain.dto.loginentity.LoginEntity;
import com.ifba.domain.dto.requestaccount.UserRequestDto;
import com.ifba.domain.usecase.login.LoginUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("api/user/login")
public class TemporaryLoginController {

    private final LoginUseCase loginUseCase;

    public TemporaryLoginController(LoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping
    public ResponseEntity<LoginEntity> login(@RequestBody UserRequestDto userRequestDto){
        return ResponseEntity.ok().body(loginUseCase.findUser(userRequestDto.getUsername(),userRequestDto.getPassword()));
    }
}
