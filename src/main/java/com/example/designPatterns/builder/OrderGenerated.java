package com.example.designPatterns.builder;

import lombok.Builder;
import lombok.Data;

// this class is created to show how lombok creates builder pattern.
@Data
@Builder
public class OrderGenerated {
    private String orderId;
    private String orderType;
    private String referenceId;
    private String orderTime;
    private String postalCode;
}
