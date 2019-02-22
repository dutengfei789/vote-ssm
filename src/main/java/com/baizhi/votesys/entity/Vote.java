package com.baizhi.votesys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 4096 kB
 * </p>
 *
 * @author 杜腾飞
 * @since 2019-02-22
 */
public class Vote implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vs_id", type = IdType.AUTO)
    private Integer vsId;

    private String title;

    private Integer options;

    private Integer participants;


    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOptions() {
        return options;
    }

    public void setOptions(Integer options) {
        this.options = options;
    }

    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Vote{" +
        "vsId=" + vsId +
        ", title=" + title +
        ", options=" + options +
        ", participants=" + participants +
        "}";
    }
}
