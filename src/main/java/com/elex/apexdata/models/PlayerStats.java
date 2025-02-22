package com.elex.apexdata.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PlayerStats {

	@Column
	@Id
	private Integer id;
	@Column
	private Integer playerId;
	@Column
	private String name;
	@Column
	private Integer gameId;
	@Column
	private Integer teamId;
	@Column
	private String teamName;
	@Column
	private Integer shots;
	@Column
	private Integer hits;
	@Column
	private Integer knockdowns;
	@Column
	private Integer revivesGiven;
	@Column
	private Integer respawnsGiven;
	@Column
	private Integer survicalTime;
	@Column
	private Integer assists;
	@Column
	private Integer damageDealt;
	@Column
	private Integer teamPlacement;
	@Column
	private String hardware;
	@Column
	private Integer kills;
	@Column
	private String characterName;
	@Column
	private Integer headshots;
	@Column
	private Integer grenadesThrown;
	@Column
	private Integer ultimatesUsed;
	@Column
	private Integer tacticalsUsed;
	@Column
	private String skin;
	@Column
	private Integer damageTaken;
	@Column
	private Integer matchId;
	@Column
	private Integer score;
}
