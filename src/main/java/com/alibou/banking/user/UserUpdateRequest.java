package com.alibou.banking.user;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateRequest {
    @NotBlank(message = "First name must not be empty")
    private String firstName;
    @NotBlank(message = "Last name must not be empty")
    private String lastName;
}
