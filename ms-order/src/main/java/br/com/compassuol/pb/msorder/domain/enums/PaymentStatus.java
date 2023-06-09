package br.com.compassuol.pb.msorder.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    PROCESSING("processing"),
    REJECTED("rejected"),
    APPROVED("approved");
    private String status;
    public static PaymentStatus fromString(String status) {
        return valueOf(status.toUpperCase());
    }
}
