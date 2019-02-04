package io.javabrains.springbootstarter.topic;


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
	private TopicsService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAlltopics() {
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")  //We are telling spring that {id} its a variable portion

	/*@RequestMapping("/topics/{foo}")  //We are telling spring that {foo} its a variable portion its not manadatory to keep varaible name same
	public Topic getTopic(@PathVariable("foo") String id) { */

	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopicDetails(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopicToList(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void updateTopic(@PathVariable String id) {
		
		topicService.deleteTopic(id);
	}
}
