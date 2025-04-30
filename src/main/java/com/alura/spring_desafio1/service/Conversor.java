package com.alura.spring_desafio1.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversor implements IConversor{

    ObjectMapper mapper = new ObjectMapper();
    File newState = new File("tarefa.json");

    @Override
    public <T> void paraJson(T objeto) {
    try {
            mapper.writeValue(newState, objeto);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T paraObjeto(Class<T> classe) {
        try {
            return mapper.readValue(newState, classe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}