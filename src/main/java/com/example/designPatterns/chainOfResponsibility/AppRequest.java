package com.example.designPatterns.chainOfResponsibility;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppRequest {
    private String requestName;
    private String authToken;
    private LoginStatus loginStatus;
    private PreviousPaymentStatus previousPaymentStatus;
}
