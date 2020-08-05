package com.like.sun.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ShoeVO {
    private long s_seq;
    private String s_name;
    private String s_date;
    private int s_amount;
    private int s_qty;
}
