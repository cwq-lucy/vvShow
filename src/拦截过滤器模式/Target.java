package 拦截过滤器模式;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Target {
    public  void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
