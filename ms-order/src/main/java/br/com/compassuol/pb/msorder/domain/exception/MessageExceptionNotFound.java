package br.com.compassuol.pb.msorder.domain.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageExceptionNotFound extends RuntimeException{
    public MessageExceptionNotFound(String message) {
        super(message);
    }
}
