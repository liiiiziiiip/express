package com.buyer.model;

public class TransportBill {
	String T_id;
	String G_name;
	String Td_start;
	String Td_end;
	int T_price;
	String T_other;
	String T_now;
	private String R_name;
	private String R_phone;
	private String S_name;
	private String S_phone;
	
	
	
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getS_phone() {
		return S_phone;
	}
	public void setS_phone(String s_phone) {
		S_phone = s_phone;
	}
	public String getR_name() {
		return R_name;
	}
	public void setR_name(String r_name) {
		R_name = r_name;
	}
	public String getR_phone() {
		return R_phone;
	}
	public void setR_phone(String r_phone) {
		R_phone = r_phone;
	}
	public String getT_id() {
		return T_id;
	}
	public void setT_id(String t_id) {
		T_id = t_id;
	}
	public String getG_name() {
		return G_name;
	}
	public void setG_name(String g_name) {
		G_name = g_name;
	}
	public String getTd_start() {
		return Td_start;
	}
	public void setTd_start(String td_start) {
		Td_start = td_start;
	}
	public String getTd_end() {
		return Td_end;
	}
	public void setTd_end(String td_end) {
		Td_end = td_end;
	}
	public int getT_price() {
		return T_price;
	}
	public void setT_price(int t_price) {
		T_price = t_price;
	}
	public String getT_other() {
		return T_other;
	}
	public void setT_other(String t_other) {
		T_other = t_other;
	}
	public String getT_now() {
		return T_now;
	}
	public void setT_now(String t_now) {
		T_now = t_now;
	}
	@Override
	public String toString() {
		return "TransportBill [T_id=" + T_id + ", G_name=" + G_name
				+ ", Td_start=" + Td_start + ", Td_end=" + Td_end
				+ ", T_price=" + T_price + ", T_other=" + T_other + ", T_now="
				+ T_now + "]";
	}
	
	public String JStoString() {
		return "{'T_id':'" + T_id + "', 'G_name':'" + G_name
				+ "', 'Td_start':'" + Td_start + "', 'Td_end':'" + Td_end
				+ "', 'T_price':'" + T_price + "', 'T_other':'" + T_other + "', 'T_now':'"
				+ T_now + "'}";
	}
	
	
	
}
