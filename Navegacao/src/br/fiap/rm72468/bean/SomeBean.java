package br.fiap.rm72468.bean;

import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SomeBean {
	public String doNavigation() {
		String[] results = { "page1", "page2", "page3" };
		try {
			int r = new Random().nextInt(1000) % 3;
			System.out.println(r);
			return results[r];
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}
}
