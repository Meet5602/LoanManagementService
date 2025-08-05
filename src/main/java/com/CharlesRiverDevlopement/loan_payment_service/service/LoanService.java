package com.CharlesRiverDevlopement.loan_payment_service.service;

import com.CharlesRiverDevlopement.loan_payment_service.repository.KYCRepository;
import com.CharlesRiverDevlopement.loan_payment_service.repository.LoanStatusHistoryRepository;
import com.CharlesRiverDevlopement.loan_payment_service.repository.UserRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanService {
    @Autowired
    private UserRespository userRespository;
    @Autowired
    private KYCRepository kycRepository;
    @Autowired
    private LoanStatusHistoryRepository loanStatusHistoryRepository;

    public void applyForLoan(LoanApplicationRequestDTO request) {
        // Logic to apply for a loan
        // This would typically involve checking the user's KYC status and creating a loan application
    }


}
