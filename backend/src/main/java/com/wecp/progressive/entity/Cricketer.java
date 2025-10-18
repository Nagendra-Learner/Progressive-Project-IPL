package com.wecp.progressive.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Cricketer implements Comparable<Cricketer> 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cricketer_id")
    private Integer cricketerId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "team_id")
    private Team team;

    @Column(name = "cricketer_name", nullable = false)
    private String cricketerName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "role")
    private String role;

    @Column(name = "total_runs")
    private Integer totalRuns;

    @Column(name = "total_wickets")
    private Integer totalWickets;


    public Cricketer() {
    }
    
    // Without Primary Key Constructor
    public Cricketer(Integer teamId, String cricketerName, Integer age, String nationality, Integer experience, String role,
    Integer totalRuns, Integer totalWickets) {
        this.team.setTeamId(teamId);
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    public Cricketer(Integer cricketerId, Integer teamId, String cricketerName, Integer age, String nationality, Integer experience,
            String role, Integer totalRuns, Integer totalWickets) {
        this.cricketerId = cricketerId;
        this.team.setTeamId(teamId);
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    public Integer getCricketerId() {
        return cricketerId;
    }

    public void setCricketerId(Integer cricketerId) {
        this.cricketerId = cricketerId;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Integer totalRuns) {
        this.totalRuns = totalRuns;
    }

    public Integer getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(Integer totalWickets) {
        this.totalWickets = totalWickets;
    }

    @Override
    public int compareTo(Cricketer o) 
    {
        return Integer.compare(this.getExperience(), o.getExperience());
    }
    
}