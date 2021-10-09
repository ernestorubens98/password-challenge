package br.com.ernesto.validatepassword.dto;

import lombok.Builder;

import java.util.Objects;

/** Data Transfer Object (DTO) representing PasswordRequestDTO requests. */
@Builder
public class PasswordRequestDTO {

    // Password request
    private String password;

    public String getPassword() {
        return password;
    }

    public void validateIfNull(String password) {
        this.password = Objects.requireNonNullElse(password, "");
    }
}
