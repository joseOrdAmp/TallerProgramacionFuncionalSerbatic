package genericos.ejemploRequest;


public class MainRequest <T>{

    private Long requestId;
    private String messageId;
    
    private T infoRequest;

    
    public Long getRequestId() {
        return requestId;
    }

    
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    
    public String getMessageId() {
        return messageId;
    }

    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    
    public T getInfoRequest() {
        return infoRequest;
    }

    
    public void setInfoRequest(T infoRequest) {
        this.infoRequest = infoRequest;
    }
    
    
    
    
    
    
    
}
