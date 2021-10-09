package br.com.ernesto.validatepassword.service.impl;

import br.com.ernesto.validatepassword.dto.PasswordRequestDTO;
import br.com.ernesto.validatepassword.dto.PasswordResponseDTO;
import br.com.ernesto.validatepassword.service.ValidatePasswordService;
import br.com.ernesto.validatepassword.utils.PasswordUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;

/** {@inheritDoc} */
@Service
@Log4j2
public class ValidatePasswordServiceImpl implements ValidatePasswordService {

    /** {@inheritDoc} */
    @Override
    public PasswordResponseDTO isValidPassword(PasswordRequestDTO passwordRequestDTO) {
        log.info("--> Service - method isValidPassword initialized.");
        Matcher criteriaAreValid = PasswordUtils.regexValidate.matcher(passwordRequestDTO.getPassword());
        boolean isValid = false;

        if (criteriaAreValid.find()) {
            isValid = true;
        }
        log.info("--> Service - method isValidPassword finalized.");
        return PasswordResponseDTO.builder().validPassword(isValid).build();
    }
}
