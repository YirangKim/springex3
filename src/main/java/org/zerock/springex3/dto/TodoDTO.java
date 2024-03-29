package org.zerock.springex3.dto;

import lombok.*;

import java.security.PrivateKey;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer; //새로 추가

}
