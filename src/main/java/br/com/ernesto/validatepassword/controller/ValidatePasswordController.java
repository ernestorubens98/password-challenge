package br.com.ernesto.validatepassword.controller;

import br.com.ernesto.validatepassword.dto.PasswordRequestDTO;
import br.com.ernesto.validatepassword.dto.PasswordResponseDTO;
import br.com.ernesto.validatepassword.service.ValidatePasswordService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Controller Responsible for the password. */
@RestController
@RequestMapping("api/v1/validate")
@Log4j2
public class ValidatePasswordController {

    @Autowired
    private ValidatePasswordService validatePasswordService;

    /**
     * Method responsible for validating PasswordRequestDTO.
     * @param passwordRequestDTO
     * @return PasswordResponseDTO with a boolean value.
     */
    @PostMapping
    public ResponseEntity<PasswordResponseDTO> validatePassword(@RequestBody PasswordRequestDTO passwordRequestDTO) {
        log.info("Controller -> method validatePassword initialized.");
        passwordRequestDTO.validateIfNull(passwordRequestDTO.getPassword());
        PasswordResponseDTO passwordResponseDTO = validatePasswordService.isValidPassword(passwordRequestDTO);
        log.info("Controller -> method validatePassword finalized.");
        return ResponseEntity.ok().body(passwordResponseDTO);
    }
}
