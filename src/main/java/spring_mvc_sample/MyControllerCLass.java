package spring_mvc_sample;

import java.util.Arrays;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControllerCLass {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "<h1 align='center'>Hello! have a nice day!!!</h1>";
	}

	@GetMapping("/toss")
	@ResponseBody
	public String toss() {
		List<String> tosses = Arrays.asList("head", "tail");
		int num = new Random().nextInt(2);
		return "<h1 align='center'>Coin Flipped! and it is " + tosses.get(num) + "  </h1>";
	}

	@PostMapping("/wish")
	@ResponseBody
	public String wish(@RequestParam String name) {

		return "<h1 align='center'>Good Evening " + name + "  </h1>";
	}

	@GetMapping("/add")
	@ResponseBody
	public String add(@RequestParam int num1, @RequestParam int num2) {
		return "The Result is " + (num1 + num2);
	}

	@GetMapping("/sub")
	@ResponseBody
	public String sub(@RequestParam int num1, @RequestParam int num2) {
		return "The Result is " + (num1 - num2);
	}

	@GetMapping("/mul")
	@ResponseBody
	public String mul(@RequestParam int num1, @RequestParam int num2) {
		return "The Result is " + (num1 * num2);
	}

	@GetMapping("/div")
	@ResponseBody
	public String div(@RequestParam double num1, @RequestParam int num2) {
		return "The Result is " + (num1 / num2);
	}

	@GetMapping("/yt")
	public String yt() {
		return "redirect:https://www.youtube.com";
	}

}