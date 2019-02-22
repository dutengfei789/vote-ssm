package com.baizhi.votesys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vote implements Serializable {
    private Integer vsId;

    private String title;

    private Integer options;

    private Integer participants;

}