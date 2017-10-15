package com.gistmap.test;

import com.gistmap.EnjoyApplication;
import com.gistmap.entity.MusicVO;
import com.gistmap.entity.User;
import com.gistmap.service.MusicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.gistmap.dao.UserDao;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EnjoyApplication.class)


public class UserDaoTest{
	@Autowired
	private MusicService musicService;

	@Test
	public void test1() {
		List<MusicVO> list = musicService.list("%不%");
		System.out.println("start");
		list.forEach(System.out::println);
	}
}