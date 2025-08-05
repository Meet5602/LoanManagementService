package com.CharlesRiverDevlopement.loan_payment_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private LoanApplication loanApplication;

    private Double principalAmount;
    private Double monthlyPayment;
    private Double totalPayment;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean isActive;
}
