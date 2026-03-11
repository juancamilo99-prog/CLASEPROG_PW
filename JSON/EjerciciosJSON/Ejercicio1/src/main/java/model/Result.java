package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
    private String gender;
    private Name name;
    private String email;
    private String phone;
    private String cell;
    private ID id;
    private String nat;
}
