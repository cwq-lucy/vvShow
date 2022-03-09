package 拦截过滤器模式;

public class AuthenticationFilter  implements  Filter{
    @Override
    public void execute(String requset) {
        System.out.println("Authenticating request: "+ requset);
    }
}
