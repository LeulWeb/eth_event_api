package com.bishu.eth_event.exceptions;
import java.io.Serial;

public class EventNotFoundException extends  RuntimeException {
    @Serial
    private static final long serialVersionUID = 1; //serilaization
    public  EventNotFoundException(String message){
        super(message);
    }
}
