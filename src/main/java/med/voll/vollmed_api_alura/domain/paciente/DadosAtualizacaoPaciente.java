package med.voll.vollmed_api_alura.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.vollmed_api_alura.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}