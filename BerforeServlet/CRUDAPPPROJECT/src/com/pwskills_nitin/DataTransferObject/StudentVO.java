package com.pwskills_nitin.DataTransferObject;

public class StudentVO {

		private String sid;
		private String sname;
		private String saddress;
		private String sage;
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSaddress() {
			return saddress;
		}
		public void setSaddress(String saddress) {
			this.saddress = saddress;
		}
		public String getSage() {
			return sage;
		}
		public void setSage(String sage) {
			this.sage = sage;
		}
		@Override
		public String toString() {
			return "StudentVO [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
		}
		
		
		
	}


