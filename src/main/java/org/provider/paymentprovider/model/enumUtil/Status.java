package org.provider.paymentprovider.model.enumUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    IN_PROGRESS("В ПРОГРЕССЕ"),
    SUCCESS("успех"),
    FAILED("провалившийся"),
    APPROVED("одобренный");

    private final String translation;

}
