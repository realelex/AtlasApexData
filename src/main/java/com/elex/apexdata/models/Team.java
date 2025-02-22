package com.elex.apexdata.models;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Team {

	@Column
	@Id
	private Integer teamId;
	@Column
	private String name;
	@Column
	private TeamStats overall_stats;
	@Column
	@ManyToAny
	private List<PlayerStats> player_stats;
}
