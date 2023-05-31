package com.nirmithacode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
