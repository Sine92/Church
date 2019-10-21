package com.church.church.Service;

public interface IService<T, ID> {

    T create(T t);
    T read(Integer id);
    T update(T t);
    void delete(ID id);
}
