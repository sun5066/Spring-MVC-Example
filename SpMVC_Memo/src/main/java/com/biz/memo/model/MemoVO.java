package com.biz.memo.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemoVO {
    private long memo_seq;
    private String memo_title;
    private String memo_content;
}