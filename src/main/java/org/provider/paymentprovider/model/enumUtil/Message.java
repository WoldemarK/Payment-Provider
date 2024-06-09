package org.provider.paymentprovider.model.enumUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Message {

    OK("OK"),
    PAYMENT_METHOD_NOT_ALLOWED("СПОСОБ ОПЛАТЫ ЗАПРЕЩЕН"),
    PAYMENT_IS_SUCCESS_FULY_COMPLETED("ПЛАТЕЖ УСПЕШНО ЗАВЕРШЕН"),
    PAY_OUT_MIN_AMOUNT("МИНИМАЛЬНАЯ СУММА ВЫПЛАТ");

    private final String message;

}
