package behavioralmodel.chainofresponsibility.demo;

import java.util.Objects;

/**
 * 描述:
 * 具体处理者角色A
 *
 * @author lars
 * @date 2019/7/12 17:54
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")){
            System.out.println("具体处理者角色A处理该请求");
        }else {
            if (Objects.isNull(super.getNextHandler())){
                System.out.println("孤儿请求，无人接收");
            }else {
                super.getNextHandler().handleRequest(request);
            }
        }
    }
}
