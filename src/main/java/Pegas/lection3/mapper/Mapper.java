package Pegas.lection3.mapper;

public interface Mapper<F, T>{
    T fromTo(F f);
}
