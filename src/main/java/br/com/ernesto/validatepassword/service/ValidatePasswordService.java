package br.com.ernesto.validatepassword.service;

import br.com.ernesto.validatepassword.dto.PasswordRequestDTO;
import br.com.ernesto.validatepassword.dto.PasswordResponseDTO;

/** Interface service responsible for handling password operation. */
public interface ValidatePasswordService {

    /**
     * Method responsible for verifying that the password is valid.
     * @param passwordRequestDTO
     * @return The equivalent PasswordResponseDTO object.
     */
    PasswordResponseDTO isValidPassword(PasswordRequestDTO passwordRequestDTO);
}
