package com.example.shoppingverse.Dto.Request;

import com.example.shoppingverse.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequestDto {

    String name;

    String emailId;

    String mobNo;

    Gender gender;
}
