package org.thinkyard.kickoffapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.thinkyard.kickoffapi.entity.KickoffUserEntity;

/**
 * Created by harshad on 23/08/16.
 */

public interface KickoffUserRepository extends CrudRepository<KickoffUserEntity, Integer> {

}
