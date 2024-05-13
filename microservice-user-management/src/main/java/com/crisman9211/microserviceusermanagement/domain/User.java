package com.crisman9211.microserviceusermanagement.domain;

public record User(
    Long id,
    String fullName,
    String idType,
    String idNumber,
    String userName,
    String password,
    String email
){}

