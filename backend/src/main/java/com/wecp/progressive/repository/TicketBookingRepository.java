package com.wecp.progressive.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wecp.progressive.entity.TicketBooking;

import java.util.List;

import org.springframework.data.jpa.repository.*;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer>
{
    List<TicketBooking> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("Delete from TicketBooking t where t.match.firstTeam.teamId = :teamId OR t.match.secondTeam.teamId = :teamId")
    public void deleteByTeamId(int teamId);

    @Transactional
    @Modifying
    @Query("Delete from TicketBooking t Where t.match.matchId = :matchId")
    public void deleteByMatchId(int matchId);
    
}
