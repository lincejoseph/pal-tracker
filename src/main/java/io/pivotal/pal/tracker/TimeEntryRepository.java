package io.pivotal.pal.tracker;

import java.util.List;

import io.pivotal.pal.tracker.TimeEntry;

public interface TimeEntryRepository {

	TimeEntry find(Long timeEntryId);

	List<TimeEntry> list();

	TimeEntry update(Long eq, TimeEntry any);

	void delete(Long timeEntryId);

	TimeEntry create(TimeEntry timeEntryToCreate);

}
