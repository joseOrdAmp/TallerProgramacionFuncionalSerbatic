package genericos.ejemploRequest;


public class EjemploDeUso {
    
    public static void main(String[] args) {
        MainRequest request = getRequestTipo1();
        //MainRequest request = getRequestTipo2();
        
        if(request.getInfoRequest() instanceof InfoRequest1) {
            InfoRequest1 info = ((InfoRequest1)request.getInfoRequest());
            
            System.out.println(info.getCampoParaRequest1());
            
        }else  if(request.getInfoRequest() instanceof InfoRequest2){
            InfoRequest2 info = ((InfoRequest2)request.getInfoRequest());
            
            System.out.println(info.getCampoParaRequest2());
        }
        
        
        
    }

    
    
    
    private static MainRequest getRequestTipo1() {
        MainRequest request= new MainRequest();
        request.setInfoRequest((Object)new InfoRequest1());
        request.setMessageId("123");
        request.setRequestId(123L);
        
        return null;
    }
    
    
    private static MainRequest getRequestTipo2() {
        MainRequest request= new MainRequest();
        request.setInfoRequest((Object)new InfoRequest2());
        request.setMessageId("123");
        request.setRequestId(123L);
        
        return null;
    }
}
