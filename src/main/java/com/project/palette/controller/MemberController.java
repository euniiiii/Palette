package com.project.palette.controller;

import com.project.palette.dto.member.RegisterMemberRequestDto;
import com.project.palette.dto.member.MemberResponseDto;
import com.project.palette.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/register")
    public ResponseEntity<MemberResponseDto> register(@RequestBody RegisterMemberRequestDto registerMemberDto) {
        MemberResponseDto responseDto = memberService.register(registerMemberDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }


}
