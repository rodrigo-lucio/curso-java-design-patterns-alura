package br.com.lucio.loja.orcamento;

import org.apache.commons.lang3.StringUtils;

import br.com.lucio.loja.http.HttpAdapterConsultaCep;

public class BuscarCepOrcamento {
    
    private HttpAdapterConsultaCep httpAdapter;
    
    public BuscarCepOrcamento(HttpAdapterConsultaCep httpAdapter) {
        this.httpAdapter = httpAdapter;
    }
    
    public String consultarCep(String cep) {
        /*
         * Chamada HTTP para um serviço externo
         * URL Conection
         * HTTP Client
         * Rest Template
         * Padrão Adapter:
         * Para que caso um dia eu queira trocar a lib, fique facil
         */
        
        if(StringUtils.isEmpty(cep)) {
            throw new RuntimeException("CEP não preenchido");
        }
        
        return httpAdapter.get(cep);
    }



  
}
