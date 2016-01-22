package com.psl.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.bean.CheckItem;
import com.psl.bean.CheckList;
import com.psl.bean.CheckStatus;
import com.psl.bean.EventPriority;
import com.psl.bean.EventStatus;
import com.psl.bean.EventType;
import com.psl.bean.Expense;
import com.psl.bean.ExpenseType;
import com.psl.bean.Reminder;
import com.psl.bean.User;
import com.psl.service.ManagemeServiceImplementation;

@Controller
public class ManagemeControllerImplementation implements IManagemeController {

	
	private ManagemeServiceImplementation service;
	
	public ManagemeServiceImplementation getService() {
		return service;
	}

	public void setService(ManagemeServiceImplementation service) {
		this.service = service;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		 return "index";
	}
       
	@RequestMapping(value="/registerUser")
	@Override
	public String registerUser(User u) {

		/*//System.out.println("Hii");
		User u = new User("meetashay","1234","Ashay","sawant","Goregaon","Pune","DP","meetashay@live.com","7506809303");
		*/service=new ManagemeServiceImplementation();
		service.registerUser(u);
		return "dashboard";
	}

	@RequestMapping(value="/getuser")
	@Override
	public String authenticateUser(String username, String password) {
		
		service=new ManagemeServiceImplementation();
		service.authenticateUser("meetashay","1234");
		return "sucess";
	}
	

	@RequestMapping(value="/addreminder")
	@Override
	public String addReminder(@RequestParam(value = "username") String username,Reminder reminder) {

		service=new ManagemeServiceImplementation();
		service.addReminder(reminder);
		return "dashboard";
	}

	@RequestMapping(value="/getreminder",method=RequestMethod.POST)
	@Override
	public String getReminderByUsername(@RequestParam(value = "username") String username,Model model) {
		List<Reminder> list = service.getReminderByUsername(username);
		model.addAttribute("listreminder", list);
		return "dashboard";
	}

	@RequestMapping(value="/addexpense")
	@Override
	public String addExpense(@RequestParam(value = "username") String username,Expense expense) {
		
		service=new ManagemeServiceImplementation();
		service.addExpense(expense);
		return "dashboard";		
	}

	@RequestMapping(value="/getexpense")
	@Override
	public String getExpenseByUsername(@RequestParam(value = "username") String username,Model model) {
		List<Expense> list = service.getExpenseByUsername(username);
		model.addAttribute("listexpense", list);
		return "dashboard";
	}

	@RequestMapping(value="/addcheck")
	@Override
	public String addCheckList(@RequestParam(value = "username") String username,CheckList checkList) {
		service=new ManagemeServiceImplementation();
		service.addCheckList(checkList);
		return "dashboard";
	}
	
	@RequestMapping(value="/getcheck")
	@Override
	public String getCheckListByUsername(@RequestParam(value = "username") String username, Model model) {
		ManagemeServiceImplementation serv = new ManagemeServiceImplementation();
		List<CheckList> list = serv.getCheckListByUsername(username);
		model.addAttribute("listcheck", list);
		return "dashboard";
	}
	
	@RequestMapping(value="/getitembylist")
	@Override
	public String getCheckItemByCheckList(@RequestParam(value = "username") String username,@RequestParam(value = "checklist") Integer checkListId,Model model) {
		ManagemeServiceImplementation ser = new ManagemeServiceImplementation();
		List<CheckItem> list = ser.getCheckItemByList(username,checkListId);
		model.addAttribute("list", list);
		return "dashboard";
	}

	@RequestMapping(value="/getall",method=RequestMethod.POST)
	@Override
	public String getAll(@RequestParam(value = "username") String username,Model model) {
		ManagemeServiceImplementation ser = new ManagemeServiceImplementation();
		List<Expense> liste = ser.getExpenseByUsername(username);
		List<Reminder> listr = ser.getReminderByUsername(username);
		List<CheckList> listc = ser.getCheckListByUsername(username);
		
		model.addAttribute("listreminder", listr);
		model.addAttribute("listexpense", liste);
		model.addAttribute("listcheck", listc);
		return "dashboard";
	}

}
