package habby.model;

import java.util.ArrayList;

import habby.controler.habbycontoller;

public class HabbyModel {
	public static HabbyModel habbyModel = new HabbyModel();
	
	public static HabbyModel getInstance(){
		return habbyModel;
	}
	
	public ArrayList<String> getHobby(String habby){
		ArrayList<String> list = new ArrayList<>();
		if(habby.equals("m")){
			list.add("설악산");
			list.add("지리산");
		}else if(habby.equals("t")){
			list.add("남해");
			list.add("북해");
		}else if(habby.equals("s")){
			list.add("오션월드");
			list.add("롯데월드");
		}else if(habby.equals("c")){
			list.add("lol");
			list.add("overwarch");
		}
		
		 return list;
	}
}
