package dev.be.projectvoucher.controller;


import dev.be.projectvoucher.request.EmployeeCreateRequest;
import dev.be.projectvoucher.response.EmployResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    private final Map<Long, EmployResponse> employResponseMap = new HashMap<>();


    //회원 생성
    @PostMapping("/api/v1/employees")
    public EmployResponse create(@RequestBody final EmployeeCreateRequest request) {
        return EmployResponse.builder()
                .no(1L)
                .name(request.name())
                .position(request.position())
                .department(request.department())
                .build();
    }


    // 회원 조회
    @GetMapping("/api/v1/employees/{no}")
    public EmployResponse getEmployee(@PathVariable("no") final Long no) {
        return EmployResponse.builder()
                .no(no)
                .name("홍길동")
                .position("사원")
                .department("개발부")
                .build();
    }
