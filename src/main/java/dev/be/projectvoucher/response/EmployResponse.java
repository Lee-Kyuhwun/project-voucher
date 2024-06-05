package dev.be.projectvoucher.response;

import lombok.Builder;

@Builder
public record EmployResponse(Long no, String name, String position, String department) {
}
