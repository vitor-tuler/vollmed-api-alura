package med.voll.vollmed_api_alura.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.vollmed_api_alura.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
