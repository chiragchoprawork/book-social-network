package com.chirag.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class RegistrationRequest {

    @NotEmpty(message= "Firstname is mandatory")
    @NotBlank(message= "Firstname is mandatory")
    private String firstname;
    @NotEmpty(message= "Lastname is mandatory")
    @NotBlank(message= "Lastname is mandatory")
    private String lastname;
    @Email(message="Email is not well formatted")
    @NotEmpty(message= "Email is mandatory")
    @NotBlank(message= "Email is mandatory")
    private String email;
    @NotEmpty(message= "Password is mandatory")
    @NotBlank(message= "Password is mandatory")
    @Size(min=8, message= "Password should be minimum 8 characters long")
    private String password;
}
