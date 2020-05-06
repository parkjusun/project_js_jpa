package com.occamsrazor.web.item;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.occamsrazor.web.util.Data;

@Repository
public class LossDaoServiceImpl implements LossDaoService {

	@Override
	public List<Loss> selectAll() {
		List<Loss> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(Data.ADMIN_PATH.toString()+ "items.csv")));
			String message = "";
			while ((message = reader.readLine())!=null) {
				temp.add(message);
			}
			reader.close();
			
		}catch(Exception e) {
			System.out.println("에러");
			
		}
		
		Loss l = null;
		
		for(int i=0;i<temp.size();i++) {
			l= new Loss();
			String[] arr = temp.get(i).split(",");
			l.setIndex(arr[0]);
			l.setItemName(arr[1]);
			l.setItemRegisterDate(arr[2]);
			l.setClassify(arr[3]);
			l.setLocation(arr[4]);
			list.add(l);
		
		}
	

		return list;
	}

}
