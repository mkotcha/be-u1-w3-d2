package emmek.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    @Column(name = "event_date")
    private LocalDate eventDate;

    private String description;

    @Column(name = "event_type")
    private EventType eventType;

    @Column(name = "max_participants")
    private int maxParticipants;

    public Event() {
    }

    public Event(String title, LocalDate eventDate, String description, EventType eventType, int maxParticipants) {
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.eventType = eventType;
        this.maxParticipants = maxParticipants;
    }
}
