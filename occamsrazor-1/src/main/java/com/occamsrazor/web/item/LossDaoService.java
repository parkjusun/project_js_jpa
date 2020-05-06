package com.occamsrazor.web.item;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface LossDaoService {
	public List<Loss> selectAll();

}
