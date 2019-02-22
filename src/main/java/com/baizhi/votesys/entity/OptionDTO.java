package com.baizhi.votesys.entity;

import lombok.Data;

import java.util.List;

@Data
public class OptionDTO {
    private List<Option> optionList;
    private int vsId;
    private int optionCount;
}
