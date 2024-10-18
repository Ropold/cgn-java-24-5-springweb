package ropold.cgnjava245springweb;


public class Message {
    private String name;
    private String message;
    private String id;

    public Message() {
    }

    public Message(String name, String message, String id) {
        this.name = name;
        this.message = message;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(String id) {
        this.id = id;
    }

}
