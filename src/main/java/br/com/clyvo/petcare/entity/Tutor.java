package br.com.clyvo.petcare.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

//import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "tb_tutor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tutor")
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false, length = 100)
    private String nome;

    @Email(message = "Email inválido")
    @Column(unique = true, length = 120)
    private String email;

    @NotBlank(message = "O telefone é obrigatório")
    @Column(nullable = false, length = 20)
    private String telefone;

    @OneToMany(mappedBy = "tutor", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("tutor")
    private List<Pet> pets = new ArrayList<>();

}
