package br.com.compassuol.pb.msorder.domain.exception;

import lombok.*;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageExceptionHandler {
    private Date timestamp;
    private Integer status;
    private String message;
}
