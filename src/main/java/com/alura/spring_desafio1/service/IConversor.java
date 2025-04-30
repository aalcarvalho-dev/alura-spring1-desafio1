package com.alura.spring_desafio1.service;

public interface IConversor {
    public <T> void paraJson(T objeto);
    public <T> T paraObjeto(Class<T> classe);
}
