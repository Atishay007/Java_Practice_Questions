package com.atishay.practice.questions;

public class JavaEnums {

	public enum YESNOEnum {
		YES("Y"), NO("N");

		private String value;

		private YESNOEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		System.out.println(YESNOEnum.YES.getValue());
		System.out.println(YESNOEnum.values());

		// Position of Yes=0 and No=1
		System.out.println(YESNOEnum.NO.ordinal());
	}
}
