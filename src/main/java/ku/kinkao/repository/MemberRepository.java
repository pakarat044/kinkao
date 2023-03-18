package ku.kinkao.repository;

import ku.kinkao.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    // @Query("SELECT * FROM List<Member> findSomexxx(...)")
    Member findByUsername(String username);
}
