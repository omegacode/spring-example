package com.omegacode.core;

import java.util.HashMap;
import java.util.Map;

import com.omegacode.core.model.Pagamento;

public class CacheService {

	private static Map<Integer, Pagamento> map;
		
	public void addCache(Integer key, Pagamento object) {
		if (map == null || map.isEmpty()) {
			map = new HashMap<Integer, Pagamento>();
		}
		map.put(key, object);
	}
	
	public Pagamento getCache(Integer key) {
		if (map != null || !map.isEmpty()) {
			return map.get(key);
		}
		return null;
	}
}
