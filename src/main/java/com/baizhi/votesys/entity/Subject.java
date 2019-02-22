package com.baizhi.votesys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject implements Serializable {
    private Integer vsId;

    private String title;//标题：1806班谁最帅

    private Integer type;

    private List<Option> optionList;//选项

    public List<Option> getOptionList() {
        return optionList;
    }
}