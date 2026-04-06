package com.monnai.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MonnaiRequest {

    private Details userDetails;
    private String eventType;
    private Boolean cleansingFlag;
    private String[] packages;
    private ConsentDet consentDetails;

}
