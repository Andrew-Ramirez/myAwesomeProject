package com.tts.myAwesomeProject;

import com.tts.myAwesomeProject.handlingformsubmission.Greeting;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository <Greeting, Long> {
}
