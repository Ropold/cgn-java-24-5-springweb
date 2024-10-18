package ropold.cgnjava245springweb;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {


    private final List<Message> messages = new ArrayList<>();

    @PostMapping
    public String createMessage(@RequestBody Message message) {
        messages.add(message);
        return "Nachricht hinzugefügt: " + message.getMessage();
    }

    @GetMapping
    public List<Message> getAllMessages() {
        return messages;
    }
}
