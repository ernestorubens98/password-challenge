package br.com.ernesto.validatepassword.service;

import br.com.ernesto.validatepassword.dto.PasswordRequestDTO;
import br.com.ernesto.validatepassword.dto.PasswordResponseDTO;
import br.com.ernesto.validatepassword.service.impl.ValidatePasswordServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ValidatePasswordServiceImplTest {

    @InjectMocks
    private ValidatePasswordServiceImpl validatePasswordService;

    @Test
    @DisplayName("Given a valid password returns true.")
    void isValidPasswordTrue() {
        PasswordRequestDTO passwordRequestDTO = PasswordRequestDTO.builder().password("AbTp9!fok").build();

        PasswordResponseDTO passwordResponseDTO = validatePasswordService.isValidPassword(passwordRequestDTO);
        assertTrue(passwordResponseDTO.isValidPassword(), "Ok");
    }

    @Test
    @DisplayName("Given a invalid password returns façse.")
    void isValidPasswordFalse() {
        PasswordRequestDTO passwordRequestDTO = PasswordRequestDTO.builder().password("AbTp9!foA").build();

        PasswordResponseDTO passwordResponseDTO = validatePasswordService.isValidPassword(passwordRequestDTO);
        assertFalse(passwordResponseDTO.isValidPassword(), "Ok");
    }
}
