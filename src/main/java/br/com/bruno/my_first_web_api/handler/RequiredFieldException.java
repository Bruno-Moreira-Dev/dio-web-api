package br.com.bruno.my_first_web_api.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String field) {
        super("O campo %s é obrigatório", field);
    }
}
