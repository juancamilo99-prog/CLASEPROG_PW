package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Profesor {

    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+0.1);
    }
}
