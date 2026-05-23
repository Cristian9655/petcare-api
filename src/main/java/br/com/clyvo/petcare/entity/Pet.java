package br.com.clyvo.petcare.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

//import java.io.Serializable;
import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "tb_pet")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Long id;

    @NotBlank(message = "O nome do pet é obrigatório")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank(message = "A espécie é obrigatória")
    @Column(nullable = false, length = 50)
    private String especie;

    @Column(length = 50)
    private String raca;

    @Positive(message = "A idade deve ser positiva")
    private Integer idade;

    @Positive(message = "O peso deve ser positivo")
    @Column(precision = 5, scale = 2)
    private BigDecimal peso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tutor")
    @JsonIgnoreProperties("pets")
    private Tutor tutor;


//    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY)
//    @JsonIgnoreProperties("pet")
//    private List<Vacina> vacinas = new ArrayList<>();
//
//    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY)
//    @JsonIgnoreProperties("pet")
//    private List<Consulta> consultas = new ArrayList<>();

}
