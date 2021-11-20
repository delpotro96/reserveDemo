package com.example.finalprojectdemo.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ReserveVO {
    private String name, email, password, reserveTime;
    private int phone, reserveNumber, reserveCode;
    //reserveCode는 auto-increment
}
