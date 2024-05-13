package com.crisman9211.microserviceaccountmanagement.domain;

import java.util.Date;

public record Account(
     Long id,
     AccountType accountType,
     String accountNumber,
     Float balance,
     String debitCardNumber,
     Date openingDate,
     Long userId

) {}
