package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicsService {

	@Autowired
	private TopicRepository  topicRepository;

	public List<Topic> getAllTopics() {
		//eturn topic;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Optional<Topic> getTopicDetails(String id) {

		//return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopicToList(Topic topic) {
		//topic.add(topic1);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		/*for(int i=0;i<topic.size();i++)
		{
			Topic t = topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, topic2);
				return;
			}
		}*/
		topicRepository.save(topic);/*Here we used save because this method know whether data corresponding to id is present or not 
										if yes then update will be done else insertion*/

	}

	public void deleteTopic(String id) {
		/*topic.removeIf(t -> t.getId().equals(id));
		return;*/
		topicRepository.deleteById(id);
	}
}
