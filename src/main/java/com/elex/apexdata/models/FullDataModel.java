package com.elex.apexdata.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FullDataModel {

	@Id
	@GeneratedValue
	@Column
	private Integer masterId;
	@Column
	private int total;
	@Column
	private String source;
	@OneToMany
	@Column
	private List<Game> games; // Full data model contains list of games, Game contains list of teams, Team
	// contains List of PlayerStats

}
