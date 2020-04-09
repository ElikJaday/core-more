package dev.more.core.moreappcore.repository;

import dev.more.core.moreappcore.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findById(Long id);


    @Query("select u from UserEntity u where u.nickName LIKE %:nickName%")
    List<UserEntity> findByNickName(@Param("nickName") String nickName);

}