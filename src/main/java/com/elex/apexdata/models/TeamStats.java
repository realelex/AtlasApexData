package com.elex.apexdata.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TeamStats {

	@Column
	@Id
	private Integer id;
	@Column
	private Integer teamId;
	@Column
	private Integer gameId;
	@Column
	private Integer teamPlacement;
	@Column
	private String name;
	@Column
	private Integer score;
	@Column
	private Integer kills;
	@Column
	private Integer revivesGiven;
	@Column
	private Integer headshots;
	@Column
	private Integer assists;
	@Column
	private Integer respawnsGiven;
	@Column
	private Integer damageDealt;
	@Column
	private Integer knockdowns;
	@Column
	private Integer shots;
	@Column
	private Integer hits;
	@Column
	private Integer survivalTime;
	@Column
	private Integer grenadesThrown;
	@Column
	private Integer ultimatesUsed;
	@Column
	private Integer tacticalsUsed;
	@Column
	private Integer damageTaken;
	@Column
	private Integer matchId;
//	@JoinColumn
//	@ManyToOne
//	private List<String> characters;
}
