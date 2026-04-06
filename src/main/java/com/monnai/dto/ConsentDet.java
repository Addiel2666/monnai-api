package com.monnai.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ConsentDet {

    private String consentId;
    private String consentTimestamp;
    private String consentType;

}
