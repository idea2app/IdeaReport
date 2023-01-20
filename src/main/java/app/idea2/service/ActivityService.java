package app.idea2.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.idea2.entity.Activity;
import app.idea2.entity.YearMostHonour;
import app.idea2.repository.ActivityRepository;
import app.idea2.repository.YearMostHonourRepository;

@Service("activity")
public class ActivityService {
	@Autowired
	private YearMostHonourRepository yearMostHonourRepository;
	@Autowired
	private ActivityRepository activityRepository;
	
	public List<YearMostHonour> getYearMostHonour(String dsName,String datasetName,Map<String,Object> parameters){
        return yearMostHonourRepository.findAll();
    }
	
    public List<Activity> getActivity(String dsName,String datasetName,Map<String,Object> parameters){
        return activityRepository.findAll();
    }
}
