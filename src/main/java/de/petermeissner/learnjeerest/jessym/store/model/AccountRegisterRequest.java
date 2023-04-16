package de.petermeissner.learnjeerest.jessym.store.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AccountRegisterRequest {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

}
