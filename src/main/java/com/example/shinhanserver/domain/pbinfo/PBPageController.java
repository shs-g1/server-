//package com.example.shinhanserver.controller;
//
//
//import com.example.shinhanserver.domain.pbinfo.PBPageDto;
//import com.example.shinhanserver.response.ResponseDto;
//import com.example.shinhanserver.service.PBPageService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@Slf4j
//@RequestMapping("/pbpage")
//public class PBPageController {
//    private final PBPageService pbPageService;
//
//    @GetMapping
//    public ResponseEntity<ResponseDto> getPBPage(@RequestParam("pbid") Long pbid) {
//        try{
//            PBPageDto.PBResponseDto pbResponseDto = pbPageService.getPBPage(pbid);
//
//        }catch (RuntimeException e) {
//            ResponseDto errorResponse = ResponseDto.builder()
//                    .error("error")
//                    .build();
//
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//        }
//    }
//}
