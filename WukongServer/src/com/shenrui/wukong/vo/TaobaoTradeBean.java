package com.shenrui.wukong.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taobao_trade")
public class TaobaoTradeBean {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String buyer_id;
	private String extre;
	private double paid_fee;
	private String shop_title;
	private boolean is_eticket;
	private String create_order_time;
	private String order_id;
	private int order_status;
	private String order_type;
	private String seller_nick;
	private String AuctionInfos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getExtre() {
		return extre;
	}
	public void setExtre(String extre) {
		this.extre = extre;
	}
	public double getPaid_fee() {
		return paid_fee;
	}
	public void setPaid_fee(double paid_fee) {
		this.paid_fee = paid_fee;
	}
	public String getShop_title() {
		return shop_title;
	}
	public void setShop_title(String shop_title) {
		this.shop_title = shop_title;
	}
	public boolean isIs_eticket() {
		return is_eticket;
	}
	public void setIs_eticket(boolean is_eticket) {
		this.is_eticket = is_eticket;
	}
	public String getCreate_order_time() {
		return create_order_time;
	}
	public void setCreate_order_time(String create_order_time) {
		this.create_order_time = create_order_time;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getSeller_nick() {
		return seller_nick;
	}
	public void setSeller_nick(String seller_nick) {
		this.seller_nick = seller_nick;
	}
	public String getAuctionInfos() {
		return AuctionInfos;
	}
	public void setAuctionInfos(String auctionInfos) {
		AuctionInfos = auctionInfos;
	}
	@Override
	public String toString() {
		return "TaobaoTradeBean [id=" + id + ", buyer_id=" + buyer_id
				+ ", extre=" + extre + ", paid_fee=" + paid_fee
				+ ", shop_title=" + shop_title + ", is_eticket=" + is_eticket
				+ ", create_order_time=" + create_order_time + ", order_id="
				+ order_id + ", order_status=" + order_status + ", order_type="
				+ order_type + ", seller_nick=" + seller_nick
				+ ", AuctionInfos=" + AuctionInfos + "]";
	}
}
