package dev.more.core.moreappcore.repository;

import dev.more.core.moreappcore.CreateRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepository extends JpaRepository<CreateRoom, Long> {

}
