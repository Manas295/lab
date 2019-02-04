package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

	@Autowired
	private CourseRepository  courseRepository;

	public List<Course> getAllCourses(String topicId) {
		//eturn topic;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;

	}

	public Optional<Course> getCourseDetails(String id) {

		//return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourseToList(Course course) {
		//topic.add(topic1);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		/*for(int i=0;i<topic.size();i++)
		{
			Topic t = topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, topic2);
				return;
			}
		}*/
		courseRepository.save(course);/*Here we used save because this method know whether data corresponding to id is present or not 
										if yes then update will be done else insertion*/

	}

	public void deleteCourse(String id) {
		/*topic.removeIf(t -> t.getId().equals(id));
		return;*/
		courseRepository.deleteById(id);
	}
}
