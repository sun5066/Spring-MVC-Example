package com.like.cisum.model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
    private String m_userid;
    private String m_pw;
    private String m_name;
    private String m_tel;
    private String m_roll;
}
