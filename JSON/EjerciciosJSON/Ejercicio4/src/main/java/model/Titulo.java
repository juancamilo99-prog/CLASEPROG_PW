package model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Titulo implements Serializable {
    private long userId;
    private long id;
    private String title;
    private String body;
}
