package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.AllService;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class BaseAction extends ActionSupport {
	@Autowired
	private AllService allService;

	public AllService getAllService() {
		return allService;
	}

	public void setAllService(AllService allService) {
		this.allService = allService;
	}

}
