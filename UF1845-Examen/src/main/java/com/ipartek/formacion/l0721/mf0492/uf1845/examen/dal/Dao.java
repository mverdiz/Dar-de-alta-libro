package com.ipartek.formacion.l0721.mf0492.uf1845.examen.dal;

public interface Dao<T> {
	default Iterable<T> obtenerTodos() {
		throw new DalException("No implementado");
	}
	default T obtenerPorId(Long id){
		throw new DalException("No implementado");
	};
	
	default T insertar(T objeto){
		throw new DalException("No implementado");
	};
	default T modificar(T objeto){
		throw new DalException("No implementado");
	};
	default void borrar(Long id){
		throw new DalException("No implementado");
	};
}
