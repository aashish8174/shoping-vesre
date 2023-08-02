package com.example.shoppingverse.Dto.Response;

import com.example.shoppingverse.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponseDto {
    String name;
    String email;
    int mobileNo;
    Gender gender;
}
