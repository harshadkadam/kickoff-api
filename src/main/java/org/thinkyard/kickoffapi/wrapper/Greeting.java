package org.thinkyard.kickoffapi.wrapper;

import lombok.Data;

/**
 * Created by harshad on 22/08/16.
 */

@Data
public class Greeting {

	private final long id;

	private final String content;

	public Greeting(final long id, final String content) {
		this.id = id;
		this.content = content;
	}
}
