package main.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	private Long id;
	private String nome;
	private Integer idade;
	private LocalDate dataNascimento;
	private String email;
}
