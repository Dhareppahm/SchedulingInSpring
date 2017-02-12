package FixedRate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 10000) 
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
	}

	// Note that the beginning of the task execution doesn’t wait for the
	// completion of the previous execution.

	// This option should be used when each execution of the task is
	// independent.(Asysnchonous)
}
