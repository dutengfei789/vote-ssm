package com.baizhi.votesys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Option implements Serializable {
    private Integer voId;

    private String option;

    private Integer order;
}