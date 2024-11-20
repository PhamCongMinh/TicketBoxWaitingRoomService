package org.ticketbox.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="organizers")
public class Organizer extends BaseModel {
    private String name;

    private String description;

    @OneToMany(mappedBy = "organizer", fetch = FetchType.EAGER)
    private List<OrganizerRole> organizerRoles;

    @OneToMany(mappedBy = "organizer", fetch = FetchType.EAGER)
    private List<Event> events;
}