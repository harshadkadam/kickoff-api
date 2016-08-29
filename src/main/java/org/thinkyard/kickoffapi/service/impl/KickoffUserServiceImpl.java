package org.thinkyard.kickoffapi.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thinkyard.kickoffapi.entity.KickoffUserEntity;
import org.thinkyard.kickoffapi.repository.KickoffUserRepository;
import org.thinkyard.kickoffapi.service.KickoffUserService;

/**
 * Created by harshad on 23/08/16.
 */

@Service(value = "kickoffUserServiceImpl")
@Transactional
public class KickoffUserServiceImpl implements KickoffUserService {

	private final KickoffUserRepository userRepository;

	public KickoffUserServiceImpl(final KickoffUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public KickoffUserEntity saveUser() {

		KickoffUserEntity entity = new KickoffUserEntity();
		entity.setEmail("harshad.8811@gmail.com");
		entity.setUsername("harshad.8811");
		entity.setPassword("Carlsberg#9");

		KickoffUserEntity persisted = userRepository.save(entity);

		return persisted;
	}
}
