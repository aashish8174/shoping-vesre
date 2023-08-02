package com.example.shoppingverse.Dto.Response;

import com.example.shoppingverse.Enum.CardType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CardResponseDto {
    String CustomerMobile;
    String cardNo;
    int ccv;
    Date validTill;
    CardType cardType;
}
