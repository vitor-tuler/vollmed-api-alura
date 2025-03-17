package med.voll.vollmed_api_alura.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.vollmed_api_alura.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
