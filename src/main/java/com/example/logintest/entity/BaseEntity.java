package com.example.logintest.entity;

//등록 날짜와 수정 날짜 정보

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract class BaseEntity {
    @CreatedDate
    @Column(name = "regDate", updatable = false)
    private LocalDateTime regDate; //등록날짜

    @LastModifiedDate
    @Column(name = "modDate")
    private LocalDateTime ModDate; //등록시간
}
