package clainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler manager = new Handler("经理");
        Handler director = new Handler("总监");
        Handler ceo = new Handler("CEO");

        manager.SetNextHandler(director);
        director.SetNextHandler(ceo);

        manager.HandleRequest("请假");
    }
}
