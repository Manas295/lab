package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicsService {

	//Arrays.asList is immutable list 
	List<Topic> topic=  new ArrayList<Topic>( Arrays.asList(
			new Topic("S001","Spring Framework","Spring Description"),
			new Topic("J002","Core Java","Core Java Description"),
			new Topic("H001","HTML","HTML Description"),
			new Topic("P001","Python","Python Description")


			));
	public List<Topic> getAllTopics() {
		return topic;

	}

	public Topic getTopicDetails(String id) {

		return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopicToList(Topic topic1) {
		topic.add(topic1);
	}

	public void updateTopic(String id, Topic topic2) {
		for(int i=0;i<topic.size();i++)
		{
			Topic t = topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, topic2);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topic.removeIf(t -> t.getId().equals(id));
		return;
	}
}
