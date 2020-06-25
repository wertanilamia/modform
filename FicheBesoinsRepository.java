package org.sid.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;

import org.sid.entities.FicheBesoins;
import org.sid.entities.Utilisateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FicheBesoinsRepository extends JpaRepository<FicheBesoins, Integer> {
	//@Query("select f from FicheBesoins f where f.idm like:x")
    // public Page<FicheBesoins> chercherficher(@Param("x")int mc, Pageable pageable);
	@Query("select p from FicheBesoins p where p.directionAeroport like:s")
	public Page<FicheBesoins> Chercherdirect(@Param("s")String mcp, Pageable pageable );
	@Query("select f.domaine, f.theme from FicheBesoins as f where f.validate=true ")
	public Page<FicheBesoins> getFiches( Pageable pageable);
	
	@Query("SELECT f FROM FicheBesoins f WHERE validate=true")
	public List<FicheBesoins> getValidateFiche();
	
@Query("SELECT f FROM FicheBesoins f WHERE typeformation='inter-entreprise' AND validate=true ")
	public List<FicheBesoins> getFichesInter();

@Query("SELECT f FROM FicheBesoins f WHERE typeformation='intra-entreprise' AND validate=true ")
public List<FicheBesoins> getFichesIntra();
@Query("SELECT f FROM FicheBesoins f WHERE typeformation='cours du soir' AND validate=true ")
public List<FicheBesoins> getFichesCourSoir();
@Query("SELECT f FROM FicheBesoins f WHERE typeformation='a l etranger' AND validate=true ")
public List<FicheBesoins> getFichesEtranger();
@Query("SELECT f FROM FicheBesoins f WHERE typeformation='a distance' AND validate=true ")
public List<FicheBesoins> getFichesDistance();







}