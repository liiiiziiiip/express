package com.buyer.model;

public class Order {
	private String O_id;
	private String U_id;
	private String T_id;
	private String E_id;
	private String S_phone;
	private String R_phone;
	private int price;
	private String time;
	
	public String getT_id() {
		return T_id;
	}
	public void setT_id(String t_id) {
		T_id = t_id;
	}
	public String getO_id() {
		return O_id;
	}
	public void setO_id(String o_id) {
		O_id = o_id;
	}
	public String getU_id() {
		return U_id;
	}
	public void setU_id(String u_id) {
		U_id = u_id;
	}
	public String getE_id() {
		return E_id;
	}
	public void setE_id(String e_id) {
		E_id = e_id;
	}
	public String getS_phone() {
		return S_phone;
	}
	public void setS_phone(String s_phone) {
		S_phone = s_phone;
	}
	public String getR_phone() {
		return R_phone;
	}
	public void setR_phone(String r_phone) {
		R_phone = r_phone;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [O_id=" + O_id + ", U_id=" + U_id + ", T_id=" + T_id
				+ ", E_id=" + E_id + ", S_phone=" + S_phone + ", R_phone="
				+ R_phone + ", price=" + price + "]";
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	

}
