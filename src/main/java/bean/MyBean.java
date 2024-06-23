package bean;

public class MyBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("msg : "+message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
