@Entity
@Table(name = "chat_messages")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userMessage;
    private String aiResponse;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
}
