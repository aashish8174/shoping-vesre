package com.example.shoppingverse.Dto.Request;

import com.example.shoppingverse.Enum.CardType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CardRequestDto {

    String CustomerMobile;
    String cardNo;
    int ccv;
    Date validTill;
    CardType cardType;

}
