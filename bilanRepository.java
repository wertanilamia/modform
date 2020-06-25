package org.sid.dao;
import java.util.List;
import org.sid.entities.Bilan;
import org.sid.entities.FicheBesoins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface bilanRepository extends JpaRepository<Bilan, Integer> {
//@Query("SELECT f FROM FicheBesoins f LEFT JOIN Bilan b  ON f.idbilan=b.idbilan UNION ALL SELECT b FROM Bilan b RIGHT JOIN ON f.idbilan=b.idbilan ")
	
	//@Query("SELECT f FROM FicheBesoins f LEFT OUTER JOIN Bilan b ON f.idbilan=b.idbilan WHERE f.validate=true ")
	@Query("SELECT f FROM FicheBesoins f LEFT JOIN f.bilan  WHERE f.validate=true ")
	
     public List<FicheBesoins> getBilan();
}