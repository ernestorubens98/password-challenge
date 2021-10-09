package br.com.ernesto.validatepassword.dto;

import lombok.Builder;

/** Data Transfer Object (DTO) representing PasswordResponseDTO responses. */
@Builder
public class PasswordResponseDTO {

    // Password is True or False
    private boolean validPassword;

    public void setValidPassword(boolean validPassword) {
        this.validPassword = validPassword;
    }

    public boolean isValidPassword() {
        return validPassword;
    }
}
