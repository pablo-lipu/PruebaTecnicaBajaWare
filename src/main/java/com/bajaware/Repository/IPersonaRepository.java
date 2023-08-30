package com.bajaware.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bajaware.entities.PersonaEntity;

public interface IPersonaRepository extends JpaRepository<PersonaEntity, Integer>{
	
	@Query(value = "SELECT * FROM personas where valor_vivienda_orig > monto_cred_aut", nativeQuery = true)
	List<PersonaEntity> listaPersonas();
	
	@Query(value = "SELECT estado_civil, SUM(montosubcuenta) as total_montosubcuenta FROM personas WHERE estado_civil = ?1 GROUP BY estado_civil", nativeQuery = true)
	List<Object[]> agruparEstadoCivilYSumarMontosubcuenta(Integer estadoCivil);

}
