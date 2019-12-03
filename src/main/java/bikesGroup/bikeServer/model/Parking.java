package bikesGroup.bikeServer.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder(toBuilder = true)
@ToString
@AllArgsConstructor
@Table(name = "parkings")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "photo_id")
    private int photoId;

    @Column(name = "description")
    private String description;

    @Column(name = "usersRating")
    private float usersRating;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "longitude")
    private float longitude;

    public Parking() {}
}
