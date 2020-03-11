package com.example.demotest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public List<String> getFileName() throws IOException{
		List<String> list = Arrays.asList("line1","line2","line3","line4","line5");
		list.stream().forEach(System.out::println);
		return list;
	}
}
