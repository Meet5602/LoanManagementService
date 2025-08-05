package com.CharlesRiverDevlopement.loan_payment_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private User user;

    private Double Amount;
    private Long termMonths;
    private Double interestRate;

    @Enumerated(EnumType.STRING)
    private VerificationStatus status; // e.g., "PENDING", "APPROVED", "REJECTED"

    private String Reason; // Reason for application registration
    private LocalDateTime applicationDate; // Date of application registration
    private LocalDateTime approvalDate; // Date of application approval
}
