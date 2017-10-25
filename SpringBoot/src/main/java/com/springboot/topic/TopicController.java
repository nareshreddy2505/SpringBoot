package com.springboot.topic;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicservice.getAllTopics();
	}
@RequestMapping("/topics/{name}")	
public Topic getTopic(@PathVariable String name)
{
	return topicservice.getTopic(name);
	
}
@RequestMapping(method=RequestMethod.POST, value="/topics")
public void addTopic(@RequestBody Topic topic)
{
	topicservice.addTopic(topic);
}

@RequestMapping(method=RequestMethod.PUT, value="/topics/{name}")
public void updateTopic(@RequestBody Topic topic, @PathVariable String name )
{
	topicservice.updateTopic(name, topic);
}


@RequestMapping(method=RequestMethod.DELETE, value="/topics/{name}")	
public void deleteTopic(@PathVariable String name)
{
	 topicservice.deleteTopic(name);
	
}
}