package com.monnai.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Details {

    private String email;
    private String phoneNumber;
    private String countryCode;

}
