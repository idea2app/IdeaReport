package app.idea2;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import app.idea2.entity.Activity;
import app.idea2.entity.YearMostHonour;
import app.idea2.repository.ActivityRepository;
import app.idea2.repository.YearMostHonourRepository;

@SpringBootTest
class InitData {
	@Resource
	private YearMostHonourRepository yearMostHonourRepository;
	@Resource
	private ActivityRepository activityRepository;
	
	@Test
	void saveYearMostHonourData() {
		yearMostHonourRepository.save(new YearMostHonour(2020, "时任中国 DevOps 社区理事长，Elastic的刘征老师说，来成都最想认识的人是诗杰"));
		yearMostHonourRepository.save(new YearMostHonour(2021, "时任开源社理事长，华为的庄表伟老师还没来成都就说，来成都最想见到的人是诗杰"));
		yearMostHonourRepository.save(new YearMostHonour(2022, "果汁小姐姐提名，众多开源社区朋友投票，为我颁发【社区之光】奖杯"));

	}
	
	@Test
	void saveActivityData() {
		activityRepository.save(new Activity(2020, "中国 DevOps 社区 2020 成都峰会", "中国 DevOps 社区", ""));
		activityRepository.save(new Activity(2020, "HDZ成都落地授旗仪式暨DevOps全场景专场", "华为 HDZ", ""));

		activityRepository.save(new Activity(2021, "华为 HDZ Web 与 JavaScript 的新天地","华为 HDZ", ""));
		activityRepository.save(new Activity(2021, "华为 HDZ Web 新领域的探索之旅","华为 HDZ", ""));
		activityRepository.save(new Activity(2021, "极狐 GitLab 中国行启动！首站成都","极狐 GitLab", ""));
		activityRepository.save(new Activity(2021, "OpenVINO + TensforFolw | 成都 GDG 2021 DevFest活动","谷歌 GDG", ""));
		activityRepository.save(new Activity(2021, "【开源】Vue 3 小程序引擎 & React 富文本编辑器","fCC 成都", ""));
		activityRepository.save(new Activity(2021, "华为 HDZ 进击的大学生自创编程语言","华为 HDZ", ""));
		activityRepository.save(new Activity(2021, "COSCon`21 中国开源年会成都场","开源社", ""));
		activityRepository.save(new Activity(2021, "CSDN 云原生 Meetup 成都站","CSDN", ""));
		
		activityRepository.save(new Activity(2022, "Web 自动化测试工作坊","fCC 成都", ""));
		activityRepository.save(new Activity(2022, "2022 开源市集","fCC 成都", ""));
		activityRepository.save(new Activity(2022, "让 K8s 化繁为简 & 极狐成都用户社区大亮相 —— 极狐GitLab X SUSE Rancher","极狐 GitLab", ""));
		activityRepository.save(new Activity(2022, "CSDN Meetup 开源论坛","CSDN", ""));
		activityRepository.save(new Activity(2022, "【HCDG研习社第46期】 硬件结合创作及场景应用","华为 HCDG", "")); 
		activityRepository.save(new Activity(2022, "开源年会硬件展","开源社", ""));
		activityRepository.save(new Activity(2022, "谷歌 GDG 主题分享","谷歌 GDG", "")); 
		activityRepository.save(new Activity(2022, "华为 HCDG 主题分享","华为 HCDG", "")); 
		activityRepository.save(new Activity(2022, "CSDN 游戏出海 Meetup","CSDN", "")); 
	}

}
