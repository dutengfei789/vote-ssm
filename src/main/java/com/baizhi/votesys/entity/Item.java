package com.baizhi.votesys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {
    private Integer viId;

    private String userId;

    private Integer vsId;

    private Integer voId;

}