package br.com.ernesto.validatepassword.controller;

import br.com.ernesto.validatepassword.dto.PasswordRequestDTO;
import br.com.ernesto.validatepassword.dto.PasswordResponseDTO;
import br.com.ernesto.validatepassword.service.ValidatePasswordService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ValidatePasswordControllerTest {

    @Mock
    private ValidatePasswordService validatePasswordService;

    @InjectMocks
    private ValidatePasswordController validatePasswordController;

    @Test
    @DisplayName("Given a valid password returns true.")
    void testValidatePassword() {
        PasswordRequestDTO passwordRequestDTO = PasswordRequestDTO.builder().password("AbTp9!fok").build();
        PasswordResponseDTO passwordResponseDTO = PasswordResponseDTO.builder().validPassword(true).build();
        when(validatePasswordService.isValidPassword(passwordRequestDTO)).thenReturn(passwordResponseDTO);

        ResponseEntity<PasswordResponseDTO> responseController = validatePasswordController.validatePassword(passwordRequestDTO);

        assertTrue(responseController.getBody().isValidPassword(), "Ok");
        assertEquals(HttpStatus.OK, responseController.getStatusCode(), "OK");
    }
}
