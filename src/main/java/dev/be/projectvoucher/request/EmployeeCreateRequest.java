package dev.be.projectvoucher.request;

import lombok.Getter;

public record EmployeeCreateRequest(String name, String position, String department) {

}
