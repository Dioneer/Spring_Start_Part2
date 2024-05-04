package Pegas.seminar5.example1.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequest {
    private Long senderCountId;
    private Long receiverCountId;
    private BigDecimal amount;

}
