package com.tools.bean.table;

public class SeihinMasterTBL {
	private String _id = null;
	private String _name = null;
	private int _seika = 0;
	private int _kaihatsuhi = 0;
	private int _syukahi = 0;
	private int _royarity = 0;
	private int _middlehi = 0;
	private String _order = null;
	private int _orderhonsu = 0;
	private String _oyaid = null;
	

	/**
	 * @param val
	 */
	public void setTBLData(String[] val) {
		this.set_id(val[0]);
		this.set_name(val[1]);
		this.set_seika(Integer.parseInt(val[2]));
		this.set_kaihatsuhi(Integer.parseInt(val[3]));
		this.set_syukahi(Integer.parseInt(val[4]));
		this.set_royarity(Integer.parseInt(val[5]));
		this.set_middlehi(Integer.parseInt(val[6]));
		this.set_order(val[7]);
		this.set_orderhonsu(Integer.parseInt(val[8]));
		this.set_oyaid(val[9]);
	}
	public String getTBLData() {
		String ret ="";
		ret += this.get_id()+","+this.get_name()+","+this.get_seika()+","+this.get_kaihatsuhi()+",";
		ret += this.get_syukahi()+","+this.get_middlehi()+","+this.get_order()+",";
		ret += this.get_orderhonsu()+","+this.get_oyaid();
		return ret;
	}
	/**
	 * @return _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id セットする _id
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return _name
	 */
	public String get_name() {
		return _name;
	}
	/**
	 * @param _name セットする _name
	 */
	public void set_name(String _name) {
		this._name = _name;
	}
	/**
	 * @return _kaihatsuhi
	 */
	public int get_kaihatsuhi() {
		return _kaihatsuhi;
	}
	/**
	 * @param _kaihatsuhi セットする _kaihatsuhi
	 */
	public void set_kaihatsuhi(int _kaihatsuhi) {
		this._kaihatsuhi = _kaihatsuhi;
	}
	/**
	 * @return _syukahi
	 */
	public int get_syukahi() {
		return _syukahi;
	}
	/**
	 * @param _syukahi セットする _syukahi
	 */
	public void set_syukahi(int _syukahi) {
		this._syukahi = _syukahi;
	}
	/**
	 * @return _royarity
	 */
	public int get_royarity() {
		return _royarity;
	}
	/**
	 * @param _royarity セットする _royarity
	 */
	public void set_royarity(int _royarity) {
		this._royarity = _royarity;
	}
	/**
	 * @return _middlehi
	 */
	public int get_middlehi() {
		return _middlehi;
	}
	/**
	 * @param _middlehi セットする _middlehi
	 */
	public void set_middlehi(int _middlehi) {
		this._middlehi = _middlehi;
	}
	/**
	 * @return _order
	 */
	public String get_order() {
		return _order;
	}
	/**
	 * @param _order セットする _order
	 */
	public void set_order(String _order) {
		this._order = _order;
	}
	/**
	 * @return _orderhonsu
	 */
	public int get_orderhonsu() {
		return _orderhonsu;
	}
	/**
	 * @param _orderhonsu セットする _orderhonsu
	 */
	public void set_orderhonsu(int _orderhonsu) {
		this._orderhonsu = _orderhonsu;
	}
	/**
	 * @return _oyaid
	 */
	public String get_oyaid() {
		return _oyaid;
	}
	/**
	 * @param _oyaid セットする _oyaid
	 */
	public void set_oyaid(String _oyaid) {
		this._oyaid = _oyaid;
	}
	/**
	 * @return _seika
	 */
	public int get_seika() {
		return _seika;
	}
	/**
	 * @param _seika セットする _seika
	 */
	public void set_seika(int _seika) {
		this._seika = _seika;
	}
}
