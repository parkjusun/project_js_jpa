package com.occamsrazor.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Messenger;

@RestController
@RequestMapping("/member")
public class AdminController {
	@Autowired AdminService memberService;
	
	
	@PostMapping("/join")
	public Messenger add(@RequestBody Admin member) {
		int current = memberService.count();
		
		
		memberService.add(member);
		
		return (memberService.count() == (current + 1))? Messenger.SUCCESS : Messenger.FAIL;
	}
	
	@PostMapping("/login")
	public Messenger login(@RequestBody Admin member) {
		System.out.println(member);
		System.out.println(memberService.login(member));
		return (memberService.login(member))? Messenger.SUCCESS : Messenger.FAIL;
	}
	
	@GetMapping("/detali")
	public Admin detail(@RequestBody String memberId) {
		Admin memberDetali = new Admin();
		memberDetali = memberService.detail(memberId);
		return memberDetali;
	}
	
	@GetMapping("/list")
	public Admin[] detail() {
		Admin[] memberlist = new Admin[5];
		return memberlist;
	}
	
	@GetMapping("/count")
	public int count() {
		
		return memberService.count();
	}
	
	
	
	@PutMapping("/update")
	public Admin update(@RequestBody Admin member) {
		Admin updteMember = new Admin();
		
		return updteMember;
	}
	
	
	@DeleteMapping("/delet")
	public void delet(Admin member) {
		memberService.delete(member);
	}
	
	
	
}
