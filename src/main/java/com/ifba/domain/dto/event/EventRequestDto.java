package com.ifba.domain.dto.event;

import com.ifba.domain.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Getter
@Setter
public class EventRequestDto {

    private String name;
    private String description;
    private Date startAt; // fazer a logica disso dps
    private Date finishAt;
    private Integer ifCoins;
    private List<Long> requestStudentList;


}
