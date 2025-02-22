package com.elex.apexdata.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Game {

	@Column
	@Id
	private int id;
	@Column
	private String organizer;
	@Column
	private Integer eventId;
	@Column
	private Integer game;
	@Column
	private Long match_start;
	@Column
	private String mid;
	@Column
	private String map_name;
	@Column
	private boolean aim_assist_allowed;
	@Column
	private Integer matchId;
	@Column
	private String source;
	@Column
	private String livedata;
	@Column
	private boolean livedata_checked;
	@Column
	@OneToMany
	private List<Team> teams;

}
