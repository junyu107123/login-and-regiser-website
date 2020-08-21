package tw.com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.com.model.User;
import tw.com.repository.UserRepository;

@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	private UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email,
			@RequestParam String password, User user) {
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		userRepository.save(user);
		log.info(user.toString() + " saved to the repository");
		return "saved";
	}

	@PostMapping(path = "/login")
	public String login(@RequestParam String name, @RequestParam String password, Model model) {
		List<User> users = userRepository.findByName(name);
		if (users == null) {
			log.warn("attempting to log in with the non-existed account");
			return "index";
		} else {
			User user = users.get(0);
			if (user.getPassword().equals(password)) {
				model.addAttribute("id", user.getId());
				model.addAttribute("name", user.getName());
				model.addAttribute("password", user.getPassword());
				model.addAttribute("email", user.getEmail());
				
				log.warn(user.toString() + " logged in");
				return "NewFile";
			} else {
				model.addAttribute("name", " logging failed");
				log.warn(user.toString() + " failed to log in");

			}
			return "index";
		}
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUser() {
		return userRepository.findAll();
	}

	@GetMapping(path = "/")
	public String welcome(@RequestParam(name = "name", required = false, defaultValue = "World") String name1) {
		return "index";
	}

	@GetMapping("/showMyCar")
	public String showMyCar() {
		return "showMyCar";
	}

	@GetMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		userRepository.deleteById(id);
	}
	
}
