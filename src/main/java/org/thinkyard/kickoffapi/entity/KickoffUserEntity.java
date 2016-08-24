package org.thinkyard.kickoffapi.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by harshad on 23/08/16.
 */

@Entity
@Table(name = "kickoff_user")
@Data
public class KickoffUserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email", nullable = false, unique = true)
	private String email;
}
