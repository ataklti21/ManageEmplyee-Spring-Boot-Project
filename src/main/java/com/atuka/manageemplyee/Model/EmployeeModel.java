package com.atuka.manageemplyee.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeModel {
    @Id
    @SequenceGenerator(name = "Id_sequence",
    sequenceName = "Id_sequence")
    @GeneratedValue(strategy =GenerationType.SEQUENCE,
    generator = "Id_sequence")
    private Integer id;
    private String employee_name;
    private String email;
    private Integer age;
}
