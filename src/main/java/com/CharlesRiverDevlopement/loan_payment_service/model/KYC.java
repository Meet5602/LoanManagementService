package com.CharlesRiverDevlopement.loan_payment_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class KYC {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String documentType;
    private String documentUrl;

    @Enumerated(EnumType.STRING)
    private VerificationStatus verificationStatus;

    private LocalDateTime uploadedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private User user;
}
