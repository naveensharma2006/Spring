package com.naveen.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naveensharma
 *
 */
@RestController
public class TopicController {

	@RequestMapping("/topic")
	public List<Topic> getTopic(@RequestParam(value = "name") String name) {

		List<Topic> topics = new ArrayList<>();
		topics.add(new Topic("1", "Nav1", "Nav1d"));
		topics.add(new Topic("2", "Nav2", "Nav2d"));
		topics.add(new Topic("2", "Nav31", "Nav23"));
		return topics;
	}

}
