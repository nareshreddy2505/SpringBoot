package com.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
List<Topic> topics = new ArrayList<>( Arrays.asList(
		
		new Topic("1", "naresh", "programmer"),
		new Topic("2", "reddy", "java"),
		new Topic("3", "kottala", "android")
		));

public List<Topic> getAllTopics()
{
	return topics;
}

public Topic getTopic(String name)
{
	return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	
}

public void addTopic(Topic topic) {
  topics.add(topic);
}

public void updateTopic(String name, Topic topic) {

	for(int i=0; i<topics.size(); i++)
	{
		Topic t = topics.get(i);
		if(t.getName().equals(name)){
			topics.set(i, topic);
			return;
		}
	}
}

public void deleteTopic(String name) {
topics.removeIf(t -> t.getName().equals(name));
}
}
