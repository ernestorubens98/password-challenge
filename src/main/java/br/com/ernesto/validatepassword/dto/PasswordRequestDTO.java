package br.com.ernesto.validatepassword.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/** Data Transfer Object (DTO) representing PasswordRequestDTO requests. */
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasswordRequestDTO implements Serializable {

    // Password request
    private String password;

    public String getPassword() {
        return password;
    }

    public void validateIfNull(String password) {
        this.password = Objects.requireNonNullElse(password, "");
    }
}
