package clainOfResponsibility;

/**
 * 责任链模式处理类
 */
public class Handler {
    private String name;
    private Handler nextHandler;

    public Handler(String name){
        this.name=name;
    }

    public void SetNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void HandleRequest(String request) {
        // 可以继续添加其他条件，决定是否要将请求交由下一个处理器处理
        if (nextHandler != null) {
            System.out.printf("%s 无法处理请求: %s, 交由下一个处理器处理%n", this.name, request);
            this.nextHandler.HandleRequest(request);
        }else{
            System.out.printf("%s 处理了请求: %s%n", this.name, request);
        }
    }
}

